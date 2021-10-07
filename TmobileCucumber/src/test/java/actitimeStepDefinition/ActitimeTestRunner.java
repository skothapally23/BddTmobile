package actitimeStepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src\\test\\resources\\Actitime Feature\\ActiTimeLogin.feature",
	glue= {"actitimeStepDefinition"},
	
	monochrome=true,
	plugin= {"pretty","junit:target/junitcucumber.xml",
			"pretty", "json:target/jsoncucumber.json",
			"pretty", "html.target/htmlcucumber.html"}
	
	)

public class ActitimeTestRunner {

}
