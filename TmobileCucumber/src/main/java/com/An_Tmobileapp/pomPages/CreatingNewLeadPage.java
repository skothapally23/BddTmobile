package com.An_Tmobileapp.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewLeadPage {
	
	@FindBy(xpath="//input[@name='property(Last Name)']") private WebElement lastName;
	@FindBy(xpath="//input[@name=\"property(Company)\"]")private WebElement companyName;
	@FindBy(xpath="//input[@name='property(Phone)']")private WebElement phno;
	@FindBy(xpath="//div[text()='* Required Field(s)']/ancestor::table[1]/following-sibling::table[1]/descendant::input[@value='Save']")private WebElement saveBtn;

	public CreatingNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void creatingLeadPage(String ln, String cName) {
		lastName.sendKeys(ln);
		companyName.sendKeys(cName);
		saveBtn.click();
	}
	
}
