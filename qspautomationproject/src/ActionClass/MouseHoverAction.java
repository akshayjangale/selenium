package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 driver.get("https://www.bluestone.com/");
		 driver.findElement(By.id("denyBtn")).click();
		 Thread.sleep(3000);
		 
		 WebElement target = driver.findElement(By.xpath("//a[.='Rings ']"));
		 Actions act = new Actions(driver);
		 act.moveToElement(target).perform();
		Thread.sleep(3000);
		driver.close();
		
		 
	}
	

}
