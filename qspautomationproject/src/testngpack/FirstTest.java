package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTest {
  @Test
  public void a() {
	  Reporter.log("a");
  }
  
  @Test
  public void z() {
	  Reporter.log("z");
  }
  
  @Test
  public void g() {
	  Reporter.log("g");
  }
  
  @Test
  public void y() {
	  Reporter.log("y");
  }
  
  @Test
  public void d() {
  }
}
