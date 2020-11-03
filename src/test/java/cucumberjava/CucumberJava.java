package cucumberjava;

import org.openqa.selenium.By;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utlities.DriverUtils;

public class CucumberJava {

	private DriverUtils driverUtils;
	
	public CucumberJava(DriverUtils driverUtils) {
		this.driverUtils = driverUtils;
	}
	String searchBox = "xpath-->//input[@name='q']";

	@Given("^User opens the browser$")
	public void openBrowser() {

	}

	@When("^User is on google homepage$")
	public void goToGoogle() {
		//hooks.getDriver().get("http://www.google.co.in");
		driverUtils.gotoUrl("https://www.google.com");
		

	}

	@Then("^User should be able to perform search$")
	public void performSearch() {
		driverUtils.sendText(searchBox, "Hello World again");
		assert true;
	}

}
