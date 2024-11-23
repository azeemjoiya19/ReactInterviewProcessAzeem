package com.jobma.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;




import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;



public class TestBase {


	public  static Logger logger;
	Properties prop ; 


	static protected WebDriver driver ; 

	static WebElement element;
	
	


	public TestBase() 
	{
		logger = LogManager.getLogger(this.getClass());
		
			
		

	}






	public static void browserSetup(String browser)
	{

		if(browser.equalsIgnoreCase("chrome"))
		{


			WebDriverManager.chromedriver().setup();

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--use-fake-ui-for-media-stream");
			options.addArguments("--use-fake-device-for-media-stream");
			options.addArguments("start-maximized");
			options.setExperimentalOption("prefs", new java.util.HashMap<String, Object>() {{
				put("profile.default_content_setting_values.media_stream_camera", 1);
				put("profile.default_content_setting_values.media_stream_mic", 1);
				put("profile.default_content_setting_values.geolocation", 1);
			}});


			driver = new ChromeDriver(options);
		
			




		}

		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();

			FirefoxOptions options = new FirefoxOptions();
			options.addPreference("media.navigator.permission.disabled", true); // Disable permission prompt
			options.addPreference("media.navigator.streams.fake", true); // Use fake streams
			options.addPreference("media.navigator.streams.video", true); // Enable video
			options.addPreference("media.navigator.streams.audio", true); // Enable audio
			options.addPreference("geo.enabled", true); // Enable geolocation

			// Start Firefox in maximized mode
			options.addArguments("-start-maximized");

			driver = new FirefoxDriver(options);



		}

		else if(browser.equalsIgnoreCase("edge"))
		{

			EdgeOptions options = new EdgeOptions();

			options.addArguments("--use-fake-ui-for-media-stream");
			options.addArguments("--use-fake-device-for-media-stream");
			options.addArguments("start-maximized");
			options.setExperimentalOption("prefs", new java.util.HashMap<String, Object>() {{
				put("profile.default_content_setting_values.media_stream_camera", 1);
				put("profile.default_content_setting_values.media_stream_mic", 1);
				put("profile.default_content_setting_values.geolocation", 1);
			}});

			driver = new EdgeDriver(options);
		}

		if(driver != null)
		{
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
	}





}
