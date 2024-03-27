/**
 * 
 */
package eu.europeana.metis.ldaggregation.segmenter.jena.edm;

import static org.apache.jena.rdf.model.ResourceFactory.*;

import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

/**
 * @author Hugo Manguinhas <hugo.manguinhas@europeana.eu>
 * @since 15 Apr 2016
 */
public class OA
{
    public static final String PREFIX = "oa";
    public static final String NS     = "http://www.w3.org/ns/oa#";

    public static final Resource QualityAnnotation    = createResource(NS + "QualityAnnotation");

    public static final Property hasBody   = createProperty(NS + "hasBody");
    public static final Property hasTarget = createProperty(NS + "hasTarget");
}
