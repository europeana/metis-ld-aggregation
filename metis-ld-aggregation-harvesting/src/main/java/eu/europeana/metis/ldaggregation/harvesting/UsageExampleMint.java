package eu.europeana.metis.ldaggregation.harvesting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import eu.europeana.metis.harvesting.HarvesterException;

public class UsageExampleMint {

  public static void main(String[] args) throws IOException, HarvesterException {

    final String datasetUri = "https://mint-projects.image.ntua.gr/museu/api/dcat/Dataset?organizationId=1187&target=museu.europeana";

    final String sparqlEndpointUrl = null;
    final Path downloadFile = Files.createTempFile("edm-dump-download", ".zip");

    HarvestLDFromEndpoint.main(new String[] { sparqlEndpointUrl, datasetUri, downloadFile.toString() });

  }
}
