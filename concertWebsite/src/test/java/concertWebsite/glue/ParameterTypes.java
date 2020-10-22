package concertWebsite.glue;

import java.util.Map;

import concertWebsite.model.Airport;
import concertWebsite.model.Book;
import concertWebsite.model.Geolocation;
import io.cucumber.java.After;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

public class ParameterTypes {
	
	@ParameterType(value = "(.*)(?= is my favorite book)",useForSnippets = true)
	public Book book(String bookName) {
		return new Book(bookName);
	}
	

	@DataTableType
	public Airport airport(String airport) {
		return new Airport(airport);
	}
	
	@DataTableType
	public Geolocation geoLocatio(Map<String, String> geolocation) {
		return new Geolocation(geolocation.get("lat"), geolocation.get("lon"));
	}
	
	@Given("the following airports")
	public void followingAirports(Map<Airport, Geolocation> airports) {
		airports.forEach((k,v) -> System.out.println(k+" "+v));
	}
	
	
	@After
	public void afterScenario(Scenario scenario) {

	}
}
