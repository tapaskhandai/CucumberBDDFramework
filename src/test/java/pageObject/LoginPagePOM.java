package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtilities;

public class LoginPagePOM extends SeleniumUtilities {

	public WebDriver ldriver;

	public LoginPagePOM(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);

	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement textbox_username;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement textbox_password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement button_login;

	public void enter_orange_hrm_usernameAndPassword(String username, String password) {

		enterText(textbox_username, username);
		enterText(textbox_password, password);

	}
	
	public void enter_submit() {
		
		button_login.click();
		log.info("Submit button clicked successfully");
	}

}
