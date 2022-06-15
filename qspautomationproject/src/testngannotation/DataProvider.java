package testngannotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider {
	WebDriver driver;
	
	@ BeforeMethod
	public void setup( ) {
		System.setProperty("wedriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do");
	}
	
	@org.testng.annotations.DataProvider(name = "testActiTimeData")
	public Object[][] dataProvider() {
		
		Object[][] data = new Object[5][2];
		return data;
		
	}
  @Test(dataProvider = "testActiTimeData")
  public void login(String username, String password) {
	  driver.findElement(By.name("username")).sendKeys(username);
	  driver.findElement(By.name("pwd")).sendKeys(password);
	  driver.findElement(By.id("loginButton")).click();
  }
  
  @AfterMethod
  public void tearDown( ) {
	  driver.quit();
  }
  
}
