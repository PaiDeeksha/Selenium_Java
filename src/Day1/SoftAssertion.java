package Day1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//import org.testng.Assert;

public class SoftAssertion {
  @Test
  public void method1() {
	  SoftAssert sa = new SoftAssert();
	  System.out.println("Checking first validation");
	  sa.assertEquals(10,11);
	  System.out.println("Checking second validation");
	  sa.assertEquals("Hello", "hello");
	  sa.assertAll();
  }
}
