package GoogleClassroomAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario5 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(3000);
		
		WebElement target = driver.findElement(By.xpath("//a[.='Rings ']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
		//select diamond rings
		driver.findElement(By.xpath("//a[.='Diamond' and @title='Diamond Rings']")).click();
		
		//get price list
		driver.findElement(By.xpath("//span[@class='title style-fill i-right']")).click();
		driver.findElement(By.xpath("//section[@class='block sort-by pull-right']")).click();
		
	}

}
