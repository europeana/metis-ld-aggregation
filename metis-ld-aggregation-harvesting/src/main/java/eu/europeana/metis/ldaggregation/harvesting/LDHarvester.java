package eu.europeana.metis.ldaggregation.harvesting;

import eu.europeana.metis.harvesting.FullRecord;
import eu.europeana.metis.harvesting.FullRecordHarvestingIterator;
import eu.europeana.metis.harvesting.HarvesterException;
import eu.europeana.metis.harvesting.ReportingIteration;
import eu.europeana.metis.harvesting.ReportingIteration.IterationResult;
import eu.europeana.metis.ldaggregation.datasetloader.DatasetLoader;
import eu.europeana.metis.ldaggregation.datasetloader.DatasetLoaderException;
import eu.europeana.metis.ldaggregation.harvesting.dumpfile.DumpFile;
import eu.europeana.metis.ldaggregation.harvesting.dumpfile.DumpFileConsumer.DumpFileResult;
import eu.europeana.metis.ldaggregation.segmenter.EdmRecordSegmenter;
import eu.europeana.metis.ldaggregation.segmenter.EdmRecordSegmenter.RecordConsumer.SegmentationResult;
import eu.europeana.metis.ldaggregation.segmenter.EdmRecordSegmenter.WritableRecord;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Instant;
import java.util.Optional;
import java.util.function.Predicate;
import org.apache.jena.riot.Lang;

public class LDHarvester {


  public FullRecordHarvestingIterator<LDRecord, LDRecord> harvest(String datasetUri,
      String sparqlEndpointUrl) throws HarvesterException {
    final EdmRecordSegmenter segmenter = new EdmRecordSegmenter();
    try {
      new DatasetLoader().loadDataset(datasetUri, sparqlEndpointUrl,
          (rawInputStream, dataLanguage, packageFormat, compressFormat) -> {
            try {
              DumpFile dumpFile = DumpFile.fromDistribution(rawInputStream, dataLanguage, packageFormat, compressFormat);
              dumpFile.processFiles(rdfInputStream -> {
                segmenter.addData(rdfInputStream, dataLanguage);
                return DumpFileResult.CONTINUE;
              });
            } catch (Exception e) {
              throw new DatasetLoaderException(String
                  .format("Issue occurred while attempting to harvest dataset: %s from server: %s",
                      datasetUri, sparqlEndpointUrl), e);
            }
          });
    } catch (DatasetLoaderException e) {
      segmenter.close();
      throw new HarvesterException("Could not load the data from the distribution.", e);
    }
    return new LDHarvestingIterator(segmenter);
  }

  private record LDHarvestingIterator(EdmRecordSegmenter segmenter)
      implements FullRecordHarvestingIterator<LDRecord, LDRecord> {

    @Override
    public void forEachFiltered(ReportingIteration<LDRecord> action, Predicate<LDRecord> filter)
        throws HarvesterException {
      segmenter.segment(segmentedRecord -> {
        try {
          final LDRecord record = new LDRecord(segmentedRecord);
          if (!filter.test(record)) {
            return SegmentationResult.TERMINATE;
          }
          final IterationResult result = action.process(record);
          return result == IterationResult.TERMINATE ? SegmentationResult.TERMINATE
              : SegmentationResult.CONTINUE;
        } catch (IOException e) {
          throw new HarvesterException(
              "Problem while processing: " + segmentedRecord.getRecordURI(), e);
        }
      });
    }

    @Override
    public void forEachNonDeleted(ReportingIteration<LDRecord> reportingIteration)
        throws HarvesterException {
      forEach(reportingIteration);
    }

    @Override
    public Integer countRecords() {
      return segmenter.countRecords();
    }

    @Override
    public void close() {
      segmenter.close();
    }
  }

  public record LDRecord (WritableRecord writableRecord) implements FullRecord {

    @Override
    public void writeContent(OutputStream outputStream) throws IOException {
      writableRecord.write(outputStream);
    }

    @Override
    public InputStream getContent() throws IOException {
      ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
      this.writeContent(outputStream);
      return new ByteArrayInputStream(outputStream.toByteArray());
    }

    @Override
    public boolean isDeleted() {
      return false;
    }

    @Override
    public String getHarvestingIdentifier() {
      return writableRecord.getRecordURI();
    }

    @Override
    public Instant getTimeStamp() {
      return null;
    }
  }
}
