package com.An_Tmobileapp.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CamapaignHomePage {
	
	@FindBy(xpath="//a[text()='Campaigns']") private WebElement campaignTab;

	public CamapaignHomePage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}

	public WebElement getCampaignTab() {
		return campaignTab;
	}

	public void clickCampaignTab() {
		campaignTab.click();
	}
	
	
}
