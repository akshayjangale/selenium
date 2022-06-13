package GoogleClassroomAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario19 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(3000);
	
		WebElement target = driver.findElement(By.xpath("//li[@class='menuparent gold-coins']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("//span[.='Coins by Design']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='filter 5gms']")).click();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
