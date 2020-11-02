package cucumberjava;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","json:./results/cucumber.json"})
public class RunTest{
}
