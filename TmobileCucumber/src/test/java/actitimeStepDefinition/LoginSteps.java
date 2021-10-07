//package actitimeStepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.TmobileCucumber.LoginPage.LoginTmobilePage;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginSteps {
//
//	WebDriver driver;
//
////	@Before
////	public void setUp() {
////		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Drivers\\chromedriver.exe");
////		driver = new ChromeDriver();
////		driver.get("https://demo.actitime.com/login.do");
////	}
//
//	@After
//	public void tearDown() {
//		driver.quit();
//	}
//
//	@Given("^user is on actitime login page$")
//	public void user_is_on_actitime_login_page() {
//		System.out.println("User is on login page");
//	}
//
//	@When("^user enter valid (.*) n (.*)$")
//	public void user_enter_valid_username_n_password(String un,String pwd) {
//		LoginTmobilePage lp= new LoginTmobilePage(driver);
//		lp.getUntb().sendKeys(un);
//	    lp.getPwtb().sendKeys(pwd);
//	}
//
//	@And("^user click on login button$")
//	public void user_click_on_login_button() {
//		LoginTmobilePage lp= new LoginTmobilePage(driver);
//			lp.getLoginBtn().click();
//	}
//
//	@Then("^user should navigate to enter time-track page$")
//	public void user_should_navigate_to_enter_time_track_page() {
//		if(driver.getTitle().equals("actiTIME - Enter Time-Track")) {
//	    	System.out.println("User is navigated to enter time-track page");
//	    }
//	    else {
//	    	System.out.println("User is not navigated to enter time-track page");
//	    }
//	}
//
//}
