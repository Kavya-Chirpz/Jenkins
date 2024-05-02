package stepdef;

import Actions.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage_step {
	HomePage actions = new HomePage();
	
	
	@Given("To navigate to login page")
	public void to_navigate_home_page() {
	    actions.loginpage();
	}
	
	@When("To check the title of the Page")
	public void to_check_the_title_of_the_page() {
		actions.titlepage();
	   
	}





	@Then("I check the amount is in format")
	public void i_check_the_amount_is_in_format() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I verify the booking id")
	public void i_verify_the_booking_id() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
