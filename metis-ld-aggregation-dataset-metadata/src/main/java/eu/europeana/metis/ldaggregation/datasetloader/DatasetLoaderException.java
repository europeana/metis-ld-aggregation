package eu.europeana.metis.ldaggregation.datasetloader;

/**
 * Exception representing an issue with loading datasets.
 */
public class DatasetLoaderException extends Exception {

  public DatasetLoaderException(String message) {
    super(message);
  }

  public DatasetLoaderException(String message, Throwable cause) {
    super(message, cause);
  }
}
