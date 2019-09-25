package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class WebDriver_IE {
	WebDriver driver=null;
	 
	  @Test
	  public void Browserlaunch() {
		 System.setProperty("webdriver.ie.driver","C:\\Users\\training_b6B.01.16\\Desktop\\Browser Drivers_DP\\IEDriverServer.exe");
		 driver= new InternetExplorerDriver();
		 String url="http://www.google.com";
		 driver.get(url);
	  }
	}
