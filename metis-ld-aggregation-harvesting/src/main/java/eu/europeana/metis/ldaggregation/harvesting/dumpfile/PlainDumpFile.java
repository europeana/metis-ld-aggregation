/**
 * 
 */
package eu.europeana.metis.ldaggregation.harvesting.dumpfile;

import java.io.InputStream;

/**
 * A dump file (such as a.rdf file with RDF/XML) that is not compressed or packeged
 * 
 * @author Nuno Freire
 * @since 09/04/2025
 */
public class PlainDumpFile extends DumpFile {

  public PlainDumpFile(InputStream rawInputStream) {
    super(rawInputStream);
  }

  @Override
  public <E extends Exception> void processFiles(DumpFileConsumer<E> consumer) throws E {
    consumer.accept(rawInputStream);
  }

}
