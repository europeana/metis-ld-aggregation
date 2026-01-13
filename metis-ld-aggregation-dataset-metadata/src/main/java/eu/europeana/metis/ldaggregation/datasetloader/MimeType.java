/**
 * 
 */
package eu.europeana.metis.ldaggregation.datasetloader;

/**
 * Media types supported for data dump files and their mime types and URIs in two vocabularies that may be used in DCAT-AP metadata.
 * 
 * @author Nuno Freire
 * @since 10/04/2025
 */
public enum MimeType {
  
  ZIP("application/zip", "http://publications.europa.eu/resource/authority/file-type/ZIP"), 
  GZIP("application/gzip", "http://publications.europa.eu/resource/authority/file-type/GZIP"), 
  TAR("application/x-tar", "http://publications.europa.eu/resource/authority/file-type/TAR"), 
  RDF_XML("application/rdf+xml", "http://publications.europa.eu/resource/authority/file-type/RDF_XML"),
  TURTLE("text/turtle", "http://publications.europa.eu/resource/authority/file-type/RDF_TURTLE"), 
  NTRIPLES("application/n-triples", "http://publications.europa.eu/resource/authority/file-type/RDF_N_TRIPLES");
 
  private static final String IANA_URI_PREFIX="http://www.iana.org/assignments/media-types/";

  private String mimeType;
  private String authorityUri;
  
  private MimeType(String mimeType, String authorityUri) {
    this.mimeType = mimeType;
    this.authorityUri = authorityUri;
  }  
  
  public String getMimeTypeString() {
    return mimeType;
  }

  public String getAuthorityUri() {
    return authorityUri;
  }
  
  public static MimeType fromUriOrString(String mimeType) throws UnsupportedMimeTypeException {
    for(MimeType mtEnum: MimeType.values()) {
      if(mimeType.equals(mtEnum.getMimeTypeString()) 
          || mimeType.equals(mtEnum.getAuthorityUri()) 
          || mimeType.equals(IANA_URI_PREFIX+mtEnum.getMimeTypeString()))
        return mtEnum;
    }
    throw new UnsupportedMimeTypeException(mimeType);
  }
  
}
