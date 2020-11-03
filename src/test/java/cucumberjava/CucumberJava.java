package cucumberjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberJava {

	private Hooks hooks;

	public CucumberJava(Hooks hooks) {
		this.hooks = hooks;
	}

	@Given("^User opens the browser$")
	public void openBrowser() {

	}

	@When("^User is on google homepage$")
	public void goToGoogle() {
		hooks.getDriver().get("http://www.google.co.in");

	}

	@Then("^User should be able to perform search$")
	public void performSearch() {
		hooks.getDriver().findElement(By.name("q")).sendKeys("HELLO WORLD");
		assert false;
	}

}
