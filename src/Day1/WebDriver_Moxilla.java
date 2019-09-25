package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class WebDriver_Moxilla {
	WebDriver driver=null;
	 
	  @Test
	  public void Browserlaunch() {
		 System.setProperty("webdriver.firefox.driver","C:\\Users\\training_b6B.01.16\\Desktop\\Browser Drivers_DP\\geckodriver.exe");
		 driver= new FirefoxDriver();
		 String url="http://www.google.com";
		 driver.get(url);
	  }
	}