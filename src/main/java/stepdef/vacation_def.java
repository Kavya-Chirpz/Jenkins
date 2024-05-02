package stepdef;

import Actions.Vacation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class vacation_def {
	Vacation vac = new Vacation();
	@Then("i navigate to the new page and verify title")
	public void i_navigate_to_the_new_page() {
	  vac.vacpage();
	}

	@When("I click the dropdown and select country from {string} to {string}")
	public void i_click_the_dropdown_and_select_country_from_to(String string, String string2) {
	    vac.dropdown(string , string2);
	}
	
	@Then("I choose flight with lowest amount")
	public void i_choose_flight_with_lowest_amount() {
	   vac.chooseflight();
	}
	

}
