package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize(); // to maximize the browser window
		driver.get("https:\\www.amazon.in");
		Thread.sleep(10000);
		driver.close();
	}
}
