package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.SeleniumUtilities;

public class HomePagePOM extends SeleniumUtilities {

	public WebDriver ldriver;

	public HomePagePOM(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);

	}

	@FindBy(xpath = "(//img[@alt='profile picture'])[1]")
	WebElement button_logged_user;

	@FindBy(xpath = "//a[normalize-space()='Logout']123")
	WebElement button_logout;

	public void mouseHoverOnProfileIcon(WebElement ele) {

		try {
			Actions action = new Actions(ldriver);
			action.moveToElement(ele).perform();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void verify_homepage_title() {

		Assert.assertEquals(get_title(), "OrangeHRM", "Title does not match");
		log.info("Tile verified successfully");
	}

	public void verify_logout() {
		
		button_logged_user.click();
		button_logout.click();
		log.info("Logout button clicked successfully");

	}

}
