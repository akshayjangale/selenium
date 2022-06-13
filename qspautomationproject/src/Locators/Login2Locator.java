package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login2Locator {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		
		// Login Operation for Gmail.com
		
		driver.findElement(By.name("identifier")).sendKeys("Admin");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();

		Thread.sleep(1000);
		driver.close(); 

	}

}
