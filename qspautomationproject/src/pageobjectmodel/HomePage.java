package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//declaration
	@FindBy(xpath = "//a[.='Logout']") private WebElement logOutLink;
	@FindBy(xpath = "//a[.='Create new tasks']") private WebElement createNewTask;
	@FindBy(linkText = "Settings") private WebElement settings;
	@FindBy(id= "SubmitTTButton") private WebElement saveLeaveTimeBtn;
	
	//initialization
	public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getLogOutLink() {
		return logOutLink;
	}
	public WebElement getCreateNewTask() {
		return createNewTask;
	}
	public WebElement getSettings() {
		return settings;
	}

	public WebElement getSaveLeaveTimeBtn() {
		return saveLeaveTimeBtn;
	}

	public void setSaveLeaveTimeBtn(WebElement saveLeaveTimeBtn) {
		this.saveLeaveTimeBtn = saveLeaveTimeBtn;
	}
	
	
	//operational methods
	public void clickLogout() {
		logOutLink.click();
	}
	
	public void clickSaveLeaveTimeBtn() {
		saveLeaveTimeBtn.click();
	}
	
}
