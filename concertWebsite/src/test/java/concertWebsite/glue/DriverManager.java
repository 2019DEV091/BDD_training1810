package concertWebsite.glue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	private WebDriver driver;

	public DriverManager() {
		
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getDriver() {
		if (driver == null) {
			driver = new ChromeDriver();
		}

		return driver;
	}

	public void quitDriver() {
		if (driver != null) {
			driver.quit();
		}
	}

}
