
package tMobileApplication;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\resources\\TMobile Feature\\LoginToTmobile.feature",glue= {"tMobileApplication"})
public class LoginTmobileTestRunner {

}
