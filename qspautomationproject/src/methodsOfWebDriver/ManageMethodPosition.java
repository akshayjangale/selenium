package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodPosition {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
		// set the position of browser
		                               // (x , y)
		Point targetPosition = new Point(200, 100); // set the coordinates for position of the browser
		driver.manage().window().setPosition(targetPosition ); 
	}
}
