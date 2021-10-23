package com.listeners;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerEx implements ITestListener{
	private Logger log = Logger.getLogger(ListenerEx.class);
	public void onTestStart(ITestResult result) {
		log.info("Test case started with name: "+ result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		log.info("Test case sucessfully comleted with name: "+ result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		log.info("Test case failed with name: "+ result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		log.info("Test case skipped with name: "+ result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		log.info("Test case Failed But Within Success Percentage with name: "+ result.getName()+ result.getStatus());
		
	}

	public void onStart(ITestContext context) {
		log.info("Test case started with context: " +context.getName());		
	}

	public void onFinish(ITestContext context) {
		log.info("Test case completed with context: " +context.getName());
		
	}

}
