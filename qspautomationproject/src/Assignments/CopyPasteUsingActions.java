package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPasteUsingActions {

	//select the text on web page, copy it and paste it in search bar
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		
		// click on downloads
		driver.findElement(By.xpath("//a[.='Downloads']")).click();
		Thread.sleep(3000);
		
		//copy the text 'downloads'
		WebElement target = driver.findElement(By.xpath("//h1[.='Downloads']"));
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		
		//copy the selected text
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		
		//go to search bar and click
		driver.findElement(By.xpath("//input[@class ='form-control td-search-input ds-input']")).click();
		Thread.sleep(2000);
		
		//paste the copied text in search bar and press enter key
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(4000);
		driver.close();
		
	}
}
