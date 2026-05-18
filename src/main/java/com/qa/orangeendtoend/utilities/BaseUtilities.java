package com.qa.orangeendtoend.utilities;

import org.openqa.selenium.WebDriver;

public class BaseUtilities {
	protected WebDriver driver;
	protected WaitStrategy ws;
	public BaseUtilities(WebDriver driver) {
		this.driver=driver;
		ws = new WaitStrategy(driver);
	}

}
