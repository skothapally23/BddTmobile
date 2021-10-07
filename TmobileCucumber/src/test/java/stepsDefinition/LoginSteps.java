package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	

@Given("user is on login page")
public void user_is_on_login_page() {
    System.out.println("user is on login page");
}

@When("user enters username and password")
public void user_enters_username_and_password() {
   
   System.out.println("user enters username and password");
}

@And("user clicks on login button")
public void user_clicks_on_login_button() {
    System.out.println("user clicks on login button");
}

@Then("user is on home page")
public void user_is_on_home_page() {
    System.out.println("user is on home page");
}


}
