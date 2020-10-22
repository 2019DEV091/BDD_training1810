package concertWebsite.glue;

import org.openqa.selenium.support.PageFactory;

public class BasePage {
	protected DriverManager driverManager;

	public BasePage(DriverManager driverManager) {
		super();
		this.driverManager = driverManager;
		PageFactory.initElements(driverManager.getDriver(), this);
	}

	
}
