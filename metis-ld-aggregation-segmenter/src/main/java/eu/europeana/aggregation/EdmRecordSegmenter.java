/**
 * 
 */
package eu.europeana.aggregation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

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

import eu.europeana.api.record.io.xml.EdmXmlStreamWriter;
import eu.europeana.jena.edm.EDM;
import eu.europeana.jena.edm.ORE;

/**
 * @author Hugo
 * @since 21 Feb 2024
 * 
 * Algorithm: performs a deep copy from the CHO until it ends or finds another 
 * CHO. It detects cycles and covers both EDM internal and external.
 * 
 */
public class EdmRecordSegmenter {

    private EdmXmlStreamWriter writer = new EdmXmlStreamWriter();

    public interface Callback {
        void handle(Resource cho);
    }

    public void segment(Model m, Callback handler) {
        Map<String,String> prefixes = m.getNsPrefixMap();
        Set<Resource> set = new HashSet<Resource>();
        ResIterator iter = m.listResourcesWithProperty(RDF.type, EDM.ProvidedCHO);
        try {
            while ( iter.hasNext() ) { 
                Model model = ModelFactory.createDefaultModel();
                model.setNsPrefixes(prefixes);
                Resource cho = iter.next();

                copy(cho, set, model);
                copy(m.listResourcesWithProperty(EDM.aggregatedCHO, cho), set, model);
                copy(m.listResourcesWithProperty(ORE.proxyFor     , cho), set, model);

                handler.handle(model.getResource(cho.getURI()));
                set.clear();
            }
        }
        finally { iter.close(); }
    }

    public void segmentToZip(Model m, File zip, final Lang lang) throws IOException {
        final ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zip));
        Callback handler = new EdmRecordSegmenter.Callback() {
            
            @Override
            public void handle(Resource cho) {
                try {
                    zos.putNextEntry(new ZipEntry(getName(cho, lang)));
                    writer.write(cho.getModel(), zos);
                    zos.closeEntry();
                }
                catch(IOException | XMLStreamException e) { throw new RuntimeException(e); }
            }
        };
        try {
            segment(m, handler);
            zos.flush();
        }
        finally {
            zos.close();
        }
        
    }

    private String getName(Resource cho, Lang lang) {
        String ext = lang.getFileExtensions().get(0);
        return URLEncoder.encode(cho.getURI()) + "." + ext;
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
