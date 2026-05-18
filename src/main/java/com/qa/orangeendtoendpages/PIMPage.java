package com.qa.orangeendtoendpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMPage  extends Basepage{
	
	final private By addemp = By.linkText("Add Employee");
	final private By fntf  = By.name("firstName");
	final private By mntf = By.name("middleName");
	final private By lntf = By.name("lastName");
	final private By save_btn=By.xpath("//button[@type='submit']");
	public PIMPage(WebDriver driver) {
		super(driver);
	}
	public void clickonaddemp() {
		ea.doClick(addemp);
	}
	public void createemp(String fn,String mn,String ln) {
		ea.doEnterValue(fn, fntf);
		ea.doEnterValue(mn, mntf);
		ea.doEnterValue(ln, lntf);
		ea.doClick(save_btn);
	}
	

}
