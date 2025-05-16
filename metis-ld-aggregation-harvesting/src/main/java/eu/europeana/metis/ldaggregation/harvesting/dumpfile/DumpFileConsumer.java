/**
 * 
 */
package eu.europeana.metis.ldaggregation.harvesting.dumpfile;

import java.io.InputStream;

/**
 * Implementations of this interface can consume the individual files that are
 * contained in a dump file.
 *
 * @author Nuno Freire
 * @param <E> Exception type to throw.
 */
public interface DumpFileConsumer<E extends Exception> {

  enum DumpFileResult {
    CONTINUE, TERMINATE
  }

  /**
   * Processes the data.
   *
   * @param record The record.
   * @return Whether to continue segmenting, or terminate the operation.
   * @throws E In case there was an issue with processing the data.
   */
  DumpFileResult accept(InputStream record) throws E;
}
