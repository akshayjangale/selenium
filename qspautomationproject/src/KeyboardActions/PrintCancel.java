package KeyboardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class PrintCancel {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		
		Thread.sleep(3000);
		
		Robot bot = new Robot();
		
		//generate print pop up
		bot.keyPress(KeyEvent.VK_CONTROL);
		bot.keyPress(KeyEvent.VK_P);
		bot.keyRelease(KeyEvent.VK_P);
		bot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(4000);
		
		//hit the TAB button
		bot.keyPress(KeyEvent.VK_TAB);
		bot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(4000);
		
		//hit the enter button
		bot.keyPress(KeyEvent.VK_ENTER);
		bot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
