package stepDefinition;

import io.cucumber.java.en.*;

public class HomePageSteps extends BaseClass {

	@When("I click on My Account button")
	public void i_click_on_my_account_button() {

		homepage.clickOnMyAccountOnProfile();
		log.info("Clicked on My Account On profile");
	}

	@When("I clcik on Adresses option")
	public void i_clcik_on_adresses_option() {

		homepage.clickOnAddressesOption();

	}

	@When("I enter the required details")
	public void i_enter_the_required_details() {

		homepage.enterAllFieldsOfNewAddress();
		log.info("All fields have been filled of new address");
	}

	@When("I click on save button")
	public void i_click_on_save_button() {

		homepage.clickOnSaveButton();
	}
}
