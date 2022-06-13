package KeywordDrivenframework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {
		
		static WebDriver driver;
		
		//method to open browser
		public void openBrowser() throws EncryptedDocumentException, IOException {
			
			Flib flib = new Flib();
			
			//read the browser value from property file
			String browserValue = flib.readPropertyFile("./data/config.properties", "browser");
			
			//read the url from property file
			String url = flib.readPropertyFile("./data/config.properties", "URL");
			
			//use the value of the browser
			if (browserValue.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				
			}
			
			else if (browserValue.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				
			}
			
			else
			{
				
				System.out.println("enter correct choice");
			}
		}
			
			//method to close the browser
			public void closeBrowser()
			{
				driver.quit();
			}
		
}
