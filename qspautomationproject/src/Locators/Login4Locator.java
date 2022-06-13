package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login4Locator {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.spotify.com/en/login/?continue=https%3A//open.spotify.com/__noul__%3Fl2l%3D1%26nd%3D1&_locale=en-IN");
		
		// Login Operation for spotify
		
		driver.findElement(By.id("login-username")).sendKeys("admin");
		driver.findElement(By.id("login-password")).sendKeys("user123");
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(2000);
		driver.close();

	}

}
