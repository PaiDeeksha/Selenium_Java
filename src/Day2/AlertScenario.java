package Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AlertScenario {
  @Test
  public void f() {
	  WebDriver driver=Driver_Utility.getDriver("chrome");
	  String url="http://demowebshop.tricentis.com/";
	  driver.navigate().to(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	  driver.findElement(By.xpath("//input[@value='Search']")).click();
	  Alert alt=driver.switchTo().alert();
	  driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
	  System.out.println("Alert test is "+alt.getText());
	  alt.accept();
	  driver.close();
	  
	  
	  

	  
  }
  
}
