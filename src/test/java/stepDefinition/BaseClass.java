package stepDefinition;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.cucumber.java.Scenario;
import pageObject.HomePagePOM;
import pageObject.LoginPagePOM;
import utilities.ReadConfigClass;

public class BaseClass {

	public static WebDriver driver;
	public static LoginPagePOM loginpage;
	public static HomePagePOM homepage;
	public static Logger log;
	public ReadConfigClass readconfig;

	public void initBrowser() {

		readconfig = new ReadConfigClass();
		readconfig.setUpProperties();

		if (readconfig.broswerName().equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();
			log.info("Chromedriver Initiated");

		} else if (readconfig.broswerName().equalsIgnoreCase("edge")) {

			EdgeOptions options = new EdgeOptions();
			options.addArguments("--guest");
			driver = new EdgeDriver(options);
			log.info("Edgedriver Initiated");

		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		loginpage = new LoginPagePOM(driver);
		homepage = new HomePagePOM(driver);
	}

	public void addScreenshot(Scenario scenario) {

		if (scenario.isFailed() == true) {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			final byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}

	}

	public String randomStringGenerator() {

		return RandomStringUtils.randomAlphabetic(5);
	}

	public void quitDriver() {

		driver.quit();
		log.info("Broswer Closed");

	}
}
