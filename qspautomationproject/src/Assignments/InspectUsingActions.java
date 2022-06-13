package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.jmx.ManagedAttribute;
import org.openqa.selenium.interactions.Actions;

public class InspectUsingActions {
	
	//go to web page, right click on element and click on inspect using keyboard actions
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		driver.findElement(By.xpath("//a[.='Downloads']")).click();
		Thread.sleep(3000);
		
		//right click on downloads text
		WebElement target = driver.findElement(By.xpath("//h1[.='Downloads']"));
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
		Thread.sleep(2000);
		
		//go to inspect using keyboard actions
		Robot robot = new Robot();
		for(int i=0; i<10; i++)
		{
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(250);
		}
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
