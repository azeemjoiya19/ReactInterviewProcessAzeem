package com.jobma.qa.test;


import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.pages.InterviewProcess;
import com.jobma.qa.pages.PositionPage;
import com.jobma.qa.utils.ExcelUtils;
import com.jobma.qa.utils.RetryAnalyzer;
import com.jobma.qa.utils.Utils;



public class InterviewProcessTest extends TestBase {



	WebElement e ; 
	PositionPage pp;


	String projectPath = System.getProperty("user.dir");

	@DataProvider(name="interview_link")
	public Object[][] getInterviewLink()
	{
		ExcelUtils eu = new ExcelUtils(projectPath+"/excel/interviewlink2.xlsx","Sheet1");
		Object [][] data = eu.readExceltData();
		return data ; 
	}  


	@Parameters("browser")
	@BeforeClass
	public void setup(String browser) throws InterruptedException
	{
		//logger = LogManager.getLogger(this.getClass());

		TestBase.browserSetup(browser);
		driver.manage().deleteAllCookies();

	}

	@AfterClass
	public void tearDown()
	{
		driver.manage().deleteAllCookies();
		driver.quit();
	}

	@Test(dataProvider = "interview_link" , enabled = false)  
	public void interviewProcessApplicationformsubmit(String link) throws InterruptedException
	{
		//System.out.println();

		driver.get(link);
		logger.info("Interview link loaded");

		InterviewProcess p = new InterviewProcess(driver);

		try {


			if(p.servererror.isDisplayed())
			{
				System.out.println("Server error on launching the interview process link");
				Assert.assertFalse(false);   
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		p.initialThemeoneFlow();
		Utils.waitByVisibilityOfElement(driver,p.yourdetailheading,60);
		p.applicationOption();
		Utils.waitByVisibilityOfElement(driver, p.formsubmittedsuccessfully,60);
		Assert.assertTrue(p.formsubmittedsuccessfully.isDisplayed());



	}

	//test case to check question submission case , Retake case 
	@Test(priority = 1,enabled = true,retryAnalyzer=RetryAnalyzer.class)//retryAnalyzer=RetryAnalyzer.class
	public void interviewProcessFlow() throws InterruptedException, AWTException
	{



		pp = new PositionPage();
		driver.get("https://testing.jobma.com/login");
		pp.login("insvikrant@yopmail.com","Dev@123");
		
		String interviewlink =   pp.copyLinkToClipboard();

		String updated = interviewlink.replace("videointerview","prerecorded");
		driver.get(updated);

		//   Thread.sleep(10000);
		//  System.out.println(interviewLink);
		//   Thread.sleep(5000);
		//  ((JavascriptExecutor) driver).executeScript("window.open();");
		//  driver.get(interviewLink);


		// driver.get(interviewLink);




		logger.info("Interview link loaded successfully");


		InterviewProcess p = new InterviewProcess(driver);

		try {


			if(p.servererror.isDisplayed())
			{
				logger.info("Server Error on loading Interview link");
				System.out.println("Server error on launching the interview process link");
				Assert.assertFalse(false);   
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		int numberofquestions =  p.initialThemeoneFlow();
		
		try {
			Utils.waitByVisibilityOfElement(driver,p.skipbutton,60);
		//	Utils.waitByElementToBeClickable(driver, p.skipbutton, 30);
			Thread.sleep(2000);
			p.skipbutton.click();
		}
		catch(StaleElementReferenceException e)
		{
			
           
		}
		
		Utils.waitByVisibilityOfElement(driver,p.startinterviewnow ,60);
		Utils.waitByElementToBeClickable(driver, p.startinterviewnow, 60);
		p.allTheBestnInstructionsstage();
		Thread.sleep(3000);
	/*	try {
		Utils.waitByVisibilityOfElement(driver,p.startinterviewnow ,60);
		Utils.waitByElementToBeClickable(driver, p.startinterviewnow, 60);
		p.allTheBestnInstructionsstage();
		Thread.sleep(3000);
		}
		catch(StaleElementReferenceException e)
		{
			Utils.waitByVisibilityOfElement(driver,p.startinterviewnow ,60);
			Utils.waitByElementToBeClickable(driver, p.startinterviewnow, 60);
			p.allTheBestnInstructionsstage();
			Thread.sleep(3000);
		} */
		// 


		for(int i = 1 ; i<=numberofquestions ;i++)
		{
			String s =   p.getQuestion();
			p.questionAction(s);

		}





	}
	//Test case to check skip questions case 

	@Test(priority=2,enabled=true,retryAnalyzer=RetryAnalyzer.class)
	public void skipQuestions() throws InterruptedException, AWTException
	{



		PositionPage po = new PositionPage();
		driver.get("https://testing.jobma.com/login");
		String interviewlink =   po.copyLinkToClipboard();

		String updated = interviewlink.replace("videointerview","prerecorded");
		driver.get(updated);



		logger.info("Interview link loaded successfully");


		InterviewProcess p = new InterviewProcess(driver);

		try {


			if(p.servererror.isDisplayed())
			{
				logger.info("Server Error on loading Interview link");
				System.out.println("Server error on launching the interview process link");
				Assert.assertFalse(false);   
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		int numberofquestions =  p.initialThemeoneFlow();
		try {
			Utils.waitByVisibilityOfElement(driver,p.skipbutton,60);
			Utils.waitByElementToBeClickable(driver, p.skipbutton, 30);
			Thread.sleep(3000);
			p.skipbutton.click();
		}
		catch(Exception e)
		{

			System.out.println(e);
		}
		Utils.waitByVisibilityOfElement(driver,p.startinterviewnow ,60);
		p.allTheBestnInstructionsstage();
		Thread.sleep(3000);
		// 


		for(int i = 1 ; i<=numberofquestions ;i++)
		{
			String s =   p.getQuestion();
			p.skipQuestionsCase(s);


		}


	}



}
