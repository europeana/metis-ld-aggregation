/**
 * 
 */
package eu.europeana.metis.ldaggregation.datasetloader;

/**
 * An unsupported or invalid mime type was given as input
 * 
 * @author Nuno Freire
 * @since 09/04/2025
 */
@SuppressWarnings("serial")
public class UnsupportedMimeTypeException extends Exception {

  public UnsupportedMimeTypeException() {
    super();
  }

  public UnsupportedMimeTypeException(String message, Throwable cause) {
    super(message, cause);
  }

  public UnsupportedMimeTypeException(String message) {
    super(message);
  }

  public UnsupportedMimeTypeException(Throwable cause) {
    super(cause);
  }
   
}
