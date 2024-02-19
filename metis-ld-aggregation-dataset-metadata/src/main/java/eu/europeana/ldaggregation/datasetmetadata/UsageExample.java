package eu.europeana.ldaggregation.datasetmetadata;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFLanguages;

import eu.europeana.ldaggregation.acquisition.http.HttpRequest;
import eu.europeana.ldaggregation.acquisition.http.HttpUtil;

public class UsageExample {
	public static void main(String[] args) throws Exception {
		DatasetDescription dsDesc = new DatasetDescription("https://archief.nl/id/dataset/foto/2-10-62ntfoto",
				"https://triplestore.netwerkdigitaalerfgoed.nl/repositories/registry");
		for (Distribution dist : dsDesc.getDistributions()) {
			if (dist.isConformingEdm()) {
				String downloadUrl = dist.getDownloadUrl();
				if (downloadUrl != null) {
					HttpRequest request = HttpUtil.makeRequest(downloadUrl);
					request.fetchStream();
					InputStream asStream = request.getContent().asStream();
					Lang rdfLang = RDFLanguages.contentTypeToLang(request.getResponseContentType());
					File downloadFile = File.createTempFile("edm-dump-download",
							"." + rdfLang.getFileExtensions().get(0));
					ReadableByteChannel rbc = Channels.newChannel(asStream);
					FileOutputStream fos = new FileOutputStream(downloadFile);
					try {
						fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
					} finally {
						fos.close();
					}
					System.out.println("EDM dump file downloaded to :" + downloadFile.getAbsolutePath());
				}
			}
		}
	}
}
