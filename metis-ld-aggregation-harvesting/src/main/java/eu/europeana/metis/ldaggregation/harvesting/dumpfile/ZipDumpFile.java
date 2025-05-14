/**
 * 
 */
package eu.europeana.metis.ldaggregation.harvesting.dumpfile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.io.IOUtils;

/**
 * @author Nuno Freire
 * @since 09/04/2025
 */
public class ZipDumpFile extends DumpFile {

  public ZipDumpFile(InputStream rawInputStream) {
    super(rawInputStream);
  }
  
  @Override
  public <E extends Exception> void processFiles(DumpFileConsumer<E> consumer) throws E, IOException {
    ZipInputStream zipIs=new ZipInputStream(rawInputStream);
    ZipEntry zipEntry = zipIs.getNextEntry();
    while (zipEntry!=null) {
      if(!zipEntry.isDirectory()) {
        byte[] byteArray = IOUtils.toByteArray(zipIs);
        try(ByteArrayInputStream fileIs=new ByteArrayInputStream(byteArray)){
          consumer.accept(fileIs);
        }
      }
      zipEntry = zipIs.getNextEntry();
    }
  }

}
