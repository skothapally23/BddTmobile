package com.An_Tmobileapp.pomPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Tmobile.genericLib.WebDriverCommonLib;

public class CamapignPage {
	

	@FindBy(xpath = "//input[@name='property(Campaign Name)']")
	private WebElement campaignName;
	@FindBy(xpath = "//input[@name='property(Campaign Name)']/ancestor::tr[@id='row1']/descendant::select[@class='textField']")
	private WebElement status;

	@FindBy(xpath = "//div[@class='bodyText mandatory']/following-sibling::table[2]//input[@value='Save']")
	private WebElement saveBtn;
WebDriver driver;
	public CamapignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	public WebElement getStatus() {
		return status;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getCampaignName() {
		return campaignName;
	}

	public void createCampaign(String cName) {         

		campaignName.sendKeys(cName);
		
		saveBtn.click();
	}
	public void clickStatus(String value) {
		
		Select sel= new Select(status);
		sel.selectByValue(value);
		
	}
}
