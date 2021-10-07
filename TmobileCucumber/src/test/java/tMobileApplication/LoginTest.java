//package tMobileApplication;
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
//public class LoginTest {
//	WebDriver driver;
//	
//	@Before
//	public void setup() {
//		System.out.println("I am Setup() where u open the browser");
//	}
//	@After
//	public void tearDown() {
//		
//		System.out.println("we close the browser");
//		driver.quit();
//	}
//	@Given("^user is in browser page$")
//	public void user_is_in_browser_page() {
//	    System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
//	    driver= new ChromeDriver();
//	    driver.manage().window().maximize();
//	    
//	}
//
//	@When("^user is login page$")
//	public void user_is_login_page() {
//		
//		driver.get(" http://192.168.60.128:8080/crm/HomePage.do");
//	    try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    
//	   
//	}
//	
//	@And("^user gives login (.*) and (.*)$")
//	public void user_gives_login_rashmi_dell_com_and(String un, String pwd) throws Throwable{
//		LoginTmobilePage lp= new LoginTmobilePage(driver);
//		lp.getUntb().sendKeys(un);
//		 lp.getPwtb()  .sendKeys(pwd);
//		   Thread.sleep(2000);
//	}
//
//	@And("^user click on sign in button$")
//	public void user_click_on_sign_in_button() {
//		LoginTmobilePage lp= new LoginTmobilePage(driver);
//		lp.getLoginBtn().click();
//	}
//
//	@Then("^user navigate to home page$")
//	public void user_navigate_to_home_page() {
//	   System.out.println(driver.getTitle());
//	}
//
//
//}
