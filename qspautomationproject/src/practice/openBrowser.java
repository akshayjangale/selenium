package practice;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		String source = driver.getPageSource();
		System.out.println(title);
		System.out.println(url);
		System.out.println(source);
		
		driver.switchTo().activeElement().sendKeys("nikonwala_akshay",Keys.ENTER);
		
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
		driver.close();
	}

}
