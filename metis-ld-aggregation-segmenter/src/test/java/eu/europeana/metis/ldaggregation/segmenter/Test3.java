/**
 * 
 */
package eu.europeana.metis.ldaggregation.segmenter;

import eu.europeana.metis.ldaggregation.segmenter.aggregation.EdmRecordSegmenter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.io.IOUtils;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.riot.Lang;

/**
 * @author Hugo
 * @since 21 Feb 2024
 */
public class Test3
{
    private static Model load(File zipFile) throws IOException {
        Model model = ModelFactory.createDefaultModel();
        ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFile));
        try {
            ZipEntry ze;
            InputStream is = new FilterInputStream(zis) {
                @Override
                public void close() {}
            };
            while ( (ze = zis.getNextEntry()) != null )
            {
                model.read(is, "", "RDF/XML");
                zis.closeEntry();
            }
        }
        finally {
            IOUtils.closeQuietly(zis);
        }
        return model;
    }

    public static final void main(String[] args) throws IOException {
        File dir = new File("C:\\Work\\incoming\\ld-aggregation\\");
        
        File src  = new File(dir, "data\\08614.zip");
        File dst = new File(dir, "result\\08614.zip");
        Model model = load(src);
        EdmRecordSegmenter segmenter = new EdmRecordSegmenter();
        segmenter.segmentToZip(model, dst, Lang.RDFXML);
    }

}
