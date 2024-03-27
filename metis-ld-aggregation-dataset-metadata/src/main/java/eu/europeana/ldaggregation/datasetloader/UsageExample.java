package eu.europeana.ldaggregation.datasetloader;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class UsageExample {

	public static void main(String[] args) throws Exception {
		final String datasetUri = "https://archief.nl/id/dataset/foto/2-10-62ntfoto";
		final String sparqlEndpointUrl = "https://triplestore.netwerkdigitaalerfgoed.nl/repositories/registry";
		new DatasetLoader().loadDatasetFromSparqlEndpoint(datasetUri, sparqlEndpointUrl,
				((inputStream, dataLanguage) -> {
					final Path downloadFile = Files.createTempFile("edm-dump-download",
							"." + dataLanguage.getFileExtensions().get(0));
					Files.copy(inputStream, downloadFile, StandardCopyOption.REPLACE_EXISTING);
					System.out.println("EDM dump file downloaded to :" + downloadFile);
				}));
	}
}
