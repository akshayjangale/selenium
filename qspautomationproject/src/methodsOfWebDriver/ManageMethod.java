package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	public static void main(String[] args) {
		
	//set the size of the browser
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/asus/Downloads/singleselectdropdown.html");
		
		//Dimension targetSize= new Dimension(450,350); // setting the window size in pixels
		//driver.manage().window().setSize(targetSize); //use to set the size
		
		Dimension targetSize = new Dimension(500, 500);
		driver.manage().window().setSize(targetSize);
	}

}
