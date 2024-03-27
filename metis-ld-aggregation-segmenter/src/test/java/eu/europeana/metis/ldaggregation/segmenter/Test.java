/**
 * 
 */
package eu.europeana.metis.ldaggregation.segmenter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;

/**
 * @author Hugo
 * @since 14 Feb 2024
 */
public class Test
{
    private Query query;

    public void loadQuery(File file) throws IOException {
        String queryString = FileUtils.readFileToString(file);
        query = QueryFactory.create(queryString);
    }

    public void convert(File in, File out) throws IOException {
        
        Model model = ModelFactory.createDefaultModel();
        model.read(new FileReader(in), "", "RDF/XML");
        QueryExecution qexec = QueryExecutionFactory.create(query, model) ;
        Model resultModel = qexec.execConstruct();
        qexec.close();

        FileWriter writer = new FileWriter(out);
        resultModel.write(writer);
        writer.flush();
        writer.close();
    }

    public static final void main(String[] args) throws IOException {
        File dir = new File("C:\\Work\\incoming\\ld-aggregation\\");
        Test test = new Test();
        test.loadQuery(new File(dir, "conversion\\nafotos2edm.rq"));
        test.convert(
                new File(dir, "data\\test.xml"), 
                new File(dir, "result\\NL-HaNA_2-10-62ntfoto_0bc23fe5-379b-2c33-d3b5-ba2ab391cd47.xml"));
    }
}
