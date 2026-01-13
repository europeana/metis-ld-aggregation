package eu.europeana.metis.ldaggregation.harvesting;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import eu.europeana.metis.harvesting.FullRecordHarvestingIterator;
import eu.europeana.metis.harvesting.HarvesterException;
import eu.europeana.metis.harvesting.ReportingIteration.IterationResult;
import eu.europeana.metis.ldaggregation.harvesting.LDHarvester.LDRecord;

public class HarvestLDFromEndpoint {

  public static void main(String[] args) throws IOException, HarvesterException {

    // Get the input
    if (args.length < 3) {
      System.out.println("Please provide a SPARQL endpoint URL, dataset ID and destination file as parameters.");
      return;
    }
    final String sparqlEndpoint = args[0];
    final String datasetId = args[1];
    final Path outputFile = Path.of(args[2]).toAbsolutePath();
    System.out.println("Starting harvest:");
    System.out.println("  SPARQL endpoint: " + sparqlEndpoint);
    System.out.println("  Dataset ID: " + datasetId);
    System.out.println("  Destination file: " + outputFile);

    // Actual processing
    try (final ZipOutputStream zos = new ZipOutputStream(Files.newOutputStream(outputFile));
        final FullRecordHarvestingIterator<LDRecord, LDRecord> harvestingIterator = new LDHarvester().harvest(datasetId,
            sparqlEndpoint)) {
      System.out.println("... Harvesting " + harvestingIterator.countRecords() + " records.");
      harvestingIterator.forEach(record -> {
        try {
          final String fileName = URLEncoder.encode(record.getHarvestingIdentifier(), StandardCharsets.UTF_8);
          zos.putNextEntry(new ZipEntry(fileName + ".rdf"));
          record.writeContent(zos);
          zos.closeEntry();
        } catch (IOException e) {
          throw new IOException("Could not add to zip file.", e);
        }
        return IterationResult.CONTINUE;
      });
      zos.flush();
    }
    System.out.println("... Harvesting complete.");
  }
}
