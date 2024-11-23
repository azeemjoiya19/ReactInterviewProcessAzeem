package tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DownloadFileDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {
	  
          String downloadimageID = "btn-download";
          
          
          Map<String, Object> prefs = new HashMap<String, Object>();
          prefs.put("download.default_directory",  System.getProperty("user.dir")+ File.separator + "externalFiles" + File.separator + "downloadFiles");

          ChromeOptions options = new ChromeOptions();
          options.setExperimentalOption("prefs", prefs);
          ChromeDriver driver = new ChromeDriver(options);
     /*     
		  Map<String, Object> prefsMap = new HashMap<String, Object>();
		  prefsMap.put("profile.default_content_settings.popups", 0);
		  prefsMap.put("download.default_directory", fileDownloadPath);
		  
		  ChromeOptions option = new ChromeOptions();
		  option.setExperimentalOption("prefs", prefsMap);
		  option.addArguments("--test-type");
		  option.addArguments("--disable-extensions");
		  */
          
		  driver.get("https://www.freeimages.com/photo/yellow-italian-car-1195655");
	  	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	  driver.manage().window().maximize();
	  	  Thread.sleep(2000);
  	      WebElement number = driver.findElement(By.id(downloadimageID));
          JavascriptExecutor executor = (JavascriptExecutor) driver; executor.executeScript("arguments[0].click();", number); 

	  	  System.out.println("Downloaded");
	  	  
	  	  
	  	  String uploadpath = "//*[@id=\"page-content\"]/div[1]/div/div/div[1]/div/div[1]/div[2]/button";
	  	  driver.get("https://remove.bg/upload");
	  	  WebElement upload = driver.findElement(By.xpath(uploadpath));
	      upload.click();
	  	     
	      
 	         Robot robot = new Robot();
	         StringSelection str = new StringSelection(System.getProperty("user.dir")+ File.separator + "externalFiles" + File.separator + "downloadFiles");
		     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		 
		     // Press Enter
		     robot.keyPress(KeyEvent.VK_ENTER);
		     
		    // Release Enter
		     robot.keyRelease(KeyEvent.VK_ENTER);
		     
		      // Press CTRL+V
		     robot.keyPress(KeyEvent.VK_CONTROL);
		     robot.keyPress(KeyEvent.VK_V);
		     
		    // Release CTRL+V
		     robot.keyRelease(KeyEvent.VK_CONTROL);
		     robot.keyRelease(KeyEvent.VK_V);
		     Thread.sleep(1000);
		            
		     robot.keyPress(KeyEvent.VK_ENTER);
		     robot.keyRelease(KeyEvent.VK_ENTER);
	}
}