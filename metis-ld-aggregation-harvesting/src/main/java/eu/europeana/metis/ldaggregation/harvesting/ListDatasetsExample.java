package eu.europeana.metis.ldaggregation.harvesting;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import eu.europeana.metis.ldaggregation.acquisition.rdf.SparqlClient;

public class ListDatasetsExample {

  public static void main(String[] args) {

    final SparqlClient client = new SparqlClient("https://triplestore.netwerkdigitaalerfgoed.nl/repositories/registry",
        Map.of("dcat", "http://www.w3.org/ns/dcat#", "dct", "http://purl.org/dc/terms/", "foaf",
            "http://xmlns.com/foaf/0.1/"));
    final String query = """
        SELECT * WHERE {
            ?dataset dct:title ?dataset_title ;
                     dct:publisher <https://www.nationaalarchief.nl> ;
                     dcat:distribution ?distribution .
            ?distribution dct:conformsTo <http://www.europeana.eu/schemas/edm/> ;
                          dct:license <http://creativecommons.org/publicdomain/zero/1.0/> ;
                          dcat:downloadURL ?distribution_download ;
                          dct:format ?distribution_format ;
                          dcat:mediaType ?distribution_mediatype ;
                          dcat:byteSize ?distribution_size ;
                          dct:created ?distribution_created .
        }""";
    AtomicInteger counter = new AtomicInteger();
    client.query(query, solution -> {
      System.out.println("Dataset: " + solution.get("dataset_title"));
      System.out.println("  ID: " + solution.get("dataset"));
      System.out.println("  Created: " + solution.getLiteral("distribution_created").getValue());
      System.out.println("  Approx. size: " + ((Integer) solution.getLiteral("distribution_size").getValue()) / 1600);
      counter.getAndIncrement();

//      System.out.println("Result:" + counter.get());
//      solution.varNames().forEachRemaining(varName ->
//          System.out.println("   " + varName + ": " + solution.get(varName)));

      return true;
    });
    System.out.println();
    System.out.println("Datasets found: " + counter.get());
  }
}
