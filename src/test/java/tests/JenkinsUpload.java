package tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
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


public class JenkinsUpload {
WebDriver driver = new ChromeDriver();


{
	

    
    
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/div[2]/div/form/div/div[2]/div[8]/div/section/div/button")).click();

    
String fileUploadPath = System.getProperty("user.dir") + File.separator
+ "UploadPdfFile" + File.separator;

File file = new File(fileUploadPath);
File[] files = file.listFiles();
String name = null;
{
for (File f : files) {
System.out.println(f.getName());
name = f.getName();
}

//Copy your file's absolute path to the clipboard
StringSelection ss = new StringSelection(fileUploadPath + name);
Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
clipboard.setContents(ss, null);
try {
	{
	Robot robot = new Robot();
	
	
	robot.delay(250);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.delay(150);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	}
} catch (AWTException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}}}}
