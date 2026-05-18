package com.qa.orangeendtoendpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage extends Basepage {
	final private By untf = By.name("username");
	final private By pwdtf = By.name("password");
	final private By log_btn = By.xpath("//button[@type='submit']");
	public Loginpage(WebDriver driver) {
		super(driver);
	}
	public Dashboard enterDetails(String username,String password) {
		ea.doEnterValue(username, untf);
		ea.doEnterValue(password, pwdtf);
		ea.doClick(log_btn);
		return new Dashboard(driver);
		
	}
	
	

}
