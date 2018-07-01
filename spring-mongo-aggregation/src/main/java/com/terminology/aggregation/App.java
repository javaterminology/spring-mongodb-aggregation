package com.terminology.aggregation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		
		
		
		
		
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
}
