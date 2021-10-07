package com.An_Tmobileapp.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//@Listeners(com.Tmobile.genericLib.MyListeners.class)
public class SearchTab {
	WebDriver driver;
	@FindBy(xpath="//input[@id='searchword']") private WebElement searchbox;
	@FindBy(xpath="//input[@type='submit']") private WebElement go;

	public void searchBar(String searchFor) {
		searchbox.sendKeys(searchFor);
		go.click();
		
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getGo() {
		return go;
	}
	
	public SearchTab() {
		PageFactory.initElements(driver, this);
	}

	
	

}
