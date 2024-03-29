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
public class DQV
{
    public static final String PREFIX = "dqv";
    public static final String NS     = "http://www.w3.org/ns/dqv#";

    public static final Resource QualityAnnotation    = createResource(NS + "QualityAnnotation");

    public static final Property hasQualityAnnotation = createProperty(NS + "hasQualityAnnotation");
    public static final Property inDimension          = createProperty(NS + "inDimension");
}
