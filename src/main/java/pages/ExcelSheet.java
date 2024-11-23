package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet {
	
	 public static void main(String args[]) throws IOException, InterruptedException{

       	 
    	 
    	 

			WebDriver driver = new ChromeDriver();
			{
			driver.get("https://docs.google.com/spreadsheets/d/1sx9HWp8yxKqh4q31giaYXg68367QIZU4mDcqjgil4t0/edit#gid=0");
			driver.findElement(By.id("identifierId")).sendKeys("md.salman@jobma.com");
			driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Uber@1234");
			
			Thread.sleep(4000);

			driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
			
			Thread.sleep(6000);
			

			driver.findElement(By.xpath("//*[@id=\"0-scrollable\"]/div[2]")).click();			 
			}
			
	 }}	

