package com.jobma.qa.test;


import java.awt.AWTException;
import java.io.IOException;


import org.testng.annotations.Test;

import com.jobma.qa.base.TestBaseEmployer;
import com.jobma.qa.pages.PositionPage;

import utils.ExtentReports.ExtentTestManager;


	public class PositionPageTest extends TestBaseEmployer {
		
		 @Test (priority = 0, description="Verify that user should not be able to log in successfully with incorrect email")
			public void PositiveFlow_ScheduletheInterview_CopyLink() throws InterruptedException, AWTException, IOException 
			{
		
			//	BasicConfigurator.configure();
			     
				//ExtentReports Description
		    //    ExtentTestManager.getTest();
		   
	    //*************PAGE INSTANTIATIONS*************
	    PositionPage e = new PositionPage();

	    //*************PAGE METHODS********************

	     e.copyLinkToClipboard();

	    ExtentTestManager.endTest();
	}
	}
	

