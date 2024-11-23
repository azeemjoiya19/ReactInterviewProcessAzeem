package com.jobma.qa.utils;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.jobma.qa.base.TestBase;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends TestBase {
	
	
	 public static void  waitByVisibilityOfElement(WebDriver driver1 ,WebElement element ,int duration )
	 {
		 WebDriverWait w = new WebDriverWait(driver1,Duration.ofSeconds(duration));
		 w.until(ExpectedConditions.visibilityOf(element));
	 }
	 
	 public static void  waitByElementToBeClickable(WebDriver driver1 ,WebElement element ,int duration )
	 {
		 WebDriverWait w = new WebDriverWait(driver1,Duration.ofSeconds(duration));
		 w.until(ExpectedConditions.elementToBeClickable(element));
	 }
	 
	 
	 public static void javascriptScroll(WebElement element)
	 {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", element);
	 }
	 
	 
	 public static void selectByValue(WebElement dropdown ,String val)
	 
	 {
		 Select s = new Select(dropdown);
		 s.selectByValue(val);
	 }
	 
	 public static void dragDrop(WebDriver driver,List<WebElement> source ,List<WebElement> target)
	 {
		 
		 
		 Actions actions = new Actions(driver);
		 
		/* if (source.size() != target.size()) 
		 {
		        throw new IllegalStateException("Number of answers and target fields do not match!");
		    } */
		 
		 
		// System.out.println(source.size());
		// System.out.println(target.size());
		 
		 
		 for (int i = 0; i < source.size(); i++) 
			 
		 {
			// System.out.println("Source element is displayed: " + source.get(i).isDisplayed());
			// System.out.println("Target element is displayed: " + target.get(i).isDisplayed());

			//   System.out.println(source.get(i));
			 //  System.out.println(target.get(i)); 
			 //   System.out.println("==================");
			    
		        actions.dragAndDrop(source.get(i), target.get(i)).perform();
		      
		    }
		 
		 
	 }
	 
	 public static String captureScreenhot(String tname)
	 {
		 String timestamp = new SimpleDateFormat("yyyy.mm.dd.HH.mm.ss").format(new Date());
		 TakesScreenshot ts = (TakesScreenshot)driver;
		  File sourceFile =    ts.getScreenshotAs(OutputType.FILE);
		  String targetFilePath = System.getProperty("user.dir")+"/screenshots/" +tname+ " - "+timestamp+".png";
	      File target = new File(targetFilePath);
	      try {
	          FileUtils.copyFile(sourceFile, target);
	        //  System.out.println("Screenshot saved at: " + targetFilePath);
	      } catch (IOException e) {
	          e.printStackTrace();
	        //  System.out.println("Failed to save screenshot!");
	      }
	      return targetFilePath;
	      
	 }
	 
	 
	 

}
