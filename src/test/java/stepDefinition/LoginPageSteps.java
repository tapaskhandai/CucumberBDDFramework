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

public class LoginPageSteps extends BaseClass {

	@Before
	public void setup() {

		log = LogManager.getLogger("Steps");
		initBrowser();
	}

	@AfterStep
	public void takeScreenshot(Scenario sc) {
		addScreenshot(sc);
	}

	@After
	public void tearDown() {

		quitDriver();
	}

	@Given("I navigate to orangeHRM url")
	public void I_navigate_to_orangeHRM_url() {

		navigateToUrl();

	}

	@When("I enter user {string} and password {string}")
	public void i_enter_and(String username, String password) {

		loginpage.enter_orange_hrm_usernameAndPassword(username, password);
	}

	@When("I click on login-submit button")
	public void i_click_on_login_submit_button() {

		loginpage.enter_submit();

	}

	@Then("I verify title of the home page")
	public void i_verify_title_homepage() {

		homepage.verify_homepage_title();
	}

	@When("I click on register button of profile icon")
	public void i_click_on_register_button_of_profile_icon() {

	}

	@When("I fill all the input with below values")
	public void i_fill_all_the_input_with_below_values(DataTable dataTable) {

		List<List<String>> yourpersonaldetails = dataTable.asLists(String.class);
		String row1col0 = yourpersonaldetails.get(1).get(0);
		String row1col1 = yourpersonaldetails.get(1).get(1);
		String row1col2 = yourpersonaldetails.get(1).get(2);
		String row1col3 = yourpersonaldetails.get(1).get(3);
		String row1col4 = yourpersonaldetails.get(1).get(4);

		// loginpage.enterYourpersonalDetails(row1col0, row1col1, row1col2, row1col3,
		// row1col4);
	}

	@When("I select country {string} from dropdown")

	public void i_select_country_from_dropdown(String country_name) {

	}

	@When("I fill password fields with below values")
	public void i_fill_password_fields_with_below_values(DataTable dataTable) {

		List<List<String>> yourPassword = dataTable.asLists(String.class);
		List<String> row1 = dataTable.row(1);
		String password = row1.get(0);
		String confirmPassword = row1.get(1);
		// loginpage.enterPasswordAndConfirmPassword(password, confirmPassword);
	}

	@When("I select your account details mycomany {string} from dropdown")
	public void i_select_your_account_details_mycomany_from_dropdown(String mycomany) {

		// loginpage.selectMyCompanyName(mycomany);
	}

	@When("I select your account details companysize {string} from dropdown")
	public void i_select_your_account_details_companysize_from_dropdown(String companysize) {

		// loginpage.selectCompanySize(companysize);

	}

}
