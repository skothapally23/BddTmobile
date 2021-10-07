package com.An_Tmobileapp.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class DisplayingNewCampaignPage {

	@FindBy(xpath="//input[@value='New Campaign']") private WebElement newCampaignBtn;

	

	public DisplayingNewCampaignPage(	WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getNewCampaignBtn() {
		return newCampaignBtn;
	}
	public void clicknewCampaignBtn() {
		newCampaignBtn.click();
	}
	
}
