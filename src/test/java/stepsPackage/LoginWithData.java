package stepsPackage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithData 
{
	@Given("I am at landing page")
	public void i_am_at_landing_page() {
	    System.out.println("Given Statement");
	}

	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String uname) {
	    System.out.println("entering user name"+uname);
	}

	@When("I enter the password as {string}")
	public void i_enter_the_password_as(String string) {
	System.out.println("entering password"+string);
	}

	@When("I click on submit button")
	public void i_click_on_submit_button() {
	   System.out.println("clicking submit button");
	}

	@Then("I should get logged into app")
	public void i_should_get_logged_into_app() {
	   System.out.println("Logged in application");
	}




}
