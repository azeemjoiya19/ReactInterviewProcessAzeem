	package pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;


	public class ReportHome extends BasePage {



	    //*********Constructor*********
	    public ReportHome (WebDriver driver, WebDriverWait wait) {
	        super(driver, wait);
	    }

	    //*********Page Variables*******
	    
	    String baseURL = "https://selectsourceintl.orangescrum.com/classicdashboard";

	    
	    //*********Page Methods*********

	    //Go to Homepage
	    
	        public void goToJungler() throws InterruptedException {


	            driver.get(baseURL);
	        
	    }

	}

