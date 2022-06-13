package testngflag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag7 {
  @Test (groups = "Functional")
  public void ft1() {
	 Reporter.log("Ft1",true); 
  }
  
  @Test (groups = "Smoke")
  public void st1() {
	  Reporter.log("St1",true);
  }
  
  @Test (groups = "Integration")
  public void it1() {
	  Reporter.log("It1",true);
  }
  
  //---------------------
  @Test (groups = "Functional")
  public void ft2() {
	 Reporter.log("Ft2",true); 
  }
  
  @Test (groups = "Smoke")
  public void st2() {
	  Reporter.log("St2",true);
  }
  
  @Test (groups = "Integration")
  public void it2() {
	  Reporter.log("It2",true);
  }
  
  //----------------------------
  
  @Test (groups = "Functional")
  public void ft3() {
	 Reporter.log("Ft3",true); 
  }
  
  @Test (groups = "Smoke")
  public void st3() {
	  Reporter.log("St3",true);
  }
  
  @Test (groups = "Integration")
  public void it3() {
	  Reporter.log("It3",true);
  }
  
  //--------------------------------
  
  @Test (groups = "Functional")
  public void ft4() {
	 Reporter.log("Ft4",true); 
  }
  
  @Test (groups = "Smoke")
  public void st4() {
	  Reporter.log("St4",true);
  }
  
  @Test (groups = "Integration")
  public void it4() {
	  Reporter.log("It4",true);
  }
  
  //------------------------------
  
  @Test (groups = "Functional")
  public void ft5() {
	 Reporter.log("Ft5",true); 
  }
  
  @Test (groups = "Smoke")
  public void st5() {
	  Reporter.log("St5",true);
  }
  
  @Test (groups = "Integration")
  public void it5() {
	  Reporter.log("It5",true);
  }
  
  //--------------------------------
  @Test (groups = "Functional")
  public void ft6() {
	 Reporter.log("Ft6",true); 
  }
  
  @Test (groups = "Smoke")
  public void st6() {
	  Reporter.log("St6",true);
  }
  
  @Test (groups = "Integration")
  public void it6() {
	  Reporter.log("It6",true);
  }
  
}
