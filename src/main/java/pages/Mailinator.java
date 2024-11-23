package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mailinator {
	
	
	
    static String url = "https://www.mailinator.com/v4/public/inboxes.jsp?to=sam";
    
    public static void main(String args[]) throws IOException, InterruptedException{
  
    WebDriver driver = new ChromeDriver();
  //   String mailclick = "//*[@id=\"row_sam-1640848336-34095\"]/td[3]";
     
    {
    
    	driver.get(url);
    	
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[contains(text(),'Suburban Jungle Team')]")).click();
    	
    	Thread.sleep(5000);
    	driver.switchTo().frame("html_msg_body");
    	driver.findElement(By.linkText("here")).click();
    	
    	
}
}
    
}