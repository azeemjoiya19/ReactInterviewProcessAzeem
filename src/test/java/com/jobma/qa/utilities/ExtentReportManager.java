package com.jobma.qa.utilities;

import java.awt.Desktop;
import java.io.File;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.jobma.qa.utils.Utils;
import com.relevantcodes.extentreports.LogStatus;

import tests.BaseTest;


public class ExtentReportManager implements ITestListener {
	
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	String reportName;
	
	
	
	
	
	private static String getTestMethodName(ITestResult iTestResult) {
        //return iTestResult.getMethod().getConstructorOrMethod().getName();
     return iTestResult.getMethod().getDescription(); 
    }

    @Override
    public void onStart(ITestContext testContext) {
    	
    	 /*	SimpleDateFormat df = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss");
    	Date dt = new Date();
    	String currentDateTimeStamp = df.format(dt); */
    	
    	
 String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format( new Date());
    	
    	reportName = "Test-Report"+timeStamp+ ".html";
    	 String reportPath = System.getProperty("user.dir") + "/ExtentReports/" + reportName;
    	    sparkReporter = new ExtentSparkReporter(reportPath);
    	 //   sparkReporter.config().setOfflineMode(true); 
    	sparkReporter.config().setDocumentTitle("Jobma Interview Process Automation Report");
    	sparkReporter.config().setReportName("Jobma Interview Process");
    	sparkReporter.config().setTheme(Theme.STANDARD);
    	
    	extent  = new ExtentReports();
    	extent.attachReporter(sparkReporter);
    	extent.setSystemInfo("Web Application","Jobma Interview Process" );
    	extent.setSystemInfo("Module","Interview Process" );
    	extent.setSystemInfo("Tester","Azeem" );
    	
    //	String os = testContext.getCurrentXmlTest().getParameter("os");
    	//extent.setSystemInfo("Operating System","" );
    	
    	String browser = testContext.getCurrentXmlTest().getParameter("browser");
    	extent.setSystemInfo("Browser",browser );
    	
    	
       
    }

   
    
    @Override
    public void onTestStart(ITestResult iTestResult) {
	  
       
    }

  

    @Override
    public void onTestSuccess(ITestResult result) {
    	
    	test = extent.createTest(result.getName());
    	test.log(Status.PASS,result.getName()+" Got Sucessfully Executed");
       
    }

    @Override
    public void onTestFailure(ITestResult result) {
    	
    	test = extent.createTest(result.getName());
    	test.log(Status.FAIL,result.getName()+" Got Failed");
    	test.log(Status.INFO,result.getThrowable().getMessage());
    	
    	try 
    	{
    		String imgpath = Utils.captureScreenhot(result.getName());
    		test.addScreenCaptureFromPath(imgpath);
    	}
    	catch(Exception e)
    	{
    		
    	}
          
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    	
    	test = extent.createTest(result.getName());
    	test.log(Status.SKIP,result.getName()+"Got Skipped");
    	test.log(Status.INFO,result.getThrowable().getMessage());
    	
       
    }
    
    
    @Override
    public void onFinish(ITestContext iTestContext) 
    {
    	
    	extent.flush();
    	
    	String PathOfExtentReport = System.getProperty("user.dir")+"./jobmareport/"+reportName;
       File extentReport = new File(PathOfExtentReport);
       
   /*    try 
       {
    	   Desktop.getDesktop().browse(extentReport.toURI());
       }
       catch(Exception e)
       {
    	   
       } */
      
         
   }
    
    
    
    

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
    }

}
