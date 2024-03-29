package Day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class WebDriver_Demo2 {
  @Test
  public void f() {
	  WebDriver driver=Driver_Utility.getDriver("chrome");
	  String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.navigate().refresh();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  System.out.println("The title of the web page is"+driver.getTitle());
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.name("userName")).sendKeys("Lalitha");
	  driver.findElement(By.id("password")).sendKeys("password123");
	  driver.findElement(By.name("Login")).click();
	  driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[4]/a/span")).click();
	  WebElement objtable=driver.findElement(By.xpath("/html/body/b/section/div"));
	  List<WebElement> Allrows=objtable.findElements(By.tagName("tr"));
	  for(WebElement row: Allrows)
	  {
		  List<WebElement> cells=row.findElements((By.tagName("td")));
		  for(WebElement cell: cells)
		  {
			  System.out.println(cell.getText());
		  }
	  }
	  
	
	  List<WebElement> SpecificRow=objtable.findElements(By.tagName("tr"));
	  for(int n=1;n<Allrows.size();n++)
	  {
		  List<WebElement> cells=Allrows.get(n).findElements((By.tagName("td")));
		  System.out.println("Orderid: "+cells.get(0).getText());
		  System.out.println("Date of order: "+cells.get(2).getText());
	  }
	  
  }
}
