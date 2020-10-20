package concertWebsite.model;

public class Geolocation {

	private String lat, lon;

	public Geolocation(String lat, String lon) {
		super();
		this.lat = lat;
		this.lon = lon;
	}

	@Override
	public String toString() {
		return "Geolocation [lat=" + lat + ", lon=" + lon + "]";
	}

}
