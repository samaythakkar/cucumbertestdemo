package cucumberjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberJava {
	WebDriver driver = null;

	@Given("^User opens the browser$")
	public void openBrowser() {
		WebDriverManager.chromedriver().version("86.0.4240.22").setup();
		driver = new ChromeDriver();
		}

	@When("^User is on google homepage$")
	public void goToFacebook() {
		driver.get("http://www.google.co.in");	

	}

	@Then("^User should be able to perform search$")
	public void loginButton() {
		driver.findElement(By.name("q")).sendKeys("HELLO WORLD");
		assert true;
	}
}
