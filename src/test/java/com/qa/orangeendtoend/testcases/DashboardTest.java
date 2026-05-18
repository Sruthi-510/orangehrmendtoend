package com.qa.orangeendtoend.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.orangeendtoend.basetest.BaseTest;
import com.qa.orangeendtoendpages.RecruitmentPage;

public class DashboardTest extends BaseTest{
	@BeforeMethod
	public void precondition() {
	dpg=lp.enterDetails(Usern, passw);
	}
	@Test
	public void ClickModule() {
		rp=(RecruitmentPage) dpg.selectModule("Recruitment");
		
		
		
	}
	

}
