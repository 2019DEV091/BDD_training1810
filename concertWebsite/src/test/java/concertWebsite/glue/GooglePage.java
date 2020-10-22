package concertWebsite.glue;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends BasePage{

	@FindBy(id="lst-ib")
	private WebElement inputField;
	
	@FindBy(css = "div.rc cite")
	private List<WebElement> results;
	
	@FindBy(id="introAgreeButton")
	private WebElement agreeBtn;
	
	public GooglePage(DriverManager driverManager) {
		super(driverManager);
		
	}
	
	public GooglePage clickAndEnterSomething(String something) {
		inputField.click();
		inputField.sendKeys(something);
		return this;
	}
	
	public GooglePage goToGooglePage() {
		driverManager.getDriver().get("https://www.google.com");
		agreeBtn.click();
		return this;
	}
	
	public String getUrlOfResult(int resultNumber) {
		return results.get(resultNumber).getText();
	}
	
	

}
