package stepsPackage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps 
{
	@Given("I am at the login page")
   public void goToLoginPage()
   {
	   System.out.println("Given Statement");
   }
	@When("I enter username")
	public void enteringUserName()
	{
		System.out.println("Entering UserName");
	}
	@When("I enter password")
	public void enteringPassword()
	{
		System.out.println("Entering password");
	}
	@When("I click on login button")
	public void loginButton()
	{
		System.out.println("Clicking on login button");
	}
	@Then("I should get login into application")
	public void validateLogin()
	{
		System.out.println("Validating Login");
	}
	@Given("I am at login page")
	public void atLoginPage()
	{
		System.out.println("Navigate to the login page");
	}
	@Then("I should see the title")
	public void validateTitle()
	{
		System.out.println("validating the title");
	}
}
