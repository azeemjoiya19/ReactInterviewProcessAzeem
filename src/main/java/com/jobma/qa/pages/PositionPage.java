package com.jobma.qa.pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.base.TestBaseEmployer;
import com.jobma.qa.utils.Utils;




public class PositionPage extends TestBase{

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

	@FindBy(xpath = "//*[@id=\"aside-bar\"]/ul/li[1]/a/span[2]")
	WebElement clkPositions;

	@FindBy(xpath = "//input[@class='form-control recipientJQ' and @placeholder = 'Search Position']")
	WebElement clkSearch;

	@FindBy(xpath = "//button[@class='btn btn-white searchJQ']")
	WebElement clkButton;

	@FindBy(xpath = "//*[@id=\"pillsActive\"]/div/div[1]/div/div/div[2]/div/div[1]/span[1]")
	WebElement clkCopyLink;


	@FindBy(xpath = "//*[@id=\"copyPreLink\"]")
	WebElement copyLink;

	@FindBy(xpath = "//*[@id=\"addInterviewform\"]/div[2]/div[3]/div[2]/div[1]/div/input")
	WebElement name;


	@FindBy(xpath = "//*[@id=\"addInterviewform\"]/div[2]/div[3]/div[2]/div[2]/div/input")
	WebElement email;

	@FindBy(xpath = "//*[@id=\"addInterviewform\"]/div[3]/button")
	WebElement sendBtn;


	@FindBy(xpath = "//*[@id=\"aside-bar\"]/ul/li[3]/a")
	WebElement navigateTrack;


	@FindBy(xpath = "//*[@id=\"nav2\"]/div/a[2]")
	WebElement click_Track;
	
	@FindBy(xpath = "//span[contains(text(),'Applicants')]")
	WebElement clickOnApplicants;
	
	@FindBy(xpath = "(//span[contains(text(),'Track')])[1]")
	WebElement clickOnTrack;
	
	
	
	//span[contains(text(),'Applicants')]


	@FindBy(xpath = "(//button[@class=\"btn btn-primary-soft btn-sm   modalJQ\" and text()=\"Interview Details \"])[1]")
	WebElement click_InterviewDetails;
	
	@FindBy(xpath = "//span[contains(@data-bs-target,'invitecandidates')]")
	WebElement quickInvite;
	
	
	//span[contains(@data-bs-target,'invitecandidates')]




	public  PositionPage()
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

	public void clickpositions() {
		Utils.waitByVisibilityOfElement(driver, clkPositions, 5);
		clkPositions.click();
	}

	public void clickSearch(String position) throws InterruptedException {
		Utils.waitByVisibilityOfElement(driver, clkSearch, 5);
		clkSearch.click();
		clkSearch.sendKeys(position);
		Utils.waitByElementToBeClickable(driver, clkButton, 10);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); // 10 seconds

		clkButton.click();

	}

	public void clickQuickInvite(String candidatename) throws AWTException, InterruptedException {

	       
		Utils.waitByVisibilityOfElement(driver, quickInvite,5);
		Thread.sleep(2000);
		quickInvite.click();
		Utils.waitByVisibilityOfElement(driver, name, 5);
			name.sendKeys(candidatename);
			Random randomGenerator = new Random();  
			int randomInt = randomGenerator.nextInt(1000);

			Random randomGenerator1 = new Random();  
			int randomInt1 = randomGenerator1.nextInt(1000);  
			email.sendKeys("username"+ randomInt1 + randomInt + "@yopmail.com");	

			Thread.sleep(1000);
			sendBtn.click();




			/*
	                 // Locate the link you want to copy
	                 WebElement link = driver.findElement(By.xpath("//*[@id=\"copyPreLink\"]")); // Adjust the XPath as needed
                     link.click();
	                 // Store the link's href attribute in a variable
	                 String linkUrl = link.getAttribute("href");
	                 System.out.println("Copied link: " + linkUrl);

	                 // Copy the link to the clipboard
	                 StringSelection stringSelection = new StringSelection(linkUrl);
	                 Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	                 clipboard.setContents(stringSelection, null);  

	                 // Use Robot to open a new tab and paste the link
	                 Robot robot = new Robot();
	                 robot.keyPress(KeyEvent.VK_CONTROL); // Hold down the Control key
	                 robot.keyPress(KeyEvent.VK_T);       // Press 'T' to open a new tab
	                 robot.keyRelease(KeyEvent.VK_T);     // Release 'T'
	                 robot.keyRelease(KeyEvent.VK_CONTROL);// Release the Control key

	                 // Wait for the new tab to open
	                 Thread.sleep(1000); // Adjust the wait time if needed

	                 // Paste the link into the address bar
	                 robot.keyPress(KeyEvent.VK_CONTROL); // Hold down the Control key
	                 robot.keyPress(KeyEvent.VK_V);       // Press 'V' to paste
	                 robot.keyRelease(KeyEvent.VK_V);     // Release 'V'
	                 robot.keyRelease(KeyEvent.VK_CONTROL);// Release the Control key

	                 // Press Enter to navigate to the pasted link
	                 robot.keyPress(KeyEvent.VK_ENTER);    // Press Enter
	                 robot.keyRelease(KeyEvent.VK_ENTER);  // Release Enter    
			 */
		} 




		//    copyLink.click();

	 


	public void navigate_Track() throws InterruptedException  {
		//  navigateTrack.click();

		/*try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"aside-bar\"]/ul/li[3]/a/span[2]")));
			// Scroll into view and click
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", link);
			link.click();

		} catch (Exception e) {
			e.printStackTrace();
		} */
		Utils.waitByVisibilityOfElement(driver, clickOnApplicants, 5);
		clickOnApplicants.click();
		Utils.waitByVisibilityOfElement(driver, clickOnTrack, 5);
		clickOnTrack.click();
		
		Thread.sleep(4000);
	//	Utils.waitByElementToBeClickable(driver, click_Track, 5);
	//	click_Track.click();
		Utils.waitByElementToBeClickable(driver,click_InterviewDetails, 5);
		click_InterviewDetails.click();


	}


	public String copyLinkToClipboard() throws InterruptedException, AWTException {
		// Set up the clipboard with the link
		
	    // login("insvikrant@yopmail.com","Dev@123");
		
		clickpositions();
		clickSearch("Test_Job_01");
		clickQuickInvite("Samuel Jacob");
		

		Thread.sleep(6000);
		navigate_Track();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement link21 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"candidate_live_url_btn\"]")));
		String candidiateLink =  link21.getAttribute("data-url");
		
	//	System.out.println(candiateLink);
		return  candidiateLink;
	} 
	// Method to retrieve the copied link from the clipboard and return it as a string
	public static String getLinkFromClipboard() {
		try {
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			Transferable contents = clipboard.getContents(null);

			// Check if the clipboard content is a string and retrieve it
			if (contents != null && contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
				return (String) contents.getTransferData(DataFlavor.stringFlavor);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;  // Return null if no link is found


	}


	public void clicksetinterview() {
		clicksetinterview.click();
		// Click on interview
	}
	public void Clickinterviewkit() {
		Clickinterviewkit.click();
		// Click on interview kit
	}

	/*      public  String scheduleInterviewFromPosition() throws InterruptedException, AWTException
	       {
	    	   login("employerjobma12@mailinator.com", "Dev@123");
	    		 //   e.reponsecode();
	    		    clickpositions();
	    		    clickSearch("Software Developer");
	    		    clickQuickInvite("Samuel Jacob");

	    		    Thread.sleep(6000);
	    		    navigate_Track();
	    		    copyLinkToClipboard(null);
	       }


	 */


	public String InterviewTrackLink() {


		return null;


	}




}
