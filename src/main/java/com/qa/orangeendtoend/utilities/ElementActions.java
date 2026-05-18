package com.qa.orangeendtoend.utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.orangeendtoend.FrameWorkExceptions.ElementException;
import com.qa.orangeendtoend.Validationhelper.Validation;

public class ElementActions extends BaseUtilities {
	public ElementActions(WebDriver driver) {
		super(driver);
	}
	public WebElement getElement(By locator) {
	return ws.waitforVisibility(locator);
	}
	public void doClick(By locator) {
		Validation.validateLocator(locator,"doClick");
		try {
			ws.waitForClickable(locator).click();
		}catch (Exception e) {
			throw new ElementException("[doClick] the specifies locator"+locator+"is not matching to any locator");
		}
	}
	public void doClear(By locator) {
		Validation.validateLocator(locator, "doClear");
		try {
		getElement(locator).clear();
		}catch (Exception e) {
			throw new ElementException("[doClear] the specified locator"+locator+"is not matching to any locator");
		}
	}
	public void doEnterValue(String value,By locator) {
		Validation.validateLocator(locator, "doEnterValue");
		Validation.validateString(value, "doEnterValue");
		try {
			 getElement(locator).sendKeys(value);
		}catch (Exception e) {
			throw new ElementException("[doEnterValue] the specified locator"+locator+"is not matching to any locator");
		}
	}
	public Boolean checkEleDisplay(By locator) {
		Validation.validateLocator(locator, "checkEleDisplay");
		try {
		return getElement(locator).isDisplayed();
	}catch (Exception e) {
		throw new ElementException("[checkEleDisplay] the specified locator"+locator+"is not matching to any locator");
	}
	}
	public Boolean checkEleenabled(By locator) {
		Validation.validateLocator(locator, "checkEleenabled");
		try {
			return getElement(locator).isEnabled();
		}catch (Exception e) {
			throw new ElementException("[checkEleenbled] the specified locator"+locator+"is not matching to any locator");
		}
	}
	
	
	public Boolean checkEleSelected(By locator) {
		Validation.validateLocator(locator, "checkEleSelected");
		try {
	
		return getElement(locator).isSelected();
		
	}catch (Exception e) {
		throw new ElementException("[checkEleSelected] the specified locator"+locator+"is not matching to any locator");
	}
	
	}
	public String getEleText(By locator) {
		Validation.validateLocator(locator, "getEleText");
		try {
	
		return getElement(locator).getText();
	}catch (Exception e) {
		throw new ElementException("[checkEleSelected] the specified locator"+locator+"is not matching to any locator");
	}
	}
	public String getEleAttribute(By locator,String value) {
		Validation.validateLocator(locator, "getEleAttribute");
		Validation.validateString(value," getEleAttribute");
		try {
	
		return getElement(locator).getAttribute(value);
	}
		catch (Exception e) {
			throw new ElementException("[getEleAttribute] the specified locator"+locator+"is not matching to any locator");
		}

	}
}

