package KeywordDrivenframework;

import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class ActitimeValidLoginTest extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		//object creation to access the methods
		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		
		//read the data from property file
		String username = flib.readPropertyFile("./data/config.properties", "username");
		String password = flib.readPropertyFile("./data/config.properties", "password");
		
		//open the browser, use the method created in basetest
		bt.openBrowser();
		Thread.sleep(3000);
		
		//login to actitime
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		//close the browser
		bt.closeBrowser();
		
	}
}
