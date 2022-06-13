package StepDefinations;

import io.cucumber.java.en.*;

public class LoginDemoSteps {
	
	@Given("Browser is open")
	public void browser_is_open() {
	    System.out.println();
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		System.out.println();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println(); 
	}
	@And("user clicks on login")
	public void user_clicks_on_login() {
	    System.out.println();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println();
	}

}
