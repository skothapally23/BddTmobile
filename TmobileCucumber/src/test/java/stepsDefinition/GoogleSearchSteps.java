package stepsDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	public static WebDriver driver;
	
	@Given("browser is open")
	public void browser_is_open() {
	   System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
	   driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   
	}

	@And("user is on google page")
	public void user_is_on_google_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters a text in search text box")
	public void user_enters_a_text_in_search_text_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("user hits enter button")
	public void user_hits_enter_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to search results page")
	public void user_is_navigated_to_search_results_page() {
	   
		if(driver.getTitle().equals("raghavendre vinay b - Google Search")) {
			
		}
		
		
		
	}


}
