package stepDefinition;

import java.util.List;

import org.apache.logging.log4j.LogManager;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseClass {

	@Before
	public void setup() {

		log = LogManager.getLogger("Steps");
		initBrowser();
	}

	@Given("I navigate to nopCommerce web page")
	public void i_navigate_to_nop_commerce_web_page() {

		driver.get(readconfig.getUrl());
		log.info("Navigated to" + readconfig.getUrl() + "URL");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("I click on register button of profile icon")
	public void i_click_on_register_button_of_profile_icon() {

		loginpage.clickOnRegisterButton();
	}

	@When("I fill all the input with below values")
	public void i_fill_all_the_input_with_below_values(DataTable dataTable) {

		List<List<String>> yourpersonaldetails = dataTable.asLists(String.class);
		String row1col0 = yourpersonaldetails.get(1).get(0);
		String row1col1 = yourpersonaldetails.get(1).get(1);
		String row1col2 = yourpersonaldetails.get(1).get(2);
		String row1col3 = yourpersonaldetails.get(1).get(3);
		String row1col4 = yourpersonaldetails.get(1).get(4);

		loginpage.enterYourpersonalDetails(row1col0, row1col1, row1col2, row1col3, row1col4);
	}

	@When("I click on check avaibility button")
	public void i_click_on_check_avaibility_button() {

		loginpage.clickOnCheckvaibility();

	}

	@When("I select country {string} from dropdown")

	public void i_select_country_from_dropdown(String country_name) {

		loginpage.selectCountryNameFromDropDown(country_name);

	}

	@When("I select timezone {string} from dropdown")
	public void i_select_timezone_from_dropdown(String timezone) {

		loginpage.selectTimezoneFromDropDown(timezone);
	}

	@When("I fill password fields with below values")
	public void i_fill_password_fields_with_below_values(DataTable dataTable) {

		List<List<String>> yourPassword = dataTable.asLists(String.class);
		List<String> row1 = dataTable.row(1);
		String password = row1.get(0);
		String confirmPassword = row1.get(1);
		loginpage.enterPasswordAndConfirmPassword(password, confirmPassword);
	}

	@When("I select your account details mycomany {string} from dropdown")
	public void i_select_your_account_details_mycomany_from_dropdown(String mycomany) {

		loginpage.selectMyCompanyName(mycomany);
	}

	@When("I select your account details mainactivity {string} from dropdown")
	public void i_select_your_account_details_mainactivity_from_dropdown(String mainactivity) {

		loginpage.selectMyActivity(mainactivity);

	}

	@When("I select your account details companysize {string} from dropdown")
	public void i_select_your_account_details_companysize_from_dropdown(String companysize) {

		loginpage.selectCompanySize(companysize);

	}

	@When("I enter my company website {string}")
	public void i_enter_my_company_website(String myWebsite) {

		loginpage.enterMyWebsite(myWebsite);
	}

	@When("I click on register button")
	public void i_click_on_register_button() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	@When("I click on login button of profile icon")
	public void i_click_on_login_button_of_profile_icon() {

		loginpage.clickOnLoginButtonOnProfile();
	}

	@When("I enter username {string} and password {string}")
	public void i_enter_username_and_password(String username, String password) {

		loginpage.enterLoginCredentials(username, password);
		log.info("Username and password entered");
		try {
			int n = 2 / 0;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("I click on login button")
	public void i_click_on_login_button() {

		loginpage.clickOnLoginButton();

	}

	@AfterStep
	public void takeScreenshot(Scenario sc) {
		addScreenshot(sc);
	}

	@After
	public void tearDown() {

		quitDriver();
	}
}
