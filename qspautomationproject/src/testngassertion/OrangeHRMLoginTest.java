package testngassertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class OrangeHRMLoginTest {
	WebDriver driver;
	
	@BeforeTest
	public void setProperty( ) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	@BeforeMethod
	public void launchBrowser( ) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
  @Test
  public void testCase() throws InterruptedException {
	  //verify page title for login page
	  String actualLoginPageTitle = driver.getTitle();
	  //soft assertion
	  SoftAssert softAssert = new SoftAssert();
	  softAssert.assertEquals(actualLoginPageTitle, "OrangeHRM");
	  
	  //perform login operation
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  
	  //check home page is opened or not
	  WebElement dashboard = driver.findElement(By.xpath("//h1[.='Dashboard']"));
	  boolean statusOfDashboard = dashboard.isDisplayed();
	  Assert.assertEquals(statusOfDashboard, true);
	  Thread.sleep(3000);
	  
	  //verify home page title
	  String actualHomePageTitle = driver.getTitle();
	  softAssert.assertEquals(actualHomePageTitle, "OrangeHRMHomePage");
	  
	  Reporter.log("create user", true);
	  Reporter.log("create contact", true);
	  softAssert.assertAll(); //to mark the test case failed in case soft assert fails,
	  //after failing soft assert, it dose not mark test case as failed
	  //we didn't get to know which case is failed
	  
  }
}
