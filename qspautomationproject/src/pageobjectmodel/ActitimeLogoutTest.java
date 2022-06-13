package pageobjectmodel;

import java.io.IOException;

public class ActitimeLogoutTest extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.setUp(); //open the browser
		
		Flib flib = new Flib();
		String validUsername = flib.readPropertyFile(PROP_PATH, "username");
		String validPassword = flib.readPropertyFile(PROP_PATH, "password");
		
		//login operation
		LoginPage lp = new LoginPage(driver);
		lp.actiTimevalidLogin(validUsername, validPassword);
		
		//logout operation
		HomePage hp = new HomePage(driver);
		hp.clickLogout();
		
		//close the browser
		bt.tearDown();
		
	}
}
