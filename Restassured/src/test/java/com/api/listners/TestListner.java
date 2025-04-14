package com.api.listners;

import org.apache.logging.log4j.*;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListner implements ITestListener {
	
		public static final Logger Logger = LogManager.getLogger(TestListner.class);
	 public void onStart(ITestContext context) {
		 Logger.info("Test Suite Started Successfully ! ");
	 }

		  public void onFinish(ITestContext context) {
				 Logger.info("Test Suite Finished Successfully ! ");
		  }
		  
		  public void onTestStart(ITestResult result) {
				 Logger.info("Test "+ result.getMethod().getMethodName() +" Started Successfully ! ");
			  }
		 
		  public void onTestSuccess(ITestResult result) {
				 Logger.info("Test "+ result.getMethod().getMethodName() +" Passed ");
		  }

		 
		  public void onTestFailure(ITestResult result) {
				 Logger.error("Test "+ result.getMethod().getMethodName() +" Failed ");
		  }

		
		  public void onTestSkipped(ITestResult result) {
				 Logger.info("Test "+ result.getMethod().getMethodName() +" Skipped ");
		  }
		
}
