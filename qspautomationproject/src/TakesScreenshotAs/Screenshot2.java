package TakesScreenshotAs;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Screenshot2 {
	
public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		
		//way 2 : downcast to remote web driver
		RemoteWebDriver rw = (RemoteWebDriver)driver;
		File src = rw.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/screenshot2.png");
		Files.copy(src, dest);
		
		Thread.sleep(3000);
		driver.close();
		
}
}
