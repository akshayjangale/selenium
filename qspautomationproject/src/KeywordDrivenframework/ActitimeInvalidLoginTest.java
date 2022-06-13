package KeywordDrivenframework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class ActitimeInvalidLoginTest extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		//create object and open the browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Thread.sleep(2000);
		
		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/ActiTimeTestData.xlsx", "invalidcreds");
		
		for (int i=1; i<=rc; i++)
		{
			//read username and password from excel
			String username = flib.readExcelData("./data/ActiTimeTestData.xlsx", "invalidcreds", i, 0);
			String password = flib.readExcelData("./data/ActiTimeTestData.xlsx", "invalidcreds", i, 1);
			
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		}
		
		//close the browser
		bt.closeBrowser();
		
	}
}
