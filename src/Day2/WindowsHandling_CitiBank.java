package Day2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WindowsHandling_CitiBank {
  @Test
  public void f() {
	  WebDriver driver=Driver_Utility.getDriver("chrome");
	  driver.get("https://www.online.citibank.co.in");
	  driver.manage().window().maximize();
	  //driver.findElement(By.linkText("Click Here")).click();
	  Set<String> windows=driver.getWindowHandles();
	  Iterator<String> it=windows.iterator();
	  String parentwindow=it.next();
	  String childwindow=it.next();
	  driver.switchTo().window(childwindow);
	  driver.findElement(By.xpath("//img[@alt='LOGIN NOW']")).click();
	  System.out.println("url of the page"+driver.getCurrentUrl());
	  driver.close();
	  driver.switchTo().window(parentwindow);
	  System.out.println("parent window title is "+driver.getTitle());
  }
}