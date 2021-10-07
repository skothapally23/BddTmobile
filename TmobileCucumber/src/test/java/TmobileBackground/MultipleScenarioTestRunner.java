package TmobileBackground;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "E:\\GCSE3\\TmobileCucumber\\src\\test\\resources\\BackgroundFeature\\MultiScenarios.feature",
glue= {"TmobileBackground"})

public class MultipleScenarioTestRunner {
	

}
