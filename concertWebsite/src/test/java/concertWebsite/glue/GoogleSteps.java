package concertWebsite.glue;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps {
	private GooglePage googlePage;

	public GoogleSteps(GooglePage googlePage) {
		super();
		this.googlePage = googlePage;
	}

	@Given("I am on the Google page")
	public void i_am_on_the_google_page() {
	    googlePage.goToGooglePage();
	}
	
	@When("I search for {string}")
	public void searchFor(String searchterm){
		googlePage.clickAndEnterSomething(searchterm);
	}
	
	@Then("the url of result {int} is {string}")
	public void theResultIs(int result, String url) {
		assertEquals(googlePage.getUrlOfResult(result), url);
	}
}
