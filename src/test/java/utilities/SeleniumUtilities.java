package utilities;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefinition.BaseClass;

public class SeleniumUtilities extends BaseClass{
	

	public void mouseHoverOnProfileIcon(WebElement ele) {

		try {
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void scrollToElement(WebElement ele) {

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

	public void explicitWait(WebDriver driver, WebElement ele, long timeoutinsec) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutinsec));
		// String[] data = ele.toString().split(" -> ")[1].replace("]", "").split(": ");
		String str = ele.toString();
		System.out.println(str);
		String[] data = str.split(":");
		String data2 = data[2].trim();
		String data3 = data2.substring(0, data2.length() - 1); // 0....18 (19th will be excluded)
		System.out.println(data3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(data3)));

	}

	public void switchTowindowByTitle(String title) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String childWindow : allWindows) {
			driver.switchTo().window(childWindow);
			if (driver.getTitle().equalsIgnoreCase(title)) {
				System.out.println("Switched to desired child window");
			}

		}

	}

	public String get_title() {

		String title = "";

		try {
			title = driver.getTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return title;

	}

}
