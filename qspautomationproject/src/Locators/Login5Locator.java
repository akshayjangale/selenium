package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login5Locator {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://myanimelist.net/login.php?from=%2F");
		
		// Login Operation for my anime list
		
		driver.findElement(By.id("loginUserName")).sendKeys("admin");
		driver.findElement(By.id("login-password")).sendKeys("user123");
		driver.findElement(By.className("inputButton btn-form-submit btn-recaptcha-submit")).click();
		
		Thread.sleep(1500);
		driver.close();

	}

}
