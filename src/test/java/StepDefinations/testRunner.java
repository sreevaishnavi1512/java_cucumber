package StepDefinations;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/Features/googleSearch.feature", glue= {"StepDefinations"},
monochrome = true,
plugin = {"pretty", "json:target/jsonReports/report1.json"}
)
public class testRunner {

}
