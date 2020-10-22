package concertWebsite.glue;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SeleniumHooks {
	private DriverManager driverManager;
	
	public SeleniumHooks(DriverManager driverManager) {
		super();
		this.driverManager = driverManager;
	}

	@Before
	public void before() {
		driverManager.getDriver();
	}
	
	@After
	public void after() {
		driverManager.quitDriver();
	}

}
