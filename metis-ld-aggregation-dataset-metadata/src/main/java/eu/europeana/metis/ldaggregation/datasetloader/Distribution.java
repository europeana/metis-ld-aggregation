package eu.europeana.metis.ldaggregation.datasetloader;

import java.util.ArrayList;
import java.util.List;

import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.vocabulary.DCAT;
import org.apache.jena.vocabulary.DCTerms;
import org.apache.jena.vocabulary.RDF;

import eu.europeana.metis.ldaggregation.acquisition.rdf.RegSchemaorg;

public class Distribution {
	Resource distributionRs;

	public Distribution(Resource distributionRs) {
		super();
		this.distributionRs = distributionRs;
	}

	public boolean isConformingEdm() {
		StmtIterator conforms = distributionRs.listProperties(DCTerms.conformsTo);
		for (Statement st : conforms.toList()) {
			if (st.getObject().isURIResource()
					&& st.getObject().asResource().getURI().equals("http://www.europeana.eu/schemas/edm/"))
				return true;
		}
		return false;
	}

	public List<String> getDownloadUrls() {
	  List<String> urls=new ArrayList<String>();
		for (Property downloadUrlProp : new Property[] {DCAT.downloadURL, RegSchemaorg.contentUrl }) {
		  StmtIterator stmts = distributionRs.listProperties(downloadUrlProp);
		  stmts.forEach(statement -> {
		    String url = getNodeValue(statement.getObject());
		    if (url != null) 
		      urls.add(url);
		  });
		}
		return urls;
	}

	public boolean isEdmFileBasedDistribution() {
		return false;
	}

	public MimeType getCompressFormat() throws UnsupportedMimeTypeException {
	  return MimeType.fromUriOrString(getPropertyValue(distributionRs, DCAT.compressFormat));
	}
	
	public MimeType getMediaType() throws UnsupportedMimeTypeException {
	  return MimeType.fromUriOrString(getPropertyValue(distributionRs, DCAT.mediaType));
	}
	
	public MimeType getPackageFormat() throws UnsupportedMimeTypeException {
	  return MimeType.fromUriOrString(getPropertyValue(distributionRs, DCAT.packageFormat));
	}
	
	private static String getPropertyValue(Resource res, Property prop) {
	  Statement stmt = res.getProperty(prop);
	  if(stmt!=null) 
	    return getNodeValue(stmt.getObject());
	  return null;
	}

	private static String getNodeValue(RDFNode prop) {
	  if(prop!=null) { 
	    if (prop.isLiteral())
	      return prop.asLiteral().getString();
	    if (prop.isResource()) {
	      if (prop.isURIResource()) 
	        return prop.asResource().getURI();
	      else 
	        return getPropertyValue(prop.asResource(), RDF.value);
	    }
	  }
	  return null;
	}
}
