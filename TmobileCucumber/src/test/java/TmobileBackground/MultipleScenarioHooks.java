package TmobileBackground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.An_Tmobileapp.pomPages.CamapaignHomePage;
import com.An_Tmobileapp.pomPages.CamapignPage;
import com.An_Tmobileapp.pomPages.CreatingNewLeadPage;
import com.An_Tmobileapp.pomPages.DisplayingNewCampaignPage;
import com.An_Tmobileapp.pomPages.LeadDataPage;
import com.An_Tmobileapp.pomPages.LeadHomePage;
import com.TmobileCucumber.LoginPage.LoginTmobilePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleScenarioHooks {
	WebDriver driver;
	CamapaignHomePage chp;
	LeadHomePage lhp;
	LeadDataPage createLead;
	CreatingNewLeadPage newLead;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://192.168.60.128:8080/crm/HomePage.do");
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("^I was on login page$")
	public void i_was_on_login_page() {
		System.out.println("User is on login page");
	}

	@When("^Enter valid (.*) and (.*)$")
	public void enter_valid_username_and_password(String un, String pwd) {
		LoginTmobilePage lp = new LoginTmobilePage(driver);
		lp.getUntb().sendKeys(un);
		lp.getPwtb().sendKeys(pwd);

	}

	@And("^Click on login button$")
	public void click_on_login_button() {
		LoginTmobilePage lp = new LoginTmobilePage(driver);
		lp.getLoginBtn().click();
	}

	@Then("^Home page is displaying.$")
	public void home_page_is_displaying() {
		System.out.println("User is on Home Page");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("^I click on campaign Tab$")
	public void i_click_on_campaign_tab() {
		chp = new CamapaignHomePage(driver);
		chp.clickCampaignTab();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^campaign list page is opened$")
	public void campaign_list_page_is_opened() {
		System.out.println("user is on campaign home page");
	}

	@When("^I click on newcampaign button$")
	public void i_click_on_newcampaign_button() {
		DisplayingNewCampaignPage ncp = new DisplayingNewCampaignPage(driver);
		ncp.getNewCampaignBtn();
		ncp.clicknewCampaignBtn();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^navigate to create Newcampaign page$")
	public void navigate_to_create_newcampaign_page() {
		System.out.println("user is navigated to NewCampaign page");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("^i enter valid (.*) and (.*)$")
	public void i_enter_valid_junnu_and_active(String cname, String status) {
		CamapignPage cp = new CamapignPage(driver);
		cp.getCampaignName().sendKeys(cname);

		cp.getStatus().click();

		cp.clickStatus(status);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@And("^click on savebutton$")
	public void click_on_savebutton() {
		CamapignPage cp = new CamapignPage(driver);
		cp.getSaveBtn().click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^user navigates to campaign List page$")
	public void user_navigates_to_campaign_list_page() {
		System.out.println("user navigates to campaign List page ");
	}

	@When("^I click on Lead Tab$")
	public void i_click_on_lead_tab() throws Throwable {
		lhp = new LeadHomePage(driver);
		lhp.clickLeadTab();
		Thread.sleep(2000);
	}

	@Then("^Lead list page is opened$")
	public void lead_list_page_is_opened() {
		System.out.println("Lead list page is opened");
	}

	@When("^I click on newLead button$")
	public void i_click_on_new_lead_button() {
		createLead = new LeadDataPage(driver);
		createLead.clickNewLeadTab();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("^navigate to create NewLead Page$")
	public void navigate_to_create_new_lead_page() {
		System.out.println("user is navigated to create NewLead Page");
	}

	@When("^user enters valid (.*) and (.*)$")
	public void user_enters_valid_nadendla_and_tcs(String name, String cmname) {
		newLead = new CreatingNewLeadPage(driver);
		newLead.creatingLeadPage(name, cmname);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("^user navigate to lead list page.$")
	public void user_navigate_to_lead_list_page() {
	
		if(driver.getTitle().equals("Zoho CRM - Create Lead")) {
			
			System.out.println("user navigate to lead list page");
		}
		else {
			System.out.println("user not  navigate to lead list page");
			
			
		}
		
	}

}
