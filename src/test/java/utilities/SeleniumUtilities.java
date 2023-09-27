package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtilities {

	public void mouseHoverOnProfileIcon(WebDriver driver, WebElement ele) {

		try {
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void scrollToElement(WebDriver driver, WebElement ele) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView()", ele);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void selectFromDropDownByvisibleText(WebElement ele, String text) {

		try {
			Select select = new Select(ele);
			select.selectByVisibleText(text);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void enterText(WebElement ele, String text) {

		try {
			ele.sendKeys(text);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
