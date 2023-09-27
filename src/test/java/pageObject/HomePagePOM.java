package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM {

	public WebDriver ldriver;

	public HomePagePOM(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);

	}

	@FindBy(xpath = "//li/span[text()='My account ']")
	WebElement profileIcon;

	@FindBy(xpath = "//span[text()='My account']")
	WebElement button_MyAccount;

	@FindBy(xpath = "(//a[text()='Get started'])[2]")
	WebElement get_started;

	@FindBy(xpath = "//a[text()='Addresses']")
	WebElement option_addresses;

	@FindBy(xpath = "//*[@id='Address_FirstName']")
	WebElement textbox_firstname_addresess;

	@FindBy(xpath = "//*[@id='Address_LastName']")
	WebElement textbox_lastname_addresess;

	@FindBy(xpath = "//*[@value='Save']")
	WebElement button_save_addresses;

	@FindBy(xpath = "//input[@type='button']")
	WebElement button_AddNew_addresses;

	public void mouseHoverOnProfileIcon(WebElement ele) {

		try {
			Actions action = new Actions(ldriver);
			action.moveToElement(ele).perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnMyAccountOnProfile() {

		mouseHoverOnProfileIcon(profileIcon);
		button_MyAccount.click();
	}

	public void clickOnAddressesOption() {

		option_addresses.click();
		button_AddNew_addresses.click();
	}

	public void enterAllFieldsOfNewAddress() {

		textbox_firstname_addresess.sendKeys("Andy");
		textbox_lastname_addresess.sendKeys("Mathur");
	}

	public void clickOnSaveButton() {

		button_save_addresses.click();
	}

}
