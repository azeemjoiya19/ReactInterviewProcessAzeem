package pages;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;



public class PageServerResponse extends BasePage{

	

static String SJstaging = "https://raventools.com/marketing";
static String UJstaging = "http://18.232.53.196:3001/";
static String Agentstaging = "http://18.232.53.196:3002/";
static String SJblog = "https://suburbanjunglegroup.com/blog/";
static String UJblog = "https://raventools.com/marketing";

public PageServerResponse(WebDriver webDriver, WebDriverWait wait) throws IOException {
		super(webDriver, wait);
		// TODO Auto-generated constructor stub


	        
	        openNewTab(webDriver, SJstaging, 1);
	        openNewTab(webDriver, UJstaging, 2);
	        openNewTab(webDriver, Agentstaging, 3);
	        openNewTab(webDriver, SJblog, 4);
	        openNewTab(webDriver, UJblog, 5);
	        
	        
}


	    public static void openNewTab(WebDriver webDriver, String url, int position) throws IOException {
	    	
	        ((JavascriptExecutor) webDriver).executeScript("window.open()");
	        ArrayList<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
	        System.out.println("Launch URL : " + tabs.size() + " >position: " + position + " >\t" + SJstaging);
	          
                          webDriver.manage().window().maximize();
                          webDriver.switchTo().window(tabs.get(position));
	                      webDriver.get(SJstaging);
	       
		                  HttpURLConnection c1= (HttpURLConnection)new URL(SJstaging).openConnection();
                          c1.setRequestMethod("HEAD");
			      	      c1.connect();
			      	      int r = c1.getResponseCode();
			      	      System.out.println("Http response code of Surburban-Staging: " + r);
			  	        
			      	     
			  	          System.out.println("Launch URL : " + tabs.size() + " >position: " + position + " >\t" + UJstaging);
				          webDriver.get(UJstaging);
	                      
				          
				          HttpURLConnection c2= (HttpURLConnection)new URL(UJstaging).openConnection();
	      	              c2.setRequestMethod("HEAD");
			      	      c2.connect();
                          int s = c2.getResponseCode();
	                      System.out.println("Http response code of Urban-Staging: " + s);
	                      
	                      
	                      System.out.println("Launch URL : " + tabs.size() + " >position: " + position + " >\t" + Agentstaging);
				          webDriver.get(Agentstaging);
				          
				          
	                      HttpURLConnection c3= (HttpURLConnection)new URL(Agentstaging).openConnection();
	      	              c3.setRequestMethod("HEAD");
			      	      c3.connect();
                          int t = c3.getResponseCode();
	                      System.out.println("Http response code of Agent-Staging: " + t);
	                      
	                      
	                      System.out.println("Launch URL : " + tabs.size() + " >position: " + position + " >\t" + SJblog);
				          webDriver.get(SJblog);
				          
				          
	                      HttpURLConnection c4= (HttpURLConnection)new URL(SJblog).openConnection();
	      	              c4.setRequestMethod("HEAD");
			      	      c4.connect();
                          int u = c4.getResponseCode();
	                      System.out.println("Http response code of Surburban-Blog: " + u);
	                      
	                      
	                      System.out.println("Launch URL : " + tabs.size() + " >position: " + position + " >\t" + UJblog);
				          webDriver.get(UJblog);
				          
				          
	                      HttpURLConnection c5= (HttpURLConnection)new URL(UJblog).openConnection();
	      	              c5.setRequestMethod("HEAD");
			      	      c5.connect();
                          int v = c5.getResponseCode();
	                      System.out.println("Http response code of Urban-Blog: " + v);
	                      

	            	   webDriver.close();
		      } 
	    
	
	    }
	




