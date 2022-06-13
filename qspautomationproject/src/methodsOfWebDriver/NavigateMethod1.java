package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod1 { //in this we create a local variable for navigate()

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https:\\www.google.com");
		
		driver.switchTo().activeElement().sendKeys("nikonwala_akshay",Keys.ENTER); // switch to activeElement(i.e. search box), sendKeys used to tyoe in box and Keys used to give command
		Thread.sleep(4000);
		
		Navigation nav = driver.navigate(); // creating a local variable for navigate method
		
		nav.back();
		Thread.sleep(3000);
		
		nav.forward();
		Thread.sleep(3000);
		
		nav.refresh();
	}

}
