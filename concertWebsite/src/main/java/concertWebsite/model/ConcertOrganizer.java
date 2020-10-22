package concertWebsite.model;

public class ConcertOrganizer {
	
	private String addedConcert;
	private String name;

	public void addConcert(String concert) {
		addedConcert = concert;
		
	}
	
	public String getListedConcert() {
		return addedConcert;
	}

	public void setName(String name) {
		this.name = name;
	}

}
