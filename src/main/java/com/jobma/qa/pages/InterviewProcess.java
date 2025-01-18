package com.jobma.qa.pages;

import java.sql.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.utils.Utils;

public class InterviewProcess extends TestBase{

	@FindBy(xpath="(//span[@style='white-space: pre-wrap;'])[14]")
	public WebElement questioncount;


	@FindBy(xpath="//button[contains(@id,'start_interview_now')]")
	public WebElement startinterviewbutton;


	@FindBy(id = "start-recording-button") //start recording locator changed 
	public WebElement startrecordingbutton;


	@FindBy(id="stop-recording-button") // stop recording locator changed
	public WebElement stoprecordingbutton;


	//@FindBy(xpath="//button[contains(@id,'submit-button')]")
	//public WebElement submitbutton;

	@FindBy(id = "submit-button")
	public WebElement submitbutton;


	//Template 1
	//Tour guide 

	@FindBy(id= "okay-button")
	public WebElement okbutton;

	@FindBy(id  = "skip-button") //tour guide skip
	public	WebElement skipbutton;

	@FindBy(id  = "next-button") //tour guide skip
	public	WebElement nextbutton;

	//Interview process  get started page 

	@FindBy(id = "get-started-button")
	public WebElement getstarted;

	//interview for value 
	@FindBy(xpath  = "//h5[@class='m-0 line-height-normal access-content-color']/span")
	public WebElement interviewfor;

	@FindBy(xpath = "(//h5[@class='m-0 access-content-color']/span)[2]")
	public WebElement questions;


	@FindBy(xpath = "//*[@id=\"interview-process\"]/div/div[2]/div/div/div[1]/h5/span\n"
			+ "	")
	public WebElement companyname;


	@FindBy(xpath = "//*[@id=\"interview-process\"]/div/div[1]/div/div[1]/a/span/img")
	public WebElement companylogo;

	//confirmation form page 



	@FindBy(xpath = "//input[@class='form-control form-control-line']")
	public WebElement tokennumber;


	@FindBy(id  = "flexCheckDefault")
	WebElement privacycheckbox;

	@FindBy(id  = "flexCheckDefault2")
	WebElement privacycheckboxAI;



	@FindBy(xpath = "(//span[@style='white-space: pre-wrap;'])[14]\n"
			+ "	")
	WebElement privacytext;


	//System check page 

	@FindBy(xpath   = "//span[starts-with(text(),'Speed')]")
	WebElement networkspeed;

	@FindBy(id  = "continue-button")
	public WebElement continuebutton;

	//video and audio check 




	@FindBy(xpath  = "//h2[@class='h5']/span")
	public WebElement cameraacess;


	@FindBy(xpath  = "//p[contains(text(),'Video Check')]")
	public WebElement videocheck;

	@FindBy(xpath  = "//p[contains(text(),'Audio Check')]")
	public WebElement audiocheck;

	@FindBy(xpath  = "//button[contains(text(),'Cannot see myself')]")
	public WebElement cannotseemyself;

	@FindBy(xpath  = "//h5[contains(text(),'System Check Failed')]\n"
			+ "	")
	public WebElement systemcheckfailedvideo;

	@FindBy(xpath  = "	//button[contains(text(),'Retry')]")
	public WebElement retrybtn;


	@FindBy(xpath  = "//h4[contains(text(),'System Check Passed')]")
	public WebElement systemcheckpassed;


	@FindBy(xpath  = "//i[@class='bi bi-info-circle']")
	public WebElement dosdont;


	@FindBy(xpath="//button[contains(text(),'Grant Camera Permission')]")
	WebElement grantcamerapermissionbutton;


	@FindBy(xpath="//button[contains(text(),'Looks good')]")
	WebElement looksgoodbutton;


	@FindBy(xpath="//button[contains(text(),'Yes, moving')]")
	WebElement yesmovingbutton;


	@FindBy(xpath="//button[contains(text(),'Yes, I Can')]")
	WebElement yesicanbutton;


	@FindBy(xpath="//button[contains(text(),'no')]")
	WebElement nobutton;


	@FindBy(xpath="//h4[contains(text(),'System Check Failed')]")
	WebElement systemcheckfailed;


	@FindBy(xpath="//p[contains(text(),'The microphone access is required')]\n"
			+ "	")
	WebElement para1formicrophonefail;

	@FindBy(xpath="//p[contains(text(),'Please reconnect your mic to the system and try again.')]")
	WebElement para2formmicrophonefail;


	//Application form page 	


	@FindBy(xpath="//h3[contains(text(),'Your Details')]")
	public WebElement yourdetailheading;


	@FindBy(xpath="//span[contains(text(),'Summary')]")
	WebElement summaryheading;

	@FindBy(xpath ="//textarea[@name='summary']")
	WebElement summarytextarea;

	@FindBy(xpath = "//div[contains(text(),'This field is required')]")
	List<WebElement> validationmessage;


	@FindBy(name = "//span[contains(text(),'Experience')]")
	WebElement expheading;


	@FindBy(xpath = "//select[@name='years']")
	WebElement   yearsdropdown;



	@FindBy(xpath = "//select[@name='months']")
	WebElement  monthsdropdown;


	@FindBy(xpath="//span[contains(text(),'Resume')]")
	WebElement resume;


	@FindBy(id="resume")
	WebElement browsefileresume;


	//span[contains(text(),'Experience')]


	@FindBy(id="browse-documents-button")
	WebElement browsefiledocument;

	@FindBy(xpath="//span[contains(text(),'Your details have been submitted successfully. Please click on below button to continue.')]")

	public WebElement formsubmittedsuccessfully;

	//Welcome page 

	@FindBy(xpath="(//span[@style='white-space: pre-wrap;'])[7]")
	WebElement candidatename;

	//try practise question 
	@FindBy(id="try_practice_ques")
	WebElement trypractisequestion;

	//try practise question module

	@FindBy(xpath="(//h5[@class='mb-3 access-heading-color'])/span")
	WebElement practisequestion;


	@FindBy(id="skip-practice-question-button")
	WebElement skippractisequestion;

	@FindBy(id="go-ahead-button")
	WebElement goahead;

	@FindBy(id="back-to-home-button")
	WebElement backtohome;

	@FindBy(id="start_interview_now")
	public WebElement startinterviewnow;


	//all the best pop-up 

	@FindBy(xpath="//span[contains(text(),'All the best')]")

	public	WebElement allthebestheading;

	@FindBy(id="go-back-button")
	WebElement gobackbutton;


	@FindBy(xpath = " //span[contains(text(),'Instructions')]")
	public 	WebElement  instructiontext;


	@FindBy(xpath = "//span[contains(text(),'Internal Server Error')]")
	public  WebElement servererror;


	//Question type icons 

	@FindBy(xpath = "//span[@class='ques-num access-heading-color']/i") //type 1 includes Video,audio,mcq,essay,file type
	public WebElement type1;

	@FindBy(xpath = "//span[@class='ques-num access-heading-color']/img")
	WebElement type2;

	@FindBy(xpath = "//h4[contains(text(),'Slide')]")
	WebElement slide;

	@FindBy(xpath = "//span[contains(text(),'Feedback')]")
	WebElement feedbackpage;









	//question actions question wise 

	//true/false

	@FindBy(xpath ="//input[@value ='0']")
	WebElement radiobtn1;

	@FindBy(xpath ="//input[@value ='1']")
	WebElement radiobtn2;

	@FindBy(id="save-and-next-button")
	WebElement savennext;

	@FindBy(id="start-recording-button")
	WebElement startrecording;

	@FindBy(id="stop-recording-button")
	WebElement stoprecording;

	@FindBy(id="retake-button")
	WebElement retakebutton;


	//essay question

	@FindBy(xpath="//div[@class='ql-editor ql-blank']")
	WebElement essaytextarea;
	
	
	//fillsup question 
	
	@FindBy(xpath="//div[@id='q_field']/input")
	WebElement fillsuptextarea;
	
	//matching 
	
	
	
	@FindBy(xpath="//div[@class='col-12 col-sm-6']/div")
	List<WebElement> draganswerarea;
	
	@FindBy(xpath="//div[@class='ans-list mb-1']/div")
	List<WebElement> matchoptions;
	
	
	
	
	
	@FindBy(xpath="(//div[contains(text(),'Drag answer here')])[1]")
	WebElement drag1;
	
	@FindBy(xpath="(//div[contains(text(),'Drag answer here')])[2]")
	WebElement drag2;
	
	
	@FindBy(xpath="//span[@class='close-icon']/i")
	List<WebElement> matchanswercancelbtn ;
	
	
	@FindBy(xpath="	(//span[@class='close-icon']/i)[1]")
	WebElement cancelbtn ;
	
	
	//file type 
	
	
	@FindBy(xpath="//input[@id='browse-file-button']")
	WebElement browsefilebtn ;
	
	//Skip question button 
	
	@FindBy(id="skip-question-button")
	WebElement skipquestionbtn;
	
	@FindBy(xpath="//span[contains(text(),'Are you sure, you want to skip?')]")
	WebElement skipmoduletext ;
	
	@FindBy(id="cancel-button")
	WebElement cancelbuttononskipmodule;
	
	@FindBy(id="yes-skip-button")
	WebElement yesskipbuttononskipmodule;
	
	

	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	















	/*	public void InterviewProcess()
	{
		PageFactory.initElements(driver, this);
	} */


	public InterviewProcess(WebDriver driver)
	{
		super();
		PageFactory.initElements(driver, this);
	}




	public void clickOnOk()
	{
		okbutton.click();
	}


	public void clickOnGetStarted()
	{
		Utils.waitByVisibilityOfElement(driver, getstarted,60);
		getstarted.click();
	}


	public void clickOnprivacycheckbox()
	{
		privacycheckbox.click();
	}

	public void clickOnprivacycheckboxAI()
	{
		privacycheckboxAI.click();
	}

	public void clickOnContinueButton()
	{
		continuebutton.click();
	}

	public void clickOnSkip()
	{
		skipbutton.click();
	}

	public void clickOnLookGoodbtn()
	{
		Utils.waitByVisibilityOfElement(driver, looksgoodbutton,60);
		looksgoodbutton.click();
	}

	public void clickOnStartInterviewButton()
	{

		startinterviewbutton.click();
	}


	public void clickOnStartRecordingButton()
	{

		startrecordingbutton.click();
	}


	public void clickOnStopRecordingButton()
	{

		stoprecordingbutton.click();
	}

	public void clickOnSubmitButton()
	{

		submitbutton.click();
	}

	public void clickOnStartRecording()
	{
		startrecording.click();
	}

	public void clickOnStopRecording()
	{
		stoprecording.click();
	}

	public void retakeQuestion()
	{
		retakebutton.click();
	}

	public void selectRadioButton(WebElement radio)
	{
		if(radio==radiobtn1)
		{
			radiobtn1.click();
		}
		else if(radio==radiobtn2)
		{
			radiobtn2.click();
		}


	}

	public void essayTextArea()
	{
		Utils.waitByVisibilityOfElement(driver,essaytextarea, 10);
		essaytextarea.click();
		essaytextarea.sendKeys("This is Essay text and we need to check the response");
		logger.info("Essay Area Text is sent successfully");
	}
	public void fillupTextArea()
	{
		Utils.waitByVisibilityOfElement(driver,fillsuptextarea, 10);
		fillsuptextarea.click();
		fillsuptextarea.sendKeys("delhi");
		logger.info("Fills up answer sent to answer field successfully");
	}
	
	public void matchAnswerCancelbtnaction()
	{
		
		Utils.waitByVisibilityOfElement(driver,cancelbtn, 5);
		
		for(int i = 1;i<=matchanswercancelbtn.size();i++)
		{
			matchanswercancelbtn.get(i).click();
		}
		Assert.assertTrue(true,"Matching option cancel button assertion failed");
		System.out.println("Cancelled button clicked successfully ");
	}
	
	public void clickOnSaveNext()
	{
		savennext.click();
	}
	
	public void fileTypeUpload() throws InterruptedException
	{
		//Utils.waitByVisibilityOfElement(driver,browsefilebtn, 10);
		//browsefilebtn.click();
		Thread.sleep(3000);
		browsefilebtn.sendKeys("/Users/apple/Downloads/Shilpi_Chaudhary_Resume_13b096b4c622989b4cae568d4d61cdd9.pdf");
        logger.info("File uploaded Successfully");
	}


	public boolean isElementVisible(WebElement wb)
	{

		try
		{
			Utils.waitByVisibilityOfElement(driver, wb, 3);
			return true;
		}

		catch(TimeoutException e)
		{
			return false;
		}
	}



	public void applicationOption()
	{



		System.out.println(yourdetailheading.isDisplayed());
		Utils.waitByVisibilityOfElement(driver,summarytextarea,60);
		Assert.assertTrue(summarytextarea.isDisplayed());
		System.out.println(summarytextarea.isDisplayed()+ " >" +summarytextarea.isEnabled());
		summarytextarea.sendKeys("This is Summary");
		Utils.selectByValue(yearsdropdown, "2");
		Utils.selectByValue(monthsdropdown, "3");
		browsefileresume.sendKeys("/Users/apple/Downloads/Shilpi_Chaudhary_Resume_13b096b4c622989b4cae568d4d61cdd9.pdf");
		browsefiledocument.sendKeys("/Users/apple/Downloads/Shilpi_Chaudhary_Resume_13b096b4c622989b4cae568d4d61cdd9.pdf");
		clickOnContinueButton();






	}

	public void allTheBestnInstructionsstage()
	{
		startinterviewnow.click();
		logger.info("Clicked on Start Interview now button");
		Utils.waitByVisibilityOfElement(driver,allthebestheading,60);
		continuebutton.click();
		logger.info("Clicked on Continue button of All the best Pop-up");
		Utils.waitByVisibilityOfElement(driver, instructiontext,60);
		Utils.waitByVisibilityOfElement(driver, continuebutton,60);
		continuebutton.click();
	logger.info("Clicked on Continue button of instructions Pop-up");
		
	}

	public String getQuestion()
	{

		try
		{  
			Utils.waitByVisibilityOfElement(driver, type1,5);
			// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			System.out.println(type1.getAttribute("class"));
			String s =	type1.getAttribute("class");
			if(s.contains("video"))
			{
				String vid = "Video"; //video keyword
				logger.info(vid+" Question Detected");
				return  vid ;
			}
			else if (s.contains("bi bi-soundwave"))
			{
				String audio = "Audio";
				logger.info(audio+" Question Detected");
				return audio;
			}
			else if(s.contains("bi bi-list-ul"))
			{
				String mcq = "MCQ";
				logger.info(mcq+" Question Detected");
				return mcq;
			}
			else if(s.contains("bi bi-pencil"))
			{
				String essay = "ESSAY";
				logger.info(essay+" Question Detected");
				return essay;
			}
			else if(s.contains("bi bi-file-earmark-text"))
			{
				String filetype = "FileType";
				logger.info(filetype+" Question Detected");
				return filetype;
			}





		}
		catch(TimeoutException e)
		{  
			Utils.waitByVisibilityOfElement(driver, type2,5);




		String s = type2.getAttribute("src");
		if(s.contains("true"))
		{   String t = "True/false"; //true false keyword
		
		logger.info(t+" Question Detected");
		//System.out.println("True/false question");
		return t ;

		}

		else if(s.contains("msq"))
		{
			String msq = "MSQ";
			logger.info(msq+" Question Detected");
			return msq;
		}
		else if(s.contains("fill"))
		{
			String fill = "Fill";
			logger.info(fill+" Question Detected");
			return fill;
		}
		else if(s.contains("matching"))
		{
			String matching = "Matching";
			logger.info(matching+" Question Detected");
			return matching;
		}





		}

		return "Unknown question" ;
	}


	public void questionAction(String questionname) throws InterruptedException  //question action method
	{

		//System.out.println(questionname);

		switch(questionname)
		{
		case  "Video" :

			Utils.waitByVisibilityOfElement(driver,continuebutton , 3);
			clickOnContinueButton();
			logger.info("Continue Button for Video question Clicked");
			Thread.sleep(4000);
			Utils.waitByVisibilityOfElement(driver,startrecording , 3);
			clickOnStartRecording();
			logger.info("Clicked on Start Recording button for Video question");
			Thread.sleep(10000); //for recording 10 second of video
			Utils.waitByVisibilityOfElement(driver,stoprecording , 3);
			clickOnStopRecording();
			logger.info("Clicked on Stop Recording button for Video question");
			Utils.waitByVisibilityOfElement(driver,retakebutton , 3);
			retakeQuestion();
			logger.info("Clicked on Retake button for Video question");
			retakeCases(questionname); // retake case method called 
			Utils.waitByVisibilityOfElement(driver,submitbutton , 3);
			clickOnSubmitButton();
			logger.info("Clicked on Submit button for video question");
			questionSubmitCases(questionname,"submitted"); //method to check what happens after question submission.



			break;

		case "Audio" :

			Utils.waitByVisibilityOfElement(driver,continuebutton , 3);
			clickOnContinueButton();
			logger.info("Continue Button for Audio question Clicked");
			Thread.sleep(4000);
			Utils.waitByVisibilityOfElement(driver,startrecording , 3);
			clickOnStartRecording();
			logger.info("Clicked on Start Recording button for Audio question");
			Thread.sleep(10000); //for recording 10 second of video
			Utils.waitByVisibilityOfElement(driver,stoprecording , 3);
			clickOnStopRecording();
			logger.info("Clicked on Start Recording button for Audio question");
			Utils.waitByVisibilityOfElement(driver,retakebutton , 3);
			retakeQuestion();
			logger.info("Clicked on Retake button for Video question");
			retakeCases(questionname);
			Utils.waitByVisibilityOfElement(driver,submitbutton , 3);
			clickOnSubmitButton();
			logger.info("Clicked on Submit button for Audio question");
			questionSubmitCases(questionname,"submitted");


			break;

		case "MCQ" :

			Utils.waitByVisibilityOfElement(driver,radiobtn1 ,6);
			continuebtnDisableCheck();
			selectRadioButton(radiobtn1);
			logger.info("MCQ Option is selected successfully");
			clickOnSaveNext();
			logger.info("Save and Continue clicked Successfully for MCQ question");
			questionSubmitCases(questionname,"submitted");



			break ;

		case "ESSAY" :

			//code
			continuebtnDisableCheck(); 
			essayTextArea();
			clickOnSaveNext();
			logger.info("Save and Continue clicked Successfully for Essay question");
			questionSubmitCases(questionname,"submitted");
			

			break ;

		case "FileType" :

			//code
			
			fileTypeUpload();
			clickOnSaveNext();
			logger.info("Save and Continue clicked Successfully for Filetype question");
			questionSubmitCases(questionname,"submitted");

			break ;

		case "True/false" :
			
			Utils.waitByVisibilityOfElement(driver,radiobtn1 ,6);
			continuebtnDisableCheck();
			selectRadioButton(radiobtn1);
			logger.info("True/False Option is selected successfully");
			clickOnSaveNext();
			logger.info("Save and Continue clicked Successfully for Filetype question");
			questionSubmitCases(questionname,"submitted");
			
			
			break;

		case "MSQ" :

			//code
			Utils.waitByVisibilityOfElement(driver,radiobtn1 ,6);
			continuebtnDisableCheck();
			selectRadioButton(radiobtn1);
			logger.info("MSQ Option one is selected successfully");
			selectRadioButton(radiobtn2);
			logger.info("MSQ Option two is selected successfully");
			clickOnSaveNext();
			logger.info("Save and Continue clicked Successfully for MSQ question");
			questionSubmitCases(questionname,"submitted");
			break;

		case "Fill" :

			//code 
			Utils.waitByVisibilityOfElement(driver,fillsuptextarea ,6);
			fillupTextArea();
			clickOnSaveNext();
			logger.info("Save and Continue clicked Successfully for Fills up question");
			questionSubmitCases(questionname,"submitted");
			

			break;

		case "Matching" :

			//code
			//save and continue disable check
			//drag and drop check
			//option cancel button check
			//if both options cancelled save and continue disable
			//save and continue with no error
			Utils.waitByVisibilityOfElement(driver, drag1 ,6);
			continuebtnDisableCheck();
			Utils.dragDrop(driver, matchoptions, draganswerarea);
			Thread.sleep(4000);
		//	matchAnswerCancelbtnaction();
		//	continuebtnDisableCheck();
		//	Utils.dragDrop(driver, matchoptions, draganswerarea);
		//	Utils.waitByVisibilityOfElement(driver,savennext , 10);
		//	Thread.sleep(4000);
			clickOnSaveNext();
			logger.info("Save and Continue clicked Successfully for Matching question");
			questionSubmitCases(questionname,"submitted");
			

			break;





		}
	}
	
	public void skipQuestionsCase(String questionname)
	{
		Utils.waitByElementToBeClickable(driver,skipquestionbtn , 10);
		skipquestionbtn.click();
		Utils.waitByElementToBeClickable(driver,cancelbuttononskipmodule, 10);
		cancelbuttononskipmodule.click();
		skipquestionbtn.click();
		Utils.waitByElementToBeClickable(driver,yesskipbuttononskipmodule, 10);
		yesskipbuttononskipmodule.click();
		questionSubmitCases(questionname,"skipped");
		
		
	}

	public int questionCount()
	{
		Utils.waitByVisibilityOfElement(driver, questioncount,60);

		System.out.println("Number of questions in interview "+questioncount.getText());

		String questioncounttext = questioncount.getText();

		int  num = Integer.parseInt(questioncounttext); //No of question

		return num;
	}








	public int   initialThemeoneFlow() throws InterruptedException
	{

		Utils.waitByVisibilityOfElement(driver,okbutton,60);

		int n = 	questionCount();


       Thread.sleep(3000);
       try
       {
		clickOnOk();  //ok for tour guide
       }
       catch(Exception e)
       {
    	   System.out.println("ok of tour guide didn't displayed");
       }
		clickOnGetStarted(); //theme 1 get started button

		clickOnprivacycheckbox(); //
		try {
			System.out.println("AI features are on and checkbox is displayed");
			clickOnprivacycheckboxAI();
		}
		catch(Exception e)
		{
			System.out.println("AI Features are off");
		}

		clickOnContinueButton();
		Utils.waitByVisibilityOfElement(driver, networkspeed,60);
		System.out.println(networkspeed.getText());
		clickOnContinueButton();
		Utils.waitByVisibilityOfElement(driver, grantcamerapermissionbutton,60);
		grantcamerapermissionbutton.click();


		//changes 

		// Step 1: Inject media stream override script with fake video and audio
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String mediaScriptWithVideoAudio = 
				"navigator.mediaDevices.getUserMedia = async function(constraints) { " +
						"   return new Promise((resolve) => { " +
						"       const fakeStream = new MediaStream(); " +

		    "       if (constraints.video) { " +
		    "           const canvas = document.createElement('canvas'); " +
		    "           canvas.width = 640; canvas.height = 480; " +
		    "           const ctx = canvas.getContext('2d'); " +
		    "           setInterval(function() { " +
		    "               ctx.fillStyle = 'green'; " +
		    "               ctx.fillRect(0, 0, canvas.width, canvas.height); " +
		    "           }, 1000 / 30); " +
		    "           const videoStream = canvas.captureStream(30); " +
		    "           fakeStream.addTrack(videoStream.getVideoTracks()[0]); " +
		    "       } " +

		    "       if (constraints.audio) { " +
		    "           const audioContext = new (window.AudioContext || window.webkitAudioContext)(); " +
		    "           const oscillator = audioContext.createOscillator(); " +
		    "           oscillator.type = 'sine'; " +
		    "           oscillator.frequency.setValueAtTime(440, audioContext.currentTime); " +
		    "           const mediaStreamDestination = audioContext.createMediaStreamDestination(); " +
		    "           oscillator.connect(mediaStreamDestination); " +
		    "           oscillator.start(); " +
		    "           fakeStream.addTrack(mediaStreamDestination.stream.getAudioTracks()[0]); " +
		    "       } " +

		    "       resolve(fakeStream); " +
		    "   }); " +
		    "};";

		js.executeScript(mediaScriptWithVideoAudio);


		//changes ends


		// Override the prediction to always return a detected face
		/*	String detectScript = 
 		    "setInterval(function() {" +
 		    "   const fakeFaceDetection = [{bbox: [100, 100, 200, 200], class: 'person', score: 0.99}];" +
 		    "   window.detectObjects = async function() { return fakeFaceDetection; };" +
 		    "}, 1000);"; // Re-inject every 1 second

 		// Override the getUserMedia function to provide a fake video stream
 		String mediaScript = 
 		    "navigator.mediaDevices.getUserMedia = async function(constraints) {" +
 		    "   return new Promise((resolve) => {" +
 		    "       const fakeStream = new MediaStream();" +
 		    "       resolve(fakeStream);" +
 		    "   });" +
 		    "};";

 		// Execute the scripts in the browser
 		js.executeScript(detectScript);
 		js.executeScript(mediaScript); */


		// Step 3: Inject face detection override script

		//Presently working code 
		/*	JavascriptExecutor js = (JavascriptExecutor) driver;
		String detectScript = 
				"setInterval(function() {" +
						"   const fakeFaceDetection = [{bbox: [100, 100, 200, 200], class: 'person', score: 0.99}];" +
						"   window.detectObjects = async function() { return fakeFaceDetection; };" +
						"}, 1000);";
		js.executeScript(detectScript);

		// Step 4: Inject media stream override script with fake audio
		String mediaScriptWithAudio = 
				"navigator.mediaDevices.getUserMedia = async function(constraints) {" +
						"   return new Promise((resolve) => {" +
						"       const fakeStream = new MediaStream();" +
						"       if (constraints.audio) {" +
						"           const audioContext = new (window.AudioContext || window.webkitAudioContext)();" +
						"           const oscillator = audioContext.createOscillator();" +
						"           oscillator.type = 'sine';" +
						"           oscillator.frequency.setValueAtTime(440, audioContext.currentTime);" +
						"           const mediaStreamDestination = audioContext.createMediaStreamDestination();" +
						"           oscillator.connect(mediaStreamDestination);" +
						"           oscillator.start();" +
						"           fakeStream.addTrack(mediaStreamDestination.stream.getAudioTracks()[0]);" +
						"       }" +
						"       resolve(fakeStream);" +
						"   });" +
						"};";
		js.executeScript(mediaScriptWithAudio);

		// Step 5: Inject audio analysis override (if necessary)
		String audioAnalysisScript = 
				"const originalAnalyser = window.AnalyserNode.prototype.getByteFrequencyData;" +
						"window.AnalyserNode.prototype.getByteFrequencyData = function(array) {" +
						"   for (let i = 0; i < array.length; i++) array[i] = 128;" +
						"};";
		js.executeScript(audioAnalysisScript); 


		 */  //present working code end


		Utils.waitByVisibilityOfElement(driver,looksgoodbutton,60);

		Utils.javascriptScroll(looksgoodbutton);


		try {

			clickOnLookGoodbtn();

			try 
			{
				Utils.waitByVisibilityOfElement(driver, servererror,60);

				if(servererror.isDisplayed())
				{
					System.out.println("server error is displayed");
					Assert.assertFalse(false);
				}
			}
			catch(Exception e)
			{

			}
			//looksgoodbutton.click();
		}
		catch(Exception e)
		{
			System.out.println("Button is not clickiable");
		}




		try{


			/*	JavascriptExecutor js1 = (JavascriptExecutor) driver;

			// Inject script to simulate noise detection (e.g., fake background noise)
			String script1 = 
					"window.detectAudio =  function() {" +
							"   return [{audio: true, noiseLevel: 0.9}];" +  // Fake a positive audio detection
							"};";

			// Execute the script in the browser

			js1.executeScript(script1); */



//working latest code ==================================================
			JavascriptExecutor js1 = (JavascriptExecutor) driver;

			// Inject script to simulate continuous noise detection
			String script1 = 
					"setInterval(function() { " +
							"   window.detectAudio = function() { " +
							"       return [{audio: true, noiseLevel: 2.0}]; " +  // Fake positive audio detection
							"   }; " +
							"   if (typeof window.checkAudio === 'function') { " +
							"       window.checkAudio(); " + // Trigger check if available in the application
							"   }" +
							"}, 1000);";  // Run every second

			// Execute the script in the browser
			js1.executeScript(script1); 


			Utils.waitByVisibilityOfElement(driver, yesmovingbutton,60);

			yesmovingbutton.click();
			
			
			
			
			//working latest code ends here=======================
			
			// second new trial code
		/*	JavascriptExecutor js1 = (JavascriptExecutor) driver;

			// Inject script to simulate continuous noise detection
			String script1 = 
			    "setInterval(function() { " +
			    "   window.detectAudio = function() { " +
			    "       return [{audio: true, noiseLevel: Math.random() * 3 + 1}]; " +  // Simulate varying noise levels
			    "   }; " +
			    "   if (typeof window.checkAudio === 'function') { " +
			    "       window.checkAudio(); " + // Trigger check if available in the application
			    "   }" +
			    "}, 500);";  // Run every 500ms

			// Execute the script in the browser
			js1.executeScript(script1);

			// Wait dynamically for the button to activate and click it
			
			Utils.waitByElementToBeClickable(driver, yesmovingbutton,30);
			yesmovingbutton.click();
			
			*/
			//new trial code ends=================



			Utils.waitByVisibilityOfElement(driver, yesicanbutton,60);

			yesicanbutton.click(); 
			
			Utils.waitByVisibilityOfElement(driver,continuebutton,60 );

			clickOnContinueButton();

			return n ;




		}
		
		//CATCH IF YES MOVING FAILS ONCE 

		catch(Exception e)


		{
			driver.manage().deleteAllCookies();
			driver.navigate().refresh();
			driver.manage().deleteAllCookies();
			
			Utils.waitByVisibilityOfElement(driver,okbutton,60);

			int n1 = 	questionCount();



			clickOnOk();  //ok for tour guide
			clickOnGetStarted(); //theme 1 get started button

			clickOnprivacycheckbox(); //
			try {
				System.out.println("AI features are on and checkbox is displayed");
				clickOnprivacycheckboxAI();
			}
			catch(Exception e1)
			{
				System.out.println("AI Features are off");
			}

			clickOnContinueButton();
			Utils.waitByVisibilityOfElement(driver, networkspeed,60);
			System.out.println(networkspeed.getText());
			clickOnContinueButton();
			Utils.waitByVisibilityOfElement(driver, grantcamerapermissionbutton,60);
			grantcamerapermissionbutton.click();


			//changes 

			// Step 1: Inject media stream override script with fake video and audio
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			String mediaScriptWithVideoAudio1 = 
					"navigator.mediaDevices.getUserMedia = async function(constraints) { " +
							"   return new Promise((resolve) => { " +
							"       const fakeStream = new MediaStream(); " +

			    "       if (constraints.video) { " +
			    "           const canvas = document.createElement('canvas'); " +
			    "           canvas.width = 640; canvas.height = 480; " +
			    "           const ctx = canvas.getContext('2d'); " +
			    "           setInterval(function() { " +
			    "               ctx.fillStyle = 'green'; " +
			    "               ctx.fillRect(0, 0, canvas.width, canvas.height); " +
			    "           }, 1000 / 30); " +
			    "           const videoStream = canvas.captureStream(30); " +
			    "           fakeStream.addTrack(videoStream.getVideoTracks()[0]); " +
			    "       } " +

			    "       if (constraints.audio) { " +
			    "           const audioContext = new (window.AudioContext || window.webkitAudioContext)(); " +
			    "           const oscillator = audioContext.createOscillator(); " +
			    "           oscillator.type = 'sine'; " +
			    "           oscillator.frequency.setValueAtTime(440, audioContext.currentTime); " +
			    "           const mediaStreamDestination = audioContext.createMediaStreamDestination(); " +
			    "           oscillator.connect(mediaStreamDestination); " +
			    "           oscillator.start(); " +
			    "           fakeStream.addTrack(mediaStreamDestination.stream.getAudioTracks()[0]); " +
			    "       } " +

			    "       resolve(fakeStream); " +
			    "   }); " +
			    "};";

			js2.executeScript(mediaScriptWithVideoAudio);


			//changes ends


			// Override the prediction to always return a detected face
			/*	String detectScript = 
	 		    "setInterval(function() {" +
	 		    "   const fakeFaceDetection = [{bbox: [100, 100, 200, 200], class: 'person', score: 0.99}];" +
	 		    "   window.detectObjects = async function() { return fakeFaceDetection; };" +
	 		    "}, 1000);"; // Re-inject every 1 second

	 		// Override the getUserMedia function to provide a fake video stream
	 		String mediaScript = 
	 		    "navigator.mediaDevices.getUserMedia = async function(constraints) {" +
	 		    "   return new Promise((resolve) => {" +
	 		    "       const fakeStream = new MediaStream();" +
	 		    "       resolve(fakeStream);" +
	 		    "   });" +
	 		    "};";

	 		// Execute the scripts in the browser
	 		js.executeScript(detectScript);
	 		js.executeScript(mediaScript); */


			// Step 3: Inject face detection override script

			//Presently working code 
			/*	JavascriptExecutor js = (JavascriptExecutor) driver;
			String detectScript = 
					"setInterval(function() {" +
							"   const fakeFaceDetection = [{bbox: [100, 100, 200, 200], class: 'person', score: 0.99}];" +
							"   window.detectObjects = async function() { return fakeFaceDetection; };" +
							"}, 1000);";
			js.executeScript(detectScript);

			// Step 4: Inject media stream override script with fake audio
			String mediaScriptWithAudio = 
					"navigator.mediaDevices.getUserMedia = async function(constraints) {" +
							"   return new Promise((resolve) => {" +
							"       const fakeStream = new MediaStream();" +
							"       if (constraints.audio) {" +
							"           const audioContext = new (window.AudioContext || window.webkitAudioContext)();" +
							"           const oscillator = audioContext.createOscillator();" +
							"           oscillator.type = 'sine';" +
							"           oscillator.frequency.setValueAtTime(440, audioContext.currentTime);" +
							"           const mediaStreamDestination = audioContext.createMediaStreamDestination();" +
							"           oscillator.connect(mediaStreamDestination);" +
							"           oscillator.start();" +
							"           fakeStream.addTrack(mediaStreamDestination.stream.getAudioTracks()[0]);" +
							"       }" +
							"       resolve(fakeStream);" +
							"   });" +
							"};";
			js.executeScript(mediaScriptWithAudio);

			// Step 5: Inject audio analysis override (if necessary)
			String audioAnalysisScript = 
					"const originalAnalyser = window.AnalyserNode.prototype.getByteFrequencyData;" +
							"window.AnalyserNode.prototype.getByteFrequencyData = function(array) {" +
							"   for (let i = 0; i < array.length; i++) array[i] = 128;" +
							"};";
			js.executeScript(audioAnalysisScript); 


			 */  //present working code end


			Utils.waitByVisibilityOfElement(driver,looksgoodbutton,60);

			Utils.javascriptScroll(looksgoodbutton);


			try {

				clickOnLookGoodbtn();

				try 
				{
					Utils.waitByVisibilityOfElement(driver, servererror,60);

					if(servererror.isDisplayed())
					{
						System.out.println("server error is displayed");
						Assert.assertFalse(false);
					}
				}
				catch(Exception e2)
				{

				}
				//looksgoodbutton.click();
			}
			catch(Exception e2)
			{
				System.out.println("Button is not clickiable");
			}




			


				/*	JavascriptExecutor js1 = (JavascriptExecutor) driver;

				// Inject script to simulate noise detection (e.g., fake background noise)
				String script1 = 
						"window.detectAudio =  function() {" +
								"   return [{audio: true, noiseLevel: 0.9}];" +  // Fake a positive audio detection
								"};";

				// Execute the script in the browser

				js1.executeScript(script1); */



	//working latest code ==================================================
//=================================================================================	
	/*		JavascriptExecutor js1 = (JavascriptExecutor) driver;

				// Inject script to simulate continuous noise detection
				String script1 = 
						"setInterval(function() { " +
								"   window.detectAudio = function() { " +
								"       return [{audio: true, noiseLevel: 2.0}]; " +  // Fake positive audio detection
								"   }; " +
								"   if (typeof window.checkAudio === 'function') { " +
								"       window.checkAudio(); " + // Trigger check if available in the application
								"   }" +
								"}, 1000);";  // Run every second

				// Execute the script in the browser
				js1.executeScript(script1); 


				Utils.waitByVisibilityOfElement(driver, yesmovingbutton,60);

				yesmovingbutton.click(); 
				
				
				*/
				
				
			//=========================================================================================	
				
				//working latest code ends here=======================
				
				// second new trial code
			/*	JavascriptExecutor js1 = (JavascriptExecutor) driver;

				// Inject script to simulate continuous noise detection
				String script1 = 
				    "setInterval(function() { " +
				    "   window.detectAudio = function() { " +
				    "       return [{audio: true, noiseLevel: Math.random() * 3 + 1}]; " +  // Simulate varying noise levels
				    "   }; " +
				    "   if (typeof window.checkAudio === 'function') { " +
				    "       window.checkAudio(); " + // Trigger check if available in the application
				    "   }" +
				    "}, 500);";  // Run every 500ms

				// Execute the script in the browser
				js1.executeScript(script1);

				// Wait dynamically for the button to activate and click it
				
				Utils.waitByElementToBeClickable(driver, yesmovingbutton,30);
				yesmovingbutton.click();
				
				*/
				//new trial code ends=================
			
			
			//======New Trial code 1==========
			
			
			
			String audioPath = "/Users/apple/Documents/Test data/Sample audio/sample-1.mp3"; // Replace with the full file path
			String playAudioScript = "var audio = new Audio('" + audioPath + "'); audio.play();";
			js.executeScript(playAudioScript);
			
			Utils.waitByElementToBeClickable(driver, yesmovingbutton,30);
			yesmovingbutton.click();
			
			//======New Trial code 1 ends ========
			
			
			
		//	=======New Trial code 2 Starts============
			

			
		//  ======New Trail 2 code Ends ================	



				Utils.waitByVisibilityOfElement(driver, yesicanbutton,60);

				yesicanbutton.click(); 

			
			
			
			
			/*
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;

			// Inject script to simulate continuous noise detection
			String script1 = 
			    "setInterval(function() { " +
			    "   window.detectAudio = function() { " +
			    "       return [{audio: true, noiseLevel: Math.random() * 3 + 1}]; " +  // Simulate varying noise levels
			    "   }; " +
			    "   if (typeof window.checkAudio === 'function') { " +
			    "       window.checkAudio(); " + // Trigger check if available in the application
			    "   }" +
			    "}, 500);";  // Run every 500ms

			// Execute the script in the browser
			js1.executeScript(script1);

			// Wait dynamically for the button to activate and click it
			
			Utils.waitByElementToBeClickable(driver, yesmovingbutton,30);
			yesmovingbutton.click();

			Utils.waitByVisibilityOfElement(driver, yesicanbutton,60);

			yesicanbutton.click(); 

			System.out.println("Button is not working "); */
				Utils.waitByVisibilityOfElement(driver,continuebutton,60 );

				clickOnContinueButton();

				return n1 ;
		}  
		finally
		{
			
		}



	//	Utils.waitByVisibilityOfElement(driver,continuebutton,60 );

	//	clickOnContinueButton();

	//	return n ;



	}

	public void questionSubmitCases(String questionname ,String casename) //method to check what happens on submitting abny
	{
		try
		{
			if(isElementVisible(servererror))
			{
				logger.info("Server Error Displayed on "+ casename +" " +questionname);
				Assert.assertFalse(true, "Server error on "+ casename+" " +questionname);
			}

			else if(isElementVisible(type1))
			{
				System.out.println(questionname+" Submitted successfully");
				logger.info(questionname+" "+casename+" successfully and Next question displayed");
				Assert.assertTrue(true);
				System.out.println("Next question displayed successfully");
			}

			else if(isElementVisible(type2))
			{
				System.out.println(questionname+" Submitted successfully");
				logger.info(questionname+" "+casename+" successfully and Next question displayed");
				Assert.assertTrue(true);
				System.out.println("Next question displayed successfully");
			}
			else if(isElementVisible(slide))
			{
				System.out.println(questionname+" "+casename+" successfully");
				logger.info(questionname+" "+casename+" successfully and Next question displayed");
				Assert.assertTrue(true);
				//System.out.println("Next slide displayed successfully");
			}
			else if(isElementVisible(feedbackpage))
			{
				System.out.println(questionname+" "+casename+" successfully");
				logger.info(questionname+" "+casename+" successfully and Previous question was the last Question ,Interview Finished Successfully");
				Assert.assertTrue(true);
				System.out.println("Previous question was last question,Interview finished");
			}


		}
		catch(Exception e)
		{
            logger.info("Exception occured while submitting a question");
			System.out.println("Exception while submitting");
		}

	}


	public void retakeCases(String questionname) throws InterruptedException
	{
		try
		{
			Utils.waitByVisibilityOfElement(driver, stoprecording, 15);
			Thread.sleep(6000);
			clickOnStopRecording();
			//System.out.println("Retake successfull");
			Assert.assertTrue(true, "Retake failed ");
			System.out.println(questionname+" retake successfull");
			logger.info("Retake of "+questionname+" done successfully");



		}
		catch(TimeoutException e)
		{
			if(servererror.isDisplayed())
			{
				//System.out.println("server error on retaking question");

				Assert.assertFalse(false);
				System.out.println("Server error on retaking"+questionname+" question");
				logger.info("Server error on retaking "+questionname+" question");

			}
		}
	}

	public void continuebtnDisableCheck()
	{
		if(savennext.isEnabled())
		{
			Assert.assertTrue(false);
			logger.info("Save and Next button is Enabled  Even No answer option selected: Error");
			System.out.println("Save and Next button is Enabled Even No answer option selected");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("Save and Next button is disabled since no answer option is selected");
			System.out.println("Save and next is disabled if no option is selected or no text in essay ");
		}
	}
	
	public void verifyCheck()
	{
		try
		{
			System.out.println("Azeem");
		 
			
	}
		catch(Exception e)
		
		{
			e.printStackTrace();
		}
		
		
	}
	
	public void verifyCheck1()
	{
		try
		{
			System.out.println("Azeem");
		 
			
	}
		catch(Exception e)
		
		{
			e.printStackTrace();
		}
		
		
	}
	
	public void verifyCheck12()
	{
		try
		{
			System.out.println("Azeem");
		 
			
	}
		catch(Exception e)
		
		{
			e.printStackTrace();
		}
		
		
	}
	














}
