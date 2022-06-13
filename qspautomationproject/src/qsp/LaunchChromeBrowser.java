package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();  //used to open the chrome browser
		driver.get("https:\\www.amazon.in"); //to open the web application
		Thread.sleep(10000); // delay of 10 sec. 10000=10 seconds
		driver.close();
	}

}
