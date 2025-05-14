/**
 * 
 */
package eu.europeana.metis.ldaggregation.harvesting.dumpfile;

import eu.europeana.metis.ldaggregation.segmenter.EdmRecordSegmenter.WritableRecord;
import java.io.InputStream;

/**
 * Implementations of this interface can consume segmented records from the segmenter.
 *
 * @author Nuno Freire
 * @param <E> Exception type to throw.
 */
public interface DumpFileConsumer<E extends Exception> {

    enum DumpFileResult {CONTINUE, TERMINATE}

    /**
     * Processes the data.
     *
     * @param record The record.
     * @return Whether to continue segmenting, or terminate the operation.
     * @throws E In case there was an issue with processing the data.
     */
    DumpFileResult accept(InputStream record) throws E;
}

