package com.qa.orangeendtoendpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentPage extends Basepage {
	final private By Candidtab=By.xpath("//a[.=\'Candidates']");
	final private By vaccanciestab=By.xpath("//a[.='Vacancies']");
	final private By Add_button=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	final private By fntf=By.name("firstName");
	final private  By mntf=By.name("middleName");
	final private By lntf=By.name("lastName");
	final private By emailtf=By.xpath("(//input[@placeholder='Type here'])[1]");
	final private By save_btn=By.xpath("//button[@type='submit']");
	final private By vaccancies = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	final private By job = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div[2]/div/div/div[1]");
	
	final private By Hiring = By.xpath("//input[@placeholder='Type for hints...']");
	final private By savebutton= By.xpath("//button[@type='submit']");
	
	
	public RecruitmentPage(WebDriver driver) {
		super(driver);
	}
		public void clickOnCandidtab() {
			ea.doClick(Candidtab);
		}
		public void clickonvaccancies() {
			ea.doClick(vaccanciestab);
		}
		public void clickonAddButton() {
			ea.doClick(Add_button);
		}
		public void addDetails(String fn,String ln,String mn,String email) {
			ea.doEnterValue(fn, fntf);
			ea.doEnterValue(mn, mntf);
			ea.doEnterValue(ln, lntf);
			ea.doEnterValue(email, emailtf);
			ea.doClick(save_btn);
		
	}
	public void clickonAddButtons() {
		ea.doClick(Add_button);
	}
	public void addVaccancies(String VN,String hm) {
		ea.doEnterValue(VN, vaccancies);
		ea.doClick(job);
		ea.doEnterValue(hm, Hiring);
		ea.doClick(savebutton);
	}
}



