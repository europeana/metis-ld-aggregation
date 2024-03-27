package eu.europeana.metis.ldaggregation.segmenter;

import eu.europeana.metis.ldaggregation.segmenter.api.record.io.xml.EdmXmlStreamWriter;
import eu.europeana.metis.ldaggregation.segmenter.jena.edm.EDM;
import eu.europeana.metis.ldaggregation.segmenter.jena.edm.ORE;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
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
public class EdmRecordSegmenter {

    private static final EdmXmlStreamWriter writer = new EdmXmlStreamWriter();

    /**
     * Implementations of this interface can consume segmented records from the segmenter.
     *
     * @param <E> Exception type to throw.
     */
    public interface ResourceConsumer<E extends Exception> {

        /**
         * Processes the data.
         *
         * @param record The record.
         * @throws E In case there was an issue with processing the data.
         */
        void accept(WritableRecord record) throws E;
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
         * @return The language (file type) of the record.
         */
        Lang getRecordLanguage();

        /**
         * Write the record to an output stream.
         *
         * @throws IOException In case something went wrong while writing to the stream.
         */
        void write(OutputStream outputStream) throws IOException;

        /**
         * @return A suitable file name, including extension.
         */
        default String getFileName() {
            String ext = getRecordLanguage().getFileExtensions().get(0);
            return URLEncoder.encode(getRecordURI()) + "." + ext;
        }
    }

    private record WritableRecordFromModel(Resource record, Lang recordLanguage)
            implements WritableRecord {

        @Override
        public String getRecordURI() {
            return record.getURI();
        }

        @Override
        public Lang getRecordLanguage() {
            return recordLanguage;
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

    public <E extends Exception> void segment(InputStream inputStream, Lang dataLanguage,
            ResourceConsumer<E> consumer) throws E {

        // Load the data into a single model.
        final Model datasetModel = ModelFactory.createDefaultModel();
        datasetModel.read(inputStream, "", dataLanguage.getLabel());

        // Iterate over the ProvidedCHO resources to extract the records.
        final Map<String,String> prefixes = datasetModel.getNsPrefixMap();
        final ResIterator iter = datasetModel.listResourcesWithProperty(RDF.type, EDM.ProvidedCHO);
        try {
            while (iter.hasNext()) {

                // Create a model for the record.
                final Model recordModel = ModelFactory.createDefaultModel();
                recordModel.setNsPrefixes(prefixes);
                final Resource providedCHO = iter.next();

                // Copy in the various parts.
                final Set<Resource> set = new HashSet<>();
                copy(providedCHO, set, recordModel);
                copy(datasetModel.listResourcesWithProperty(EDM.aggregatedCHO, providedCHO), set, recordModel);
                copy(datasetModel.listResourcesWithProperty(ORE.proxyFor, providedCHO), set, recordModel);

                // Write the record.
                final Resource record = recordModel.getResource(providedCHO.getURI());
                consumer.accept(new WritableRecordFromModel(record, dataLanguage));
            }
        } finally {
            iter.close();
        }
    }

    private void copy(Resource r, Set<Resource> handled, Model target) {
        if ( !handled.add(r) ) { return; }

        copy(r.listProperties(), handled, target);
    }

    private void copy(ResIterator iter, Set<Resource> handled, Model target) {
        try {
            while ( iter.hasNext() ) {
                copy(iter.next(), handled, target);
            }
        }
        finally { iter.close(); }
    }

    private void copy(StmtIterator iter, Set<Resource> handled, Model target) {
        try {
            while ( iter.hasNext() ) {
                Statement stmt = iter.next();
                target.add(stmt);
                RDFNode node = stmt.getObject();
                if ( !node.isResource() ) { continue; }

                Resource chain = node.asResource();
                if ( chain.hasProperty(RDF.type, EDM.ProvidedCHO ) ) { continue; }

                copy(chain, handled, target);
            }
        }
        finally { iter.close(); }
    }
}
