package eu.europeana.metis.ldaggregation.harvesting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import eu.europeana.metis.harvesting.HarvesterException;

public class UsageExample {

  public static void main(String[] args) throws IOException, HarvesterException {

//    final String datasetUri = "https://archief.nl/id/dataset/foto/2-10-62ntfoto";
//    final String datasetUri = "https://archief.nl/id/dataset/foto/2-24-01-07ntfoto";
    final String datasetUri = "https://archief.nl/id/dataset/foto/2-24-26ntfoto";
//    final String datasetUri = "https://archief.nl/id/dataset/foto/2-24-14-02ntfoto";
//    final String datasetUri = "https://archief.nl/id/dataset/foto/2-24-01-04ntfoto";
//    final String datasetUri = "https://archief.nl/id/dataset/foto/2-24-01-05ntfoto";

    final String sparqlEndpointUrl = "https://triplestore.netwerkdigitaalerfgoed.nl/repositories/registry";
    final Path downloadFile = Files.createTempFile("edm-dump-download", ".zip");

    HarvestLDFromEndpoint.main(new String[] { sparqlEndpointUrl, datasetUri, downloadFile.toString() });
  }
}
