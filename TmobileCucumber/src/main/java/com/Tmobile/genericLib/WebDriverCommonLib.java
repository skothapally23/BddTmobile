package com.Tmobile.genericLib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.google.common.io.Files;

public class WebDriverCommonLib  {
       WebDriver driver;
	public void verify(String actual, String expected, String page) {
		Assert.assertEquals(actual, expected);
		//MyListeners.test.pass(page+" is displayed");
		Reporter.log(page + " is Displayed,PASSED", true);
	}

	public String getPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

	public void mouseHover(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}

	public void selectOption(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public void selectOption(String value, WebElement element) {
		Select sel = new Select(element);
		sel.selectByValue(value);

	}

	public void selectOption(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrame(String value) {
		driver.switchTo().frame(value);
	}

	public void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	public void getFullScreenshot(String path) {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void getElementScreenshot(WebElement element, String path) {
		File src = element.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void waitForTitle(String title) {
		// TODO Auto-generated method stub

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains(title));
	}

	public  void elementStatus(String checkType, WebElement element, String elementName) {
		switch (checkType) {
		case "displayed":
			try {
				element.isDisplayed();
				MyListeners.test.info(MarkupHelper.createLabel(elementName + "is Displayed", ExtentColor.PINK));
			} catch (Exception e) {
				MyListeners.test.info(MarkupHelper.createLabel(elementName + " is not Displayed", ExtentColor.ORANGE));
			}
			break;

		case "enabled":
			try {
				element.isEnabled();
				MyListeners.test.info(MarkupHelper.createLabel(elementName + "is Enabled", ExtentColor.PINK));
			} catch (Exception e) {
				MyListeners.test.info(MarkupHelper.createLabel(elementName + " is not Enabled", ExtentColor.ORANGE));
			}
			break;

		case "selected":
			try {
				element.isSelected();
				MyListeners.test.info(MarkupHelper.createLabel(elementName + "is Selected", ExtentColor.PINK));
			} catch (Exception e) {
				MyListeners.test.info(MarkupHelper.createLabel(elementName + " is not Selected", ExtentColor.ORANGE));
			}
			break;
		}
	}
}
