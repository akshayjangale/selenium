package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneChatbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		Thread.sleep(10000);
		
		//click on chatbox
		WebElement target = driver.findElement(By.xpath("//p[.='CHAT with our experts !']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
		Thread.sleep(2000);
		
		//enter the details in chatbox
		
		
	}
}
