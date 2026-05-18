package com.qa.orangeendtoendpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.orangeendtoend.Error.FrameWorkError;
import com.qa.orangeendtoend.FrameWorkExceptions.FrameWorkExceptions;

public class Dashboard  extends Basepage{
	final private By profilemenu = By.xpath("//img[@alt='profile picture']");
	final private By logoutbtn = By.xpath("//a[.='Logout']");
	public By moduleLocator(String moduleName) {
		return By.xpath("//span[normalize-space()='"+ moduleName +"']");
	}
	public Dashboard(WebDriver driver) {
		super(driver);
	}
	public String validateDashBoardUrl() {
		return act.printurl();
	}
	public Basepage selectModule(String moduleName) {
		ea.doClick(moduleLocator(moduleName));
		switch(moduleName) {
		case "Recruitment":
			return   new RecruitmentPage(driver);
		case "PIM":
			return new PIMPage(driver);
		case "Leave":
			return new LeavePage(driver);
		
			default:
				throw new FrameWorkExceptions(FrameWorkError.moduleinvalidmsg);
		}
	}
	
	
	

}
