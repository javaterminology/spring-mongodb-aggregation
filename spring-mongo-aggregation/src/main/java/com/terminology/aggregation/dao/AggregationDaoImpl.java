package com.terminology.aggregation.dao;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.group;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.newAggregation;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.unwind;
import static org.springframework.data.mongodb.core.aggregation.Aggregation.match;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.Fields;

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

	@Override
	public List<GroupedDocumentDetails> aggregationByDocKeys() {
		AggregationResults<GroupedDocumentDetails> aggregationResults = mongoTemplate.aggregate(
				newAggregation(DocumentRequestObj.class,
				unwind("documentRequest"),
				unwind("documentRequest.documentDetails"),
			        match(new Criteria("documentRequest.documentDetails.docId").is("")),
				group(Fields.fields()
						.and("docId","$documentRequest.documentDetails.docId")
						.and("docCurrency","$documentRequest.documentDetails.docCurrency")
						.and("customerId","$documentRequest.documentDetails.customerId")
						.and("countryCode","$documentRequest.documentDetails.countryCode"))
				        .sum("documentRequest.documentDetails.docAmount").as("totalAmt")), GroupedDocumentDetails.class);
	
		List<GroupedDocumentDetails> groupedDocumentDetails = aggregationResults.getMappedResults();
		return groupedDocumentDetails;
		
		
	}

}
