package testngflag;

import org.testng.annotations.Test;

public class Class1 {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedrivers.exe");
	  
  }
}
