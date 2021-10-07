package com.An_Tmobileapp.pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Listeners;



@Listeners(com.Tmobile.genericLib.MyListeners.class)
public class EditCampaignPage {
	@FindBy(xpath="//td[@class=\"title hline\"]/ancestor::table/following-sibling::table[1]/descendant::input[@name='edit2']") private WebElement edit;
	
	//@FindBy(xpath="")
	//public void 

}
