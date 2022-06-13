package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickFirefox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		 
		 WebElement target = driver.findElement(By.xpath("//span[.='right click me']"));
		 Actions act = new Actions(driver);
		 act.contextClick(target).perform();
		 
		 Thread.sleep(3000);
		 driver.close();
		 
	}

}
