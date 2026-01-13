/**
 * 
 */
package eu.europeana.metis.ldaggregation.harvesting.dumpfile;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/**
 * @author Nuno Freire
 * @since 09/04/2025
 */
public class GzipDumpFile extends DumpFile {

  public GzipDumpFile(InputStream rawInputStream) {
    super(rawInputStream);
  }

  @Override
  public <E extends Exception> void processFiles(DumpFileConsumer<E> consumer) throws E, IOException {
    consumer.accept(new GZIPInputStream(rawInputStream));
  }

}
