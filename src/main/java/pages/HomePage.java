 package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BasePage {



    //*********Constructor*********
    public HomePage (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        
  
    }

    //*********Page Variables*********

    String baseURL = "https://suburbanjunglestaging.com/sbj-ques-form-los-angeles";
    
    //*********Page Methods*********

    //Go to Homepage
        public void goToJungler() throws InterruptedException {
        	


            driver.get(baseURL);
        
    }


    }


