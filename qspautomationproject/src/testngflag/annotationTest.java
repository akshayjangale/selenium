package testngflag;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class annotationTest {
  @Test
  public void f() {
	  
	  Reporter.log("Homepage", true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Login", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("logout", true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("signup", true);
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
