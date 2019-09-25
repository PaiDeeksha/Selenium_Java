package Day1;

import org.testng.annotations.Test;

public class Demo2_TestNG {
  @Test(priority=1)
  public void Register() {
	  System.out.println("This is register method");
  }
  @Test(priority=2)
  public void Login() {
	  System.out.println("This is login method");
  }
  @Test(priority=3,enabled=false)
  public void HomePage() {
	  System.out.println("This is homepage method");
	  }
  @Test
  public void LogOut() {
	  System.out.println("This is logout method");
	  }
}
