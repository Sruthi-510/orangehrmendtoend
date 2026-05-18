package com.qa.orangeendtoendpages;

import org.openqa.selenium.WebDriver;

import com.qa.orangeendtoend.utilities.ElementActions;
import com.qa.orangeendtoend.utilities.WebDriverActions;

public class Basepage {
	protected WebDriver driver;
	protected ElementActions ea;
	protected WebDriverActions act;
	public Basepage(WebDriver driver) {
	
		this.driver=driver;
		ea = new ElementActions(driver);
		act=new WebDriverActions(driver);
	}

}
