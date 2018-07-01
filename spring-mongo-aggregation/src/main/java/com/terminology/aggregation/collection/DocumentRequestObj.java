package com.terminology.aggregation.collection;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="document_grouping")
public class DocumentRequestObj implements Serializable{
	private static final long serialVersionUID = 7450140765108463881L;
	
	private DocumentRequest documentRequest;

	public DocumentRequest getDocumentRequest() {
		return documentRequest;
	}

	public void setDocumentRequest(DocumentRequest documentRequest) {
		this.documentRequest = documentRequest;
	}
	


}
