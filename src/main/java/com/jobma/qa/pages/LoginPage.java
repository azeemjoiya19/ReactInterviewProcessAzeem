package com.jobma.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jobma.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	

	 @FindBy(id = "jobma_user_name")
	 WebElement usernameid ; 
	  
	 
	 
	@FindBy(id = "password")
	WebElement usernamepassword ;
	
	@FindBy(id = "submitBtn")
	WebElement loginsubmitbutton;
	
	@FindBy(xpath = "(//span[@class='nav-txt' and text()='Setup Interview'])[1]")
	WebElement clicksetinterview;
	
	@FindBy(xpath = "(//span[@class='nav-txt' and text()='Interview Kit'])[1]")
	WebElement Clickinterviewkit;
	
	//Interview kit listing page
	
	@FindBy (id ="searchBox")
	WebElement Clickonsearch;
	
	@FindBy (xpath ="/html/body/div[2]/div[3]/div[8]/div[1]/div[2]/div/div[1]/div/span")
			WebElement Clickforsearch;
	
	@FindBy (id = "jobListing")
	WebElement clickonsetupinterview;
	
	//Candidate invitation page
	
	@FindBy (xpath ="//input[@class='form-control' and @type='text' and @name='jobma_name[]']")
	WebElement Entercandidatename;
	
	@FindBy (xpath ="(//input[@name='jobma_email[]' and @class='form-control'])[1]")
	WebElement Entercandidatemail;
	
	@FindBy (id ="jobseeker_signup_confirmation")
	WebElement radiobuttonresume;
	
	@FindBy (id ="can_request_retake")
	WebElement retakeradiobutton;
	
	@FindBy (id = "AItranscription")
	WebElement AItranscriptionradiobutton;
	
	@FindBy (id = "AIscoring")
	WebElement AIscoringradiobutton;
	
	@FindBy (id = "liveProctoring")
	WebElement liveProctoringradiobutton;
	
	
	@FindBy (id ="(//button[@class='btn btn-primary sendInvitiationJQ' and text()='Send Invitation'])[1]")
	WebElement Sendinvitationbutton;
	
	
	
	public  LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void login(String username, String password) {
       // Enter username
       usernameid.sendKeys(username);
       
       // Enter password
       usernamepassword.sendKeys(password);
       
       // Click the login button
       loginsubmitbutton.click();
       
	} 
       public void clicksetinterview() {
       	clicksetinterview.click();
       // Click on interview
   }
       public void Clickinterviewkit() {
       	Clickinterviewkit.click();
       	// Click on interview kit
       }
       public void Clickonsearch() {
       	Clickonsearch.click();
       	//Click on search
       }
	

}
