package Day1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import  org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_demo1 {
        WebDriver driver=null;
		 
  @Test
  public void Browserlaunch() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\Browser Drivers_DP\\chromedriver.exe");
	 driver= new ChromeDriver();
	 String url="http://www.google.com";
	 driver.get(url);
  }
}
