package cucumberjava;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.picocontainer.MutablePicoContainer;
import org.picocontainer.PicoContainer;
import org.openqa.selenium.TakesScreenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	private WebDriver driver;
	private static boolean initialized = false;

	@Before
	public void beforeScenario() {
		System.out.println("This will run before the Scenario");
		WebDriverManager.chromedriver().version("86.0.4240.22").setup();
		driver = new ChromeDriver();
		initialized = true;

	}

	public WebDriver getDriver() {
		return driver;
	}
	

	@After
	public void afterScenario(Scenario scenario) {
		System.out.println("This will run after the Scenario");
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot)this.getDriver() ).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
          }
	}
}
