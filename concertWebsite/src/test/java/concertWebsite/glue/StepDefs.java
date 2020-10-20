package concertWebsite.glue;

import org.testng.Assert;

import concertWebsite.model.ConcertOrganizer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs {
	
	ConcertOrganizer organizer;
	
	@Given("a concert organizer")
	public void a_concert_organizer() {
		organizer = new ConcertOrganizer();
	}

	@When("the organizer adds a concert named {string}")
	public void the_organizer_adds_a_concert_named(String concert) {
		organizer.addConcert(concert);
	}

	@Then("the organizer will see {string} listed")
	public void the_organizer_will_see_listed(String concert) {
	    Assert.assertEquals(organizer.getListedConcert(), concert);
	}

}