package eu.europeana.metis.ldaggregation.datasetloader;

import eu.europeana.metis.ldaggregation.acquisition.http.AccessException;
import eu.europeana.metis.ldaggregation.acquisition.http.HttpRequest;
import eu.europeana.metis.ldaggregation.acquisition.http.HttpUtil;
import java.io.IOException;
import java.io.InputStream;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFLanguages;

/**
 * This class loads dataset content from remote resources.
 */
public class DatasetLoader {

  /**
   * This method harvests content from a SPARQL endpoint.
   *
   * @param datasetUri        The dataset ID at source
   * @param sparqlEndpointUrl The endpoint URL
   * @param consumer          The callback for receiving the content.
   * @param <E>               The type of the exception thrown by the callback function.
   * @throws E                      In case an issue occurred in the callback function.
   * @throws DatasetLoaderException In case an issue occurred loading the dataset.
   */
  public <E extends Exception> void loadDatasetFromSparqlEndpoint(String datasetUri,
      String sparqlEndpointUrl, DataConsumer<E> consumer) throws E, DatasetLoaderException {
    try {
      final DatasetDescription dsDesc = new DatasetDescription(datasetUri, sparqlEndpointUrl);
      for (Distribution dist : dsDesc.getDistributions()) {
        if (dist.isConformingEdm()) {
          String downloadUrl = dist.getDownloadUrl();
          if (downloadUrl != null) {
            final HttpRequest request = HttpUtil.makeRequest(downloadUrl);
            request.fetchStream();
            try (InputStream asStream = request.getContent().asStream()) {
              final Lang rdfLang = RDFLanguages.contentTypeToLang(request.getResponseContentType());
              consumer.accept(asStream, rdfLang);
            }
          }
        }
      }
    } catch (AccessException | InterruptedException | IOException e) {
      throw new DatasetLoaderException(String
          .format("Issue occurred while attempting to harvest dataset: %s from server: %s",
              datasetUri, sparqlEndpointUrl), e);
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
    void accept(InputStream inputStream, Lang dataLanguage) throws E;
  }
}
