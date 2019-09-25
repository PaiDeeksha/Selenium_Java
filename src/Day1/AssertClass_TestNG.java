package Day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClass_TestNG {
  @Test
  public void method1() {
	 Assert.assertTrue(20>18);
  }
  
  @Test
  public void method2() {
	 Assert.assertFalse("Hello".equals("Hey"));
  }
  @Test
  public void method3() {
	 Assert.assertFalse(30>5);
  }
  
  @Test
  public void method4() {
	 Assert.assertTrue("Hello".startsWith("H"));
  }
  
  @Test
  public void method5() {
	  int actual=20;
	  int expected=20;
	 Assert.assertEquals(actual,expected);
  }
  
  @Test
  public void method6() {
	 Assert.assertEquals(30,30);
  }
  
  @Test
  public void method7() {
	  Object obj1=null;
	 Assert.assertNull(obj1);
  }
  
  @Test
  public void method8() {
	  Object obj2= new Object();
	 Assert.assertNull(obj2);
  }
  
}
