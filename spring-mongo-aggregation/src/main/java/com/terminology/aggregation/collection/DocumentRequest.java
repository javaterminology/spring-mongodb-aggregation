package com.terminology.aggregation.collection;

import java.io.Serializable;

public class DocumentRequest implements Serializable{
	

	private static final long serialVersionUID = 2221468570243774189L;
	private DocumentDetails documentDetails;

	public DocumentDetails getDocumentDetails() {
		return documentDetails;
	}

	public void setDocumentDetails(DocumentDetails documentDetails) {
		this.documentDetails = documentDetails;
	}

}
