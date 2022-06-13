package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeMinimize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().minimize(); // to minimize the browser window
		driver.get("https:\\www.amazon.in");
		Thread.sleep(10000);
		driver.close();
	}
}
