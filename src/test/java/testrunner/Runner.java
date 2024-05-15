package testrunner;

//import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features", glue = { "stepDefinition" }, dryRun = false, monochrome = true,
		// plugin = {"pretty", "html:target/HtmlReports/report.html" },
		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
		tags = "@register"
		)

public class Runner extends AbstractTestNGCucumberTests {

}
