package stepDefinition;

import io.cucumber.java.en.*;

public class HomePageSteps extends BaseClass {

	@When("I verify user logs out from homepage")
	public void i_verify_user_logs_out_from_homepage() {

		homepage.verify_logout();
		
	}

	
}
