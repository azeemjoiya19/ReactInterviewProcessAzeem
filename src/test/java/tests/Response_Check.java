package tests;


	import org.openqa.selenium.By;
    import org.openqa.selenium.JavascriptExecutor;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

    import java.util.ArrayList;
	import java.io.IOException;
	import java.net.MalformedURLException;

	public class Response_Check {

	      
		   public static void main(String[] args) throws
		   MalformedURLException, IOException {
	          WebDriver webDriver =new ChromeDriver();
	          
		      String staging = "https://suburbanjunglestaging.com/testimonials/";

	          openNewTab(webDriver, "http://dantri.com.vn/phap-luat.htm", 1);
	          openNewTab(webDriver, "http://dantri.com.vn/xa-hoi.htm", 2);
	          openNewTab(webDriver, "http://dantri.com.vn/the-gioi.htm", 3);
	          openNewTab(webDriver, "http://dantri.com.vn/the-thao.htm", 4);
	          openNewTab(webDriver, "http://dantri.com.vn/giao-duc-khuyen-hoc.htm", 5);
		   }
	
	      public static void openNewTab(WebDriver webDriver, String url, int position) {
	          ((JavascriptExecutor) webDriver).executeScript("window.open()");
	          ArrayList<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
	          System.out.println("tabs : " + tabs.size() + " >position: " + position + " >\t" + url);
	          webDriver.switchTo().window(tabs.get(position));
	          webDriver.get(url);
	                    
	
	      }}
	      