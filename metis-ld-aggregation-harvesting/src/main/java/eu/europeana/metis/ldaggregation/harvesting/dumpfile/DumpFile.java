/**
 * 
 */
package eu.europeana.metis.ldaggregation.harvesting.dumpfile;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

import org.apache.jena.riot.Lang;

import eu.europeana.metis.ldaggregation.datasetloader.MimeType;
import eu.europeana.metis.ldaggregation.datasetloader.UnsupportedMimeTypeException;

/**
 * Abstract class for dump files. subclasses contain the implementation for
 * handling the particular package and compression formats
 * 
 * @author Nuno Freire
 * @since 09/04/2025
 */
public abstract class DumpFile {

  private static final Lang DEFAULT_LANG = Lang.RDFXML;

  protected InputStream rawInputStream;

  public DumpFile(InputStream rawInputStream) {
    super();
    this.rawInputStream = rawInputStream;
  }

  public abstract <E extends Exception> void processFiles(DumpFileConsumer<E> consumer) throws E, IOException;

  public static DumpFile fromDistribution(InputStream inputStream, Lang dataLanguage, MimeType packageFormat,
      MimeType compressFormat) throws UnsupportedMimeTypeException, IOException {
    if (dataLanguage == null) {
      System.out.println("No language could be inferred from the content type. Assuming "
          + DEFAULT_LANG.getContentType().getContentTypeStr() + ".");
    }
    final Lang dataLanguageNotNull = Optional.ofNullable(dataLanguage).orElse(DEFAULT_LANG);
    if (compressFormat == null) {
      if (packageFormat == null)
        return new PlainDumpFile(inputStream);
      else if (packageFormat == MimeType.ZIP) {
        return new ZipDumpFile(inputStream);
      } else if (packageFormat == MimeType.TAR) {
        return new TarDumpFile(inputStream, false);
      } else
        throw new UnsupportedMimeTypeException("Package format not supported: " + packageFormat);
    } else if (compressFormat == MimeType.ZIP) {
      return new ZipDumpFile(inputStream);
    } else if (compressFormat == MimeType.GZIP) {
      if (packageFormat == null) {
        return new GzipDumpFile(inputStream);
      } else if (packageFormat == MimeType.TAR) {
        return new TarDumpFile(inputStream, true);
      } else
        throw new UnsupportedMimeTypeException(
            "Package\\compress format not supported: " + packageFormat + " " + compressFormat);
    }
    throw new UnsupportedMimeTypeException("Compress format not supported: " + compressFormat);
  }
}
