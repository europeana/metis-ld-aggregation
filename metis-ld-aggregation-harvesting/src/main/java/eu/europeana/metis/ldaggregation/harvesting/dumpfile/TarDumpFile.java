/**
 * 
 */
package eu.europeana.metis.ldaggregation.harvesting.dumpfile;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.io.IOUtils;

/**
 * @author Nuno Freire
 * @since 09/04/2025
 */
public class TarDumpFile extends DumpFile {

  public TarDumpFile(InputStream rawInputStream, boolean isGzip) throws IOException {
    super(isGzip ? new GZIPInputStream(rawInputStream) : rawInputStream);
  }

  @Override
  public <E extends Exception> void processFiles(DumpFileConsumer<E> consumer) throws E, IOException {
    try (BufferedInputStream inputStream = new BufferedInputStream(rawInputStream);
        TarArchiveInputStream tar = new TarArchiveInputStream(inputStream)) {
          ArchiveEntry entry; 
          while ((entry = tar.getNextEntry()) != null) {
            if(!entry.isDirectory()) {
              byte[] byteArray = IOUtils.toByteArray(tar);
              try(ByteArrayInputStream fileIs=new ByteArrayInputStream(byteArray)){
                consumer.accept(fileIs);
              }
            }
          }
      }
  }

}
