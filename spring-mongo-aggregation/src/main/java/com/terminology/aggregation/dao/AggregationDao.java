package com.terminology.aggregation.dao;

import java.util.List;

import com.terminology.aggregation.collection.DocumentRequestObj;

public interface AggregationDao {
	
	public void drop();
	public void create(DocumentRequestObj requestObj);
	public List<GroupedDocumentDetails> aggregationByDocKeys();

}
