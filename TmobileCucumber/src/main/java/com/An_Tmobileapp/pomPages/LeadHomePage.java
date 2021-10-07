package com.An_Tmobileapp.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LeadHomePage { 
	
	@FindBy(xpath="//a[text()='Leads']") private WebElement LeadTab;

	public LeadHomePage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeadTab() {
		return LeadTab;
	}
	
	public void clickLeadTab() {
		LeadTab.click();
	}

}
