package eu.europeana.metis.ldaggregation.datasetloader;

/**
 * Exception representing an issue with loading datasets.
 */
public class DatasetLoaderException extends Exception {

  private static final long serialVersionUID = 1L;

  public DatasetLoaderException(String message) {
    super(message);
  }

  public DatasetLoaderException(String message, Throwable cause) {
    super(message, cause);
  }
}
