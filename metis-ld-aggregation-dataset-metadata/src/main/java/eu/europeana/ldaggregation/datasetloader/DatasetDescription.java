package eu.europeana.ldaggregation.datasetloader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.vocabulary.DCAT;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.VOID;

import eu.europeana.ldaggregation.acquisition.http.AccessException;
import eu.europeana.ldaggregation.acquisition.rdf.RdfReg;
import eu.europeana.ldaggregation.acquisition.rdf.RdfUtil;
import eu.europeana.ldaggregation.acquisition.rdf.RegSchemaorg;
import eu.europeana.ldaggregation.acquisition.rdf.SparqlClient;

public class DatasetDescription {
	SparqlClient sparqlClient;
	String datasetUri;
	Model model;

	List<Distribution> distributions;

	public DatasetDescription(String datasetUri) throws AccessException, InterruptedException, IOException {
		this.datasetUri = datasetUri;
		model = RdfUtil.readRdfFromUri(datasetUri);
		if (model == null) {
			return;
		}
		if (RdfUtil.contains(datasetUri, model)) {
			loadDistributions();
			return;
		}
		// Search for an RDF resource for a Dataset
		Set<Resource> dss = new HashSet<>();
		dss.addAll(model.listResourcesWithProperty(RDF.type, RegSchemaorg.Dataset).toList());
		dss.addAll(model.listResourcesWithProperty(RDF.type, RdfReg.DCAT_DATASET).toList());
		dss.addAll(model.listResourcesWithProperty(RDF.type, RdfReg.VOID_DATASET).toList());
		if (dss.size() == 1) {
			datasetUri = dss.iterator().next().getURI();
			loadDistributions();
		} else if (dss.size() > 1)
			throw new AccessException(datasetUri, "More than one Dataset found at URL");
		throw new AccessException(datasetUri, "No RDF resource available for the dataset URI");
	}

	public DatasetDescription(String datasetUri, String sparqlEndpointUrl)
			throws AccessException, InterruptedException, IOException {
		this.datasetUri = datasetUri;
		this.sparqlClient = new SparqlClient(sparqlEndpointUrl, "");
		model = sparqlClient.describeResource(datasetUri);
		loadDistributions();
	}

	public List<Distribution> getDistributions() {
		return distributions;
	}

	public List<Distribution> getEdmFileBasedDistributions() {
		List<Distribution> distrs = new ArrayList<>();
		for (Distribution d : distributions) {
			if (d.isConformingEdm() && d.getDownloadUrl() != null) {
				distrs.add(d);
			}
		}
		return distrs;
	}

	private void loadDistributions() throws AccessException, InterruptedException, IOException {
		distributions = new ArrayList<>();
		Resource dsResource = model.createResource(datasetUri);
		if (dsResource == null) {
			return;
		}

		StmtIterator distributions = dsResource.listProperties(VOID.dataDump);
		for (Statement st : distributions.toList()) {
			addDistribution(st.getObject());
		}

		distributions = dsResource.listProperties(DCAT.distribution);
		for (Statement st : distributions.toList()) {
			addDistribution(st.getObject());
		}

		distributions = dsResource.listProperties(RegSchemaorg.distribution);
		for (Statement st : distributions.toList()) {
			addDistribution(st.getObject());
		}
	}

	private void addDistribution(RDFNode object) throws AccessException, InterruptedException, IOException {
		if (object.isResource()) {
			Resource distRs = object.asResource();
			List<Statement> distStatements = distRs.listProperties().toList();
			if (distStatements.isEmpty() && distRs.isURIResource())
				distRs = dereference(distRs.getURI());
			if (distRs != null)
				distributions.add(new Distribution(distRs));
		}
	}

	private Resource dereference(String uri) throws AccessException, InterruptedException, IOException {
		if (sparqlClient == null) {
			Model model = RdfUtil.readRdfFromUri(uri);
			if (model != null && RdfUtil.contains(uri, model))
				return model.createResource(uri);
		} else {
			model = sparqlClient.describeResource(uri);
			if (model != null && RdfUtil.contains(uri, model))
				return model.createResource(uri);
		}
		return null;
	}

	public Model getRdf() {
		return model;
	}

	public String getUri() {
		return datasetUri;
	}
}
