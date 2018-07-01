package com.terminology.aggregation.dao;

import java.security.acl.Group;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.Fields;
import org.springframework.data.mongodb.core.aggregation.*;

import com.terminology.aggregation.collection.DocumentRequestObj;

public class AggregationDaoImpl implements AggregationDao{

	@Autowired
	MongoTemplate mongoTemplate;
	
	private static final String COLLECTION = "document_grouping";
	
	public void drop() {
		this.mongoTemplate.dropCollection(COLLECTION);
	}

	public void create(DocumentRequestObj requestObj) {
		if(requestObj!=null)
		this.mongoTemplate.insert(requestObj);
	}

	public List<GroupedDocumentDetails> aggregationByDocKeys() {
		AggregationResults<GroupedDocumentDetails> aggregationResults = mongoTemplate.aggregate(
				Aggregation.newAggregation(DocumentRequestObj.class,
				Aggregation.unwind("documentRequest"),
				Aggregation.unwind("documentRequest.documentDetails"),
				Aggregation.group(Fields.fields()
						.and("docId","$documentRequest.documentDetails.docId")
						.and("docCurrency","$documentRequest.documentDetails.docCurrency")
						.and("customerId","$documentRequest.documentDetails.customerId")
						.and("countryCode","$documentRequest.documentDetails.countryCode"))
				        .sum("documentRequest.documentDetails.docAmt").as("totalAmt")), GroupedDocumentDetails.class);
	
		List<GroupedDocumentDetails> groupedDocumentDetails = aggregationResults.getMappedResults();
		return groupedDocumentDetails;
		
		
	}

}
