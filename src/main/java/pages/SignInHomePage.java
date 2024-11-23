package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SignInHomePage extends BasePage {



    //*********Constructor*********
    public SignInHomePage (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Page Variables*******
    String baseURL = "https://testjungler-v2.suburbanjungleinc.com/login";

    
    //*********Page Methods*********

    //Go to Homepage
        public void goToJungler() throws InterruptedException {


            driver.get(baseURL);
        
    }

}