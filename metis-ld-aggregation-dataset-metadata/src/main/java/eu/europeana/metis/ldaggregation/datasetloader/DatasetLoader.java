package eu.europeana.metis.ldaggregation.datasetloader;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFLanguages;

import eu.europeana.metis.ldaggregation.acquisition.http.AccessException;
import eu.europeana.metis.ldaggregation.acquisition.http.HttpRequest;
import eu.europeana.metis.ldaggregation.acquisition.http.HttpUtil;

/**
 * This class loads dataset content from remote resources.
 */
public class DatasetLoader {

  /**
   * This method harvests content from a SPARQL endpoint, or from a directly from a resolvable dataset URI.
   *
   * @param datasetUri        The dataset URI
   * @param sparqlEndpointUrl The endpoint URL (may be null if the dataset URI is resolvable)
   * @param consumer          The callback for receiving the content.
   * @param <E>               The type of the exception thrown by the callback function.
   * @throws E                      In case an issue occurred in the callback function.
   * @throws DatasetLoaderException In case an issue occurred loading the dataset.
   */
  public <E extends Exception> void loadDataset(String datasetUri,
      String sparqlEndpointUrl, DataConsumer<E> consumer) throws E, DatasetLoaderException {
    try {
      final DatasetDescription dsDesc;
      if(StringUtils.isEmpty(sparqlEndpointUrl))
        dsDesc = new DatasetDescription(datasetUri);
      else
        dsDesc = new DatasetDescription(datasetUri, sparqlEndpointUrl);
      loadDataset(dsDesc, consumer);
    } catch (AccessException | InterruptedException | IOException e) {
      throw new DatasetLoaderException(String
          .format("Issue occurred while attempting to harvest dataset: %s from server: %s",
              datasetUri, sparqlEndpointUrl), e);
    }
  }

  
  /**
   * This method harvests content from a directly from a dataset description.
   *
   * @param dsDesc            The dataset description
   * @param consumer          The callback for receiving the content.
   * @param <E>               The type of the exception thrown by the callback function.
   * @throws E                      In case an issue occurred in the callback function.
   * @throws DatasetLoaderException In case an issue occurred loading the dataset.
   */
  protected <E extends Exception> void loadDataset(DatasetDescription dsDesc,
      DataConsumer<E> consumer) throws E, DatasetLoaderException {
    try {
      for (Distribution dist : dsDesc.getDistributions()) {
        if (dist.isConformingEdm()) {
          List<String> downloadUrls = dist.getDownloadUrls();
          if (!downloadUrls.isEmpty()) {
            for(String url : downloadUrls) {
              final HttpRequest request = HttpUtil.makeRequest(url);
              request.fetchStream();
              try (InputStream asStream = request.getContent().asStream()) {
                Lang rdfLang = RDFLanguages.contentTypeToLang(request.getResponseContentType());
                if(rdfLang==null)
                  rdfLang=RDFLanguages.contentTypeToLang(dist.getMediaType().getMimeTypeString());
                consumer.accept(asStream, rdfLang, dist.getPackageFormat(), dist.getCompressFormat());
              }
            };
            
          }
        }
      }
    } catch (AccessException | InterruptedException | UnsupportedMimeTypeException |IOException e) {
      throw new DatasetLoaderException(String
          .format("Issue occurred while attempting to harvest dataset: %s",
              dsDesc.getUri()), e);
    }
  }
  
  
  /**
   * Implementations of this interface can consume data from an LD service.
   *
   * @param <E> Exception type to throw.
   */
  public interface DataConsumer<E extends Exception> {

    /**
     * Processes the data.
     *
     * @param inputStream  The data. Calling code will take care of closing the stream (immediately
     *                     after this method returns).
     * @param dataLanguage The data format of the data.
     * @throws E In case there was an issue with processing the data.
     */
    void accept(InputStream inputStream, Lang mediaType, MimeType packageFormat, MimeType compressFormat) throws E;
  }
}
