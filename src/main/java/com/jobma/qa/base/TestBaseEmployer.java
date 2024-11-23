package com.jobma.qa.base;
	

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.relevantcodes.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class TestBaseEmployer {
	
	
	Properties prop ; 
	
	
static protected WebDriver driver ; 

static WebElement element;
	
	
	   

		
	   public void setup () {
	        //Create a Chrome driver. All test classes use this.

           WebDriverManager.chromedriver().setup();
	        ChromeOptions chromeOptions = new ChromeOptions();
	        chromeOptions.addArguments("--remote-allow-origins=*");
	        chromeOptions.addArguments("--disable-notifications");
	        chromeOptions.addArguments("--disable-popup-blocking");

	     //   chromeOptions.addArguments("--headless");
	        driver = new ChromeDriver(chromeOptions);
	
		

	        
	        driver.manage().window().maximize();  
	 	    driver.get("https://testing.jobma.com/login");
	    
			

	
}


  /*   public void reponsecode() throws InterruptedException, IOException {
    	 
    	 try {
             // Replace "YOUR_SELECTOR" with the actual selector for your clickable elements
   
                 // Get the current URL after the click
                 String currentUrl = driver.getCurrentUrl();
                 
                 // Check the response code of the current URL
                 int responseCode = getResponseCode(currentUrl);
                 System.out.println("URL: " + currentUrl + " - Response Code: " + responseCode);

                 if (responseCode != 200) {
                     System.out.println("Non-200 response code encountered: " + responseCode);
                 }
                 
                 // Navigate back if necessary to continue with the next element
                 driver.navigate().back();
                 Thread.sleep(2000);  // Wait for the page to load
             
         } finally {}
         }
         
     

     // Method to get HTTP response code of a URL
     public static int getResponseCode(String urlString) throws IOException {
         URL url = new URL(urlString);
         HttpURLConnection connection = (HttpURLConnection) url.openConnection();
         connection.setRequestMethod("GET");
         connection.connect();
         return connection.getResponseCode(); 
     
}  */
     

	 
	    public void teardown() 
	    {
	  
	    driver.quit();
	    
	    //   driver.quit();
            }

	}