package tMobileApplication;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.TmobileCucumber.LoginPage.LoginTmobilePage;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class InvalidLoginTest {
	WebDriver driver;
	
	@After
	public void tearDown() {
		driver.quit();
	}


	@Given("^i was on browser$")
	public void i_was_on_browser() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("^enter the url$")
	public void enter_the_url() {
		driver.get("http://192.168.60.128:8080/crm/HomePage.do");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Given("^In login page$")
	public void in_login_page() {
		System.out.println("user is in login page");
	}

	@When("^i need to enter invalid (.*) and (.*)$")
	public void i_need_to_enter_invalid_rashmi_and(String un, String pwd) {
		LoginTmobilePage lp = new LoginTmobilePage(driver);
		lp.getUntb().sendKeys(un);
		lp.getPwtb().sendKeys(pwd);

	}

	@When("^i need to click on sign in button.$")
	public void i_need_to_click_on_sign_in_button() {
		LoginTmobilePage lp = new LoginTmobilePage(driver);
		lp.getLoginBtn().click();
	}

	@Then("^i should not enter into the application.$")
	public void i_should_not_enter_into_the_application() {
		System.out.println("user is on signin page");
	}
}
		
		
		