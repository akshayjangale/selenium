package GoogleClassroomAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		
		//Login to gmail
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("j.akshay3492@gmail.com");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		
		
	}

}
