package com.An_Tmobileapp.pomPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class LeadDataPage {
	
	@FindBy(xpath="//table[@class=\"secContent\"]//tr[*]//td[3]") private List<WebElement> leadsInfo;
	@FindBy(xpath="//input[@value='New Lead']") private WebElement newLeadTab;
	
	
	public List<WebElement> getLeadsInfo() {
		
		//Reporter.log(leadsInfo, true);
		System.out.println(leadsInfo);
		return leadsInfo;
		
	}

	

	public WebElement getNewLeadTab() {
		return newLeadTab;
	}

	public LeadDataPage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}

	public void clickNewLeadTab() {
		newLeadTab.click();
	}
	

}
