package com.terminology.aggregation.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.UnwindOperation;

import com.terminology.aggregation.collection.DocumentRequestObj;

public class AggregationDaoImpl implements AggregationDao{

	@Autowired
	MongoTemplate mongoTemplate;
	
	private static final String COLLECTION = "document_grouping";
	
	public void drop() {
		mongoTemplate.dropCollection(COLLECTION);
	}

	public void create(DocumentRequestObj requestObj) {
		mongoTemplate.save(requestObj);
	}

	public List<GroupedDocumentDetails> aggregationByDocKeys() {
		
		//AggregationResults aggregationResults = mongoTemplate.aggregate(newA, inputType, outputType)
	

		return null;
		
	}

}
