package eu.europeana.metis.ldaggregation.segmenter;

import eu.europeana.metis.ldaggregation.segmenter.EdmRecordSegmenter.RecordConsumer.SegmentationResult;
import eu.europeana.metis.ldaggregation.segmenter.api.record.io.xml.EdmXmlStreamWriter;
import eu.europeana.metis.ldaggregation.segmenter.jena.edm.EDM;
import eu.europeana.metis.ldaggregation.segmenter.jena.edm.ORE;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.xml.stream.XMLStreamException;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.riot.Lang;
import org.apache.jena.vocabulary.RDF;

/**
 * Algorithm: performs a deep copy from the CHO until it ends or finds another
 * CHO. It detects cycles and covers both EDM internal and external.
 *
 * @author Hugo, Jochen
 * @since 21 Feb 2024
 */
public class EdmRecordSegmenter implements Closeable {

    private static final EdmXmlStreamWriter writer = new EdmXmlStreamWriter();

    private final Model datasetModel;

    /**
     * Implementations of this interface can consume segmented records from the segmenter.
     *
     * @param <E> Exception type to throw.
     */
    public interface RecordConsumer<E extends Exception> {

        enum SegmentationResult {CONTINUE, TERMINATE}

        /**
         * Processes the data.
         *
         * @param record The record.
         * @return Whether to continue segmenting, or terminate the operation.
         * @throws E In case there was an issue with processing the data.
         */
        SegmentationResult accept(WritableRecord record) throws E;
    }

    /**
     * Implementations of this interface are records that can be written to an output stream.
     */
    public interface WritableRecord {

        /**
         * @return The unique ID of this record.
         */
        String getRecordURI();

        /**
         * Write the record to an output stream.
         *
         * @throws IOException In case something went wrong while writing to the stream.
         */
        void write(OutputStream outputStream) throws IOException;
    }

    private record WritableRecordFromModel(Resource record) implements WritableRecord {

        @Override
        public String getRecordURI() {
            return record.getURI();
        }

        @Override
        public void write(OutputStream outputStream) throws IOException {
            try {
                writer.write(record.getModel(), outputStream);
            } catch (XMLStreamException e) {
                throw new IOException("Could not write record.", e);
            }
        }
    }

    public EdmRecordSegmenter() {
        datasetModel = ModelFactory.createDefaultModel();
    }

    public void addData(InputStream inputStream, Lang dataLanguage) {
        datasetModel.read(inputStream, "", dataLanguage.getLabel());
    }

    @Override
    public void close() {
        datasetModel.close();
    }

    public int countRecords() {
        final AtomicInteger counter = new AtomicInteger();
        datasetModel.listResourcesWithProperty(RDF.type, EDM.ProvidedCHO)
            .forEach(providedCHO -> counter.incrementAndGet());
        return counter.get();
    }

    public <E extends Exception> void segment(RecordConsumer<E> consumer) throws E {

        // Iterate over the ProvidedCHO resources to extract the records.
        final Map<String,String> prefixes = datasetModel.getNsPrefixMap();
        final ResIterator iterator = datasetModel.listResourcesWithProperty(RDF.type, EDM.ProvidedCHO);
        try {
            while (iterator.hasNext()) {

                // Create a model for the record.
                final Model recordModel = ModelFactory.createDefaultModel();
                try {

                    // Set to keep track of what has been processed - avoiding cycles.
                    final Set<Resource> handled = new HashSet<>();

                    // Copy in the various parts.
                    final Resource providedCHO = iterator.next();
                    recordModel.setNsPrefixes(prefixes);
                    copy(providedCHO, handled, recordModel);
                    copy(datasetModel.listResourcesWithProperty(EDM.aggregatedCHO, providedCHO),
                        handled, recordModel);
                    copy(datasetModel.listResourcesWithProperty(ORE.proxyFor, providedCHO),
                        handled, recordModel);

                    // Write the record.
                    final Resource record = recordModel.getResource(providedCHO.getURI());
                    final SegmentationResult result = consumer.accept(new WritableRecordFromModel(record));

                    // Finish the iteration. Stop processing if needed.
                    if (result == SegmentationResult.TERMINATE) {
                        break;
                    }
                } finally {
                    recordModel.close();
                }
            }
        } finally {
            iterator.close();
        }
    }

    private void copy(Resource r, Set<Resource> handled, Model target) {
        if (!handled.add(r)) {
            return;
        }
        copy(r.listProperties(), handled, target);
    }

    private void copy(ResIterator iter, Set<Resource> handled, Model target) {
        try {
            iter.forEach(resource -> copy(resource, handled, target));
        } finally {
            iter.close();
        }
    }

    private void copy(StmtIterator iter, Set<Resource> handled, Model target) {
        try {
            while (iter.hasNext()) {
                Statement stmt = iter.next();
                target.add(stmt);
                RDFNode node = stmt.getObject();
                if (!node.isResource()) {
                    continue;
                }

                Resource chain = node.asResource();
                if (chain.hasProperty(RDF.type, EDM.ProvidedCHO)) {
                    continue;
                }

                copy(chain, handled, target);
            }
        } finally {
            iter.close();
        }
    }
}
