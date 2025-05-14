package eu.europeana.metis.ldaggregation.harvesting;

import eu.europeana.metis.harvesting.FullRecordHarvestingIterator;
import eu.europeana.metis.harvesting.HarvesterException;
import eu.europeana.metis.harvesting.ReportingIteration.IterationResult;
import eu.europeana.metis.ldaggregation.harvesting.LDHarvester.LDRecord;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class UsageExampleMint {

  public static void main(String[] args) throws IOException, HarvesterException {

    final String datasetUri = "https://mint-projects.image.ntua.gr/museu/api/dcat/Dataset?organizationId=1187&target=museu.europeana";

    final String sparqlEndpointUrl = null;
    final Path downloadFile = Files.createTempFile("edm-dump-download", ".zip");

    HarvestLDFromEndpoint.main(new String[]{sparqlEndpointUrl, datasetUri, downloadFile.toString()});
    
  }
}
