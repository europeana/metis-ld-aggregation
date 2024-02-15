package eu.europeana.ldaggregation.datasetmetadata;

import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdfconnection.RDFConnection;
import org.apache.jena.rdfconnection.RDFConnectionFactory;
import org.apache.jena.rdfconnection.RDFConnectionRemote;
import org.apache.jena.rdfconnection.RDFConnectionRemoteBuilder;

import eu.europeana.ldaggregation.acquisition.http.AccessException;
import eu.europeana.ldaggregation.acquisition.http.HttpRequest;
import eu.europeana.ldaggregation.acquisition.http.HttpRequestService;
import eu.europeana.ldaggregation.acquisition.http.HttpResponse;
import eu.europeana.ldaggregation.acquisition.http.HttpUtil;
import eu.europeana.ldaggregation.acquisition.http.UrlRequest;
import eu.europeana.ldaggregation.acquisition.rdf.RdfUtil;

public class Test {
	public static void main(String[] args) throws Exception {
		DatasetDescription dsDesc=new DatasetDescription("https://archief.nl/id/dataset/foto/2-10-62ntfoto","https://triplestore.netwerkdigitaalerfgoed.nl/repositories/registry");
//		System.out.println(RdfUtil.printStatements(dsDesc.getRdf()));
		
		System.out.println(dsDesc.getDistributions());
		
		
//		UrlRequest urlReq=new UrlRequest("https://triplestore.netwerkdigitaalerfgoed.nl/sparql?name=Europeana%20Aggregating%20LOD%20MVP&infer=true&sameAs=true&query=DESCRIBE%20%3Chttps%3A%2F%2Farchief.nl%2Fid%2Fdataset%2Ffoto%2F2-10-62ntfoto%3E"
//				, "Accept", "application/rdf+xml");
//				
//		HttpRequest req=new HttpRequest(urlReq);
//		HttpRequestService.INSTANCE.fetch(req);
//		System.out.println(req.getResponseStatusCode());
//		System.out.println(req.getContent().asString());
		
//		
//		
//		HttpRequest makeRequest = HttpUtil.makeRequest();
//		
//		makeRequest.)
//		
//		HttpResponse resp=new HttpResponse(makeRequest);
//		
//System.out.println(makeRequest.getResponseStatusCode());
//System.out.println(new String(resp.body));
//	IOUtils.read


//		RDFConnectionRemoteBuilder builder = RDFConnectionRemote.create()
//		          .destination("https://triplestore.netwerkdigitaalerfgoed.nl/sparql");
//		builder.acceptHeaderQuery("application/rdf+xml");
//		RDFConnection conn=builder.build();
//		
////		RDFConnection conn = RDFConnectionFactory.connect("https://triplestore.netwerkdigitaalerfgoed.nl/sparql");
//		Model queryDescribe = conn.queryDescribe("DESCRIBE <https://archief.nl/id/dataset/foto/2-10-62ntfoto>");
//		System.out.println(queryDescribe);
		
//				conn.load("data.ttl") ;
//				QueryExecution qExec = conn.query("SELECT DISTINCT ?s { ?s ?p ?o }") ;
//				ResultSet rs = qExec.execSelect() ;
//				while(rs.hasNext()) {
//				  QuerySolution qs = rs.next() ;
//				  Resource subject = qs.getResource("s") ;
//				  System.out.println("Subject: " + subject) ;
//				}
//				qExec.close() ;
//				conn.close() ;
		
		
		
	}
}
