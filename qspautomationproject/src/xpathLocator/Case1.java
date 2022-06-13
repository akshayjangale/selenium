package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		
		//case 1 : xpath using unique attribute
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.close();
		
	}

}
