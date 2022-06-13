package pageobjectmodel;

import java.io.IOException;

public class ActitimeLoginTestValid extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		//open the browser
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		//get data from property file
		Flib flib = new Flib();
		String validUsername = flib.readPropertyFile(PROP_PATH, "username");
		String validPassword = flib.readPropertyFile(PROP_PATH, "password");
		
		//login to actitime
		LoginPage lp = new LoginPage(driver);
		lp.actiTimevalidLogin(validUsername, validPassword);
		
		//close the browser
		bt.tearDown();
	}
}
