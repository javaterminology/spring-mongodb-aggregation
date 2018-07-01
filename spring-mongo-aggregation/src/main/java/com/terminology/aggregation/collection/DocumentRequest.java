package com.terminology.aggregation.collection;

import java.io.Serializable;
import java.util.List;

public class DocumentRequest implements Serializable{
	

	private static final long serialVersionUID = 2221468570243774189L;
	private List<DocumentDetails> documentDetails;
	public List<DocumentDetails> getDocumentDetails() {
		return documentDetails;
	}
	public void setDocumentDetails(List<DocumentDetails> documentDetails) {
		this.documentDetails = documentDetails;
	}

}
