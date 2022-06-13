package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		// Login Instagram
		
		driver.findElement(By.xpath("//input[@name ='username']")).sendKeys("akki_jangale");
		driver.findElement(By.xpath("//input[@name ='password']")).sendKeys("akshay123");
		driver.findElement(By.xpath("//button[@class ='sqdOP  L3NKy   y3zKF     ']")).click();
		
		Thread.sleep(1500);
		
	}

}
