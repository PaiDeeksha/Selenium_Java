package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demo1_TestNG {
  @Test
  public void f() {
	  System.out.println("this is test annotation");
  }
  
  @Test
  public void f1() {
	  System.out.println("this is test-f1 annotation");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is beforemethod annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is aftermethod annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is beforeclass annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is afterclass annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is beforetest annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is aftertest annotation");
  }
  

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is beforesuite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is aftersuite annotation");
  }

}
