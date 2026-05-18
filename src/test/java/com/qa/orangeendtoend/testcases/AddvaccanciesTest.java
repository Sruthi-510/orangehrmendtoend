package com.qa.orangeendtoend.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.orangeendtoend.basetest.BaseTest;
import com.qa.orangeendtoend.utilities.FakeData;
import com.qa.orangeendtoendpages.RecruitmentPage;

public class AddvaccanciesTest extends BaseTest {
	@BeforeMethod
	public void precondition() {
		dpg=lp.enterDetails(Usern, passw);
		rp=(RecruitmentPage) dpg.selectModule("Recruitment");
		rp.clickonvaccancies();
		rp.clickonAddButtons();
	}
	@Test
	public void ClickModuleandDetails() {
		
		
		String vaccancies=FakeData.vaccancyName();
		String Hiring = FakeData.HiringManager();
	
		
		rp.addVaccancies(vaccancies,Hiring);
	}
	

}
