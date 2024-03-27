package eu.europeana.metis.ldaggregation.harvesting;

import eu.europeana.metis.harvesting.FullRecordHarvestingIterator;
import eu.europeana.metis.harvesting.HarvesterException;
import eu.europeana.metis.harvesting.HarvesterIOException;
import eu.europeana.metis.harvesting.ReportingIteration.IterationResult;
import eu.europeana.metis.ldaggregation.harvesting.LDHarvester.LDRecord;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class UsageExample {

  public static void main(String[] args) throws IOException, HarvesterException {
    final String datasetUri = "https://archief.nl/id/dataset/foto/2-10-62ntfoto";
    final String sparqlEndpointUrl = "https://triplestore.netwerkdigitaalerfgoed.nl/repositories/registry";
    final Path downloadFile = Files.createTempFile("edm-dump-download", ".zip");
    try (final ZipOutputStream zos = new ZipOutputStream(Files.newOutputStream(downloadFile));
        final FullRecordHarvestingIterator<LDRecord, LDRecord> harvestingIterator = new LDHarvester().harvest(
            datasetUri, sparqlEndpointUrl)) {
      System.out.println("Harvesting " + harvestingIterator.countRecords() + " records.");
      harvestingIterator.forEach(record -> {
        try {
          final String fileName = URLEncoder.encode(record.getHarvestingIdentifier());
          zos.putNextEntry(new ZipEntry(fileName + ".rdf"));
          record.writeContent(zos);
          zos.closeEntry();
        } catch (IOException e) {
          throw new HarvesterIOException("Could not add to zip file.", e);
        }
        return IterationResult.CONTINUE;
      });
      zos.flush();
    }
    System.out.println("EDM dump file downloaded to :" + downloadFile);
  }
}
