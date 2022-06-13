package TakesScreenshotAs;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot6 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com");
		
		//Way 5 : screenshot of web element
		WebElement target = driver.findElement(By.xpath("//img[@class='s4Iyt']"));
		File src = target.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/screenshot6.png");
		Files.copy(src, dest);
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
