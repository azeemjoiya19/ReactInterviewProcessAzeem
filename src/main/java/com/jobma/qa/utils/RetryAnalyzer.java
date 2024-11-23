package com.jobma.qa.utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	  int retryCount = 0;
	   int maxRetryCount = 2;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		 
		 // Number of retries allowed
		   
		   if(retryCount<maxRetryCount)
		   {   
			   retryCount++;
			   return true;
			   
		   }

		return false;
	}

}
