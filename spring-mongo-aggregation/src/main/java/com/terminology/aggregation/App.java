package com.terminology.aggregation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.terminology.aggregation.collection.DocumentDetails;
import com.terminology.aggregation.collection.DocumentRequest;
import com.terminology.aggregation.collection.DocumentRequestObj;
import com.terminology.aggregation.dao.AggregationDao;


public class App 
{
	private static ApplicationContext context;

	public static void main( String[] args )
	{
		context = new ClassPathXmlApplicationContext(
				"spring-beans.xml");
		try{
			AggregationDao aggregationDao = (AggregationDao) context.getBean("aggregationDao");
			aggregationDao.drop();


			DocumentRequestObj requestObj = new DocumentRequestObj();
			DocumentRequest documentRequest = new DocumentRequest();
			List<DocumentDetails> documentDetails = new ArrayList<DocumentDetails>();

			DocumentDetails doc1 = new DocumentDetails();
			doc1.setCountryCode("IN");
			doc1.setCustomerId("10003998");
			doc1.setDocAmount(100);
			doc1.setDocCurrency("INR");
			doc1.setDocId("DOC1234");

			DocumentDetails doc2 = new DocumentDetails();
			doc2.setCountryCode("IN");
			doc2.setCustomerId("10003998");
			doc2.setDocAmount(100);
			doc2.setDocCurrency("INR");
			doc2.setDocId("DOC1234");

			DocumentDetails doc3 = new DocumentDetails();
			doc3.setCountryCode("IN");
			doc3.setCustomerId("10003998");
			doc3.setDocAmount(100);
			doc3.setDocCurrency("INR");
			doc3.setDocId("DOC1234");

			DocumentDetails doc4 = new DocumentDetails();
			doc4.setCountryCode("IN");
			doc4.setCustomerId("10003998");
			doc4.setDocAmount(100);
			doc4.setDocCurrency("INR");
			doc4.setDocId("DOC1234");

			DocumentDetails doc5 = new DocumentDetails();
			doc5.setCountryCode("IN");
			doc5.setCustomerId("10003998");
			doc5.setDocAmount(100);
			doc5.setDocCurrency("INR");
			doc5.setDocId("DOC1234");
			
			DocumentDetails doc6 = new DocumentDetails();
			doc6.setCountryCode("SG");
			doc6.setCustomerId("10003998");
			doc6.setDocAmount(1000);
			doc6.setDocCurrency("INR");
			doc6.setDocId("DOC3456");
			
			documentDetails.add(doc1);
			documentDetails.add(doc2);
			documentDetails.add(doc3);
			documentDetails.add(doc4);
			documentDetails.add(doc5);
			documentDetails.add(doc6);

			documentRequest.setDocumentDetails(documentDetails);
			requestObj.setDocumentRequest(documentRequest);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
