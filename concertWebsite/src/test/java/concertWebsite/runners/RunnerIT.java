package concertWebsite.runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/concertWebsite/features", glue = "concertWebsite/glue", 
plugin = {
		"json:target/cucumber-report/cucumber.json" }, publish = true, tags = "@Google")
public class RunnerIT extends AbstractTestNGCucumberTests {
	

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	

}
