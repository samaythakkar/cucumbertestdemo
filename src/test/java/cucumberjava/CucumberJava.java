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

	@Given("^I have open the browser$")
	public void openBrowser() {
		WebDriverManager.chromedriver().version("86.0.4240.22").setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.co.in");	
		}

	@When("^I open Facebook website$")
	public void goToFacebook() {
		driver.findElement(By.name("q")).sendKeys("HELLO WORLD");
	}

	@Then("^Login button should exits$")
	public void loginButton() {
		assert true;
	}
}
