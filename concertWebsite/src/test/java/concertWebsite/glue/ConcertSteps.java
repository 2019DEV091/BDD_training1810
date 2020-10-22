package concertWebsite.glue;

import java.util.List;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ConcertSteps {

	private final Concerts upcomingConcerts;

	private List<String> concerts;

	public ConcertSteps(Concerts upcomingConcerts) {
		super();
		this.upcomingConcerts = upcomingConcerts;
	}
	
	@When("I look at the upcoming concerts")
	public void ilookAtUpcomingConcerts() {
		this.concerts = upcomingConcerts.getConcerts();
	}
	
	@Then("I will see the concert {string} listed")
	public void iWillSeeConcertListed(String concert) {
		//assertion
	}

}
