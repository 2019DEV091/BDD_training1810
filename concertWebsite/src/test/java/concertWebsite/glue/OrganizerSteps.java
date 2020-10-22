package concertWebsite.glue;

import concertWebsite.model.ConcertOrganizer;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;

public class OrganizerSteps {

	private ConcertOrganizer john;
	private Concerts concerts;
	
	public OrganizerSteps(Concerts concerts) {
		super();
		this.concerts = concerts;
	}
	
	@ParameterType(value = "\\w+")
	public ConcertOrganizer organizer(String name) {
		ConcertOrganizer organizer = new ConcertOrganizer();
		organizer.setName(name);
		return organizer;
	}
	
	
	@Given("{organizer} who is a concert organizer")
	public void aConcertOrganizerNamed(ConcertOrganizer organizer) {
		john = organizer;
	}
	
	@Given("(s)he added a concert named {string} to the upcoming concerts")
	public void organizerAddedAConcertNamed(String concert) {
		john.addConcert(concert);
	}
}
