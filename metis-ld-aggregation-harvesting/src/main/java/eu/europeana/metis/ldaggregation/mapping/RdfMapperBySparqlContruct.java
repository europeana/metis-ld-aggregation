/**
 * 
 */
package eu.europeana.metis.ldaggregation.mapping;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.Duration;
import java.time.Instant;
import java.util.Locale;

import org.apache.commons.io.FileUtils;
import org.apache.jena.query.Dataset;
import org.apache.jena.query.DatasetFactory;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryParseException;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.riot.Lang;

/**
 * @author Nuno Freire
 * @since 11/04/2025
 */
public class RdfMapperBySparqlContruct {

  Model sourceModel;
  String query;
  Dataset dataset;

  public RdfMapperBySparqlContruct(Model sourceModel, String query) {
    super();
    this.sourceModel = sourceModel;
    this.query = query;
  }

  public Model convert() throws QueryParseException {
    dataset = DatasetFactory.create(sourceModel);
    try (QueryExecution qexec = QueryExecutionFactory.create(query, dataset)) {
      Model resultModel = qexec.execConstruct();
      return resultModel;
    }
  }

  public static void main(String[] args) throws Exception {
    String query = FileUtils.readFileToString(
        new File("C:\\Users\\nfrei\\Desktop\\data\\sparql-construct\\nafotos2edm.rq"), StandardCharsets.UTF_8);
//    File sourceRdf=new File("C:\\Users\\nfrei\\Desktop\\data\\sparql-construct\\2-10-62ntfoto.nt");//small dataset
//    File sourceRdf=new File("C:\\Users\\nfrei\\Desktop\\data\\sparql-construct\\2-24-06-02ntfoto.nt");//250Mb dataset
    File sourceRdf = new File("C:\\Users\\nfrei\\Desktop\\data\\sparql-construct\\2-24-01-04ntfoto.nt");// 600Mb dataset
//    File sourceRdf=new File("C:\\Users\\nfrei\\Desktop\\data\\sparql-construct\\7-000spaondntfoto.2.nt");//huge dataset

    int mb = 1024 * 1024;
    DecimalFormat ROUNDED_DOUBLE_DECIMALFORMAT = new DecimalFormat("####0.00",
        new DecimalFormatSymbols(Locale.ENGLISH));

    System.out.println("Dataset file size: " + ROUNDED_DOUBLE_DECIMALFORMAT.format(sourceRdf.length() / mb));

    Instant start = Instant.now();

    Model sourceModel = ModelFactory.createDefaultModel();
    sourceModel.read(new FileInputStream(sourceRdf), null, Lang.NTRIPLES.getLabel());

    System.out.println(ROUNDED_DOUBLE_DECIMALFORMAT
        .format((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / mb));

    Instant startQuery = Instant.now();

    Model edmModel = new RdfMapperBySparqlContruct(sourceModel, query).convert();
    System.out.println("Resulting model triples: "+edmModel.listStatements().toList().size());

    Instant end = Instant.now();

    System.out.println(ROUNDED_DOUBLE_DECIMALFORMAT
        .format((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / mb));
    Duration duration = Duration.between(startQuery, end);
    System.out.println(duration);

  }

}
