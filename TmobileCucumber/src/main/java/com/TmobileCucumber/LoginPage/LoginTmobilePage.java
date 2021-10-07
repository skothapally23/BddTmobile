package com.TmobileCucumber.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTmobilePage {
	@FindBy(id="userName")private WebElement untb;
	@FindBy(id="passWord")private WebElement pwtb;
	@FindBy(xpath="//input[@title='Sign In']")private WebElement loginBtn;
	
	public void loginDetails(String un, String pwd) {
		untb.sendKeys(un);
		pwtb.sendKeys(pwd);
		loginBtn.click();
		
	}
	
	public LoginTmobilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUntb() {
		return untb;
	}
	public WebElement getPwtb() {
		return pwtb;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void fill_Details() {
		
	}
}
