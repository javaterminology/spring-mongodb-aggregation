package com.terminology.aggregation.dao;

public class GroupedDocumentDetails {
	
	private String docId;
	private String docCurrency;
	private String customerId;
	private String countryCode;
	private double totalAmt;
	
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
	public double getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}
}
