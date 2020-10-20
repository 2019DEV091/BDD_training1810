package concertWebsite.glue;

import io.cucumber.java.en.Given;

public class CucumberExerciseSteps {
	
	@Given("A {word} eats {int} ")
	public void someOneEats(String type, int amount) {
		System.out.println("ok");
	}

}
