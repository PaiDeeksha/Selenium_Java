package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoWebShop {
  @Test
  public void f() {
	  WebDriver driver=Driver_Utility.getDriver("chrome");
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Log in")).click();
	  driver.findElement(By.id("Email")).sendKeys("aravind.guggilla57@gmail.com");
	  driver.findElement(By.id("Password")).sendKeys("aravind");
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	  Assert.assertTrue(driver.getTitle().startsWith("Demo"));
	  driver.close();
	  driver.quit();
	  
  }
}
