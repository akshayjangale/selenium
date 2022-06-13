package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.twitter.com");
		 Thread.sleep(3000);
		 
		 //Case 2 : xpath using text()
		 
		 driver.findElement(By.xpath("//span[text()='Sign up with phone or email']")).click();
		 
		 Thread.sleep(3000);
		 driver.close();
		 
	}

}
