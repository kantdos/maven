package stepDefinations;

import org.junit.runner.RunWith;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination {

	@Given("^User is on Netbanking Page$")
	public void user_is_on_netbanking_page() throws Throwable {
		System.out.println("User is on Netbanking Page");
	}

	@When("^User login into application with User \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_into_application_with_user_something_and_something(String strArg1, String strArg2)
			throws Throwable {
		System.out.println("User login into application with User name and Password");
		System.out.println(strArg1);
		System.out.println(strArg2);
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Home page is populated");
	}

	 @And("^Cards displayed \"([^\"]*)\"$")
	    public void cards_displayed_something(String strArg1) throws Throwable {
		System.out.println(strArg1);
		 System.out.println("Cards are displayed");
	}

}