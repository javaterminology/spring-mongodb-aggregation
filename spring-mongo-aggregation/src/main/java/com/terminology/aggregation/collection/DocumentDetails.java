package com.terminology.aggregation.collection;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class DocumentDetails implements Serializable{

	private static final long serialVersionUID = -1914252392995730145L;
	
	@Id
	private String docId;
	private String docCurrency;
	private String customerId;
	private String countryCode;
	private double docAmount;
	
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public String getDocCurrency() {
		return docCurrency;
	}
	public void setDocCurrency(String docCurrency) {
		this.docCurrency = docCurrency;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public double getDocAmount() {
		return docAmount;
	}
	public void setDocAmount(double docAmount) {
		this.docAmount = docAmount;
	}
	
}
