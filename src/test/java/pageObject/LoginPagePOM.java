package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtilities;

public class LoginPagePOM extends SeleniumUtilities {

	public WebDriver ldriver;

	public LoginPagePOM(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);

	}

	@FindBy(xpath = "//span[text()='Product']")
	WebElement testElement;

	@FindBy(xpath = "//li/span[text()='My account ']")
	WebElement profileIcon;

	@FindBy(xpath = "//span[text()='Log in']")
	WebElement button_login;

	@FindBy(xpath = "//span[text()='Register']")
	WebElement button_register;

	@FindBy(xpath = "//*[@id='FirstName']---------")
	WebElement textbox_firstname_register;

	@FindBy(xpath = "//*[@id='LastName']")
	WebElement textbox_lastname_register;

	@FindBy(xpath = "//*[@id='Email']")
	WebElement textbox_email_register;

	@FindBy(xpath = "//*[@id='ConfirmEmail']")
	WebElement textbox_confirmemail_register;

	@FindBy(xpath = "//*[@id='Username']")
	WebElement textbox_username_register;

	@FindBy(xpath = "//input[@id='check-availability-button']")
	WebElement button_checkAvaibility_register;

	@FindBy(xpath = "//select[@id='CountryId']")
	WebElement dropDown_country_register;

	@FindBy(xpath = "//select[@id='TimeZoneId']")
	WebElement dropDown_timezone_register;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement textbox_password_register;

	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	WebElement textbox_confirmPassword_register;

	@FindBy(xpath = "//select[@id='Details_CompanyIndustryId']")
	WebElement dropdown_MyComoanyPrimaarily_register;

	@FindBy(xpath = "//select[@id='Details_CompanyRoleId']")
	WebElement dropdown_MyMainActivity_register;

	@FindBy(xpath = "//select[@id='Details_CompanySizeId']")
	WebElement dropdown_HowManyPeople_register;

	@FindBy(xpath = "//input[@id='Details_CompanyWebsiteUrl']")
	WebElement textbox_myWebsite_register;

	@FindBy(xpath = "//*[@id='register-button']")
	WebElement button_Register;

	@FindBy(xpath = "//*[@id='Username']")
	WebElement textbox_usernmae_login;

	@FindBy(xpath = "//*[@id='Password']")
	WebElement textbox_password_login;

	@FindBy(xpath = "//*[@value='Log in']")
	WebElement buttonlogin_login;

	public void clickOnRegisterButton() {

		mouseHoverOnProfileIcon(ldriver, profileIcon);
		button_register.click();
	}

	public void clickOnLoginButtonOnProfile() {

		mouseHoverOnProfileIcon(ldriver, profileIcon);
		button_login.click();
	}

	public void enterYourpersonalDetails(String fName, String lName, String email, String confirmEmail,
			String username) {

		textbox_firstname_register.sendKeys(fName);
		textbox_lastname_register.sendKeys(lName);
		textbox_email_register.sendKeys(email);
		textbox_confirmemail_register.sendKeys(confirmEmail);
		textbox_username_register.sendKeys(username);

	}

	public void clickOnCheckvaibility() {

		button_checkAvaibility_register.click();
	}

	public void enterLoginCredentials(String username, String password) {

		textbox_usernmae_login.sendKeys(username);
		textbox_password_login.sendKeys(password);
	}

	public void clickOnLoginButton() {
		buttonlogin_login.click();
	}

	public void selectCountryNameFromDropDown(String countryName) {

		selectFromDropDownByvisibleText(dropDown_country_register, countryName);

	}

	public void selectTimezoneFromDropDown(String timezone) {

		selectFromDropDownByvisibleText(dropDown_timezone_register, timezone);

	}

	public void selectMyCompanyName(String myCompanyName) {

		selectFromDropDownByvisibleText(dropdown_MyComoanyPrimaarily_register, myCompanyName);
	}

	public void selectMyActivity(String activityName) {

		selectFromDropDownByvisibleText(dropdown_MyMainActivity_register, activityName);
	}

	public void selectCompanySize(String companyName) {

		selectFromDropDownByvisibleText(dropdown_HowManyPeople_register, companyName);
	}

	public void enterPasswordAndConfirmPassword(String password, String confirmPassword) {
		enterText(textbox_password_register, password);
		enterText(textbox_confirmPassword_register, confirmPassword);

	}

	public void enterMyWebsite(String text) {

		enterText(textbox_myWebsite_register, text);
	}

}
