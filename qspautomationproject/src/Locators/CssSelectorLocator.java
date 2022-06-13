package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		
		//login instagram
		
		driver.findElement(By.cssSelector("input[name ='username']")).sendKeys("akshayjangale");
		driver.findElement(By.cssSelector("input[name ='password']")).sendKeys("akshay123");
		driver.findElement(By.cssSelector("button[class *='L3NKy']")).click();
		
		Thread.sleep(1500);
		
	}

}
