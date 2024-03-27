/**
 * 
 */
package eu.europeana.metis.ldaggregation.segmenter;

import eu.europeana.metis.ldaggregation.segmenter.aggregation.EdmRecordSegmenter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.riot.Lang;

/**
 * @author Hugo
 * @since 21 Feb 2024
 */
public class Test2
{
    public static final void main(String[] args) throws IOException {
        File dir = new File("C:\\Work\\incoming\\ld-aggregation\\");
        
        File src  = new File(dir, "data\\2-10-62ntfoto.rdf");
        File dst = new File(dir, "result\\dataset.zip");
        Model model = ModelFactory.createDefaultModel();
        model.read(new FileReader(src), "", "RDF/XML");

        EdmRecordSegmenter segmenter = new EdmRecordSegmenter();
        segmenter.segmentToZip(model, dst, Lang.RDFXML);
    }

}
