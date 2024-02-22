package eu.europeana.ldaggregation.datasetmetadata;

import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.vocabulary.DCAT;
import org.apache.jena.vocabulary.DCTerms;

import eu.europeana.ldaggregation.acquisition.rdf.RegSchemaorg;

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

	public String getDownloadUrl() {
		// TODO: accessUrl should not be used here, but currently it is bein used by
		// NDE.
		for (Property downloadUrlProp : new Property[] { DCAT.downloadURL, DCAT.accessURL, RegSchemaorg.contentUrl }) {
			Statement downloadUrlSt = distributionRs.getProperty(downloadUrlProp);
			if (downloadUrlSt != null) {
				if (downloadUrlSt.getObject().isURIResource())
					return downloadUrlSt.getObject().asResource().getURI();
				if (downloadUrlSt.getObject().isLiteral())
					return downloadUrlSt.getObject().asLiteral().getString();
			}
		}
		return null;
	}

	public boolean isEdmFileBasedDistribution() {
		return false;
	}

}
