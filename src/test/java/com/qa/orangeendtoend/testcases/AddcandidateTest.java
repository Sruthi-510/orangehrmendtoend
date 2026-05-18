package com.qa.orangeendtoend.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.FakeTimeLimiter;
import com.qa.orangeendtoend.basetest.BaseTest;
import com.qa.orangeendtoend.utilities.FakeData;
import com.qa.orangeendtoendpages.RecruitmentPage;

public class AddcandidateTest extends BaseTest {
	@BeforeMethod
	public void precondition() {
		dpg=lp.enterDetails(Usern, passw);
	}
	@Test
	public void ClickModuleandDetails() {
		rp=(RecruitmentPage) dpg.selectModule("Recruitment");
		rp.clickOnCandidtab();
		rp.clickonAddButton();
		
		String firstname=FakeData.getFn();
		String middleName=FakeData.getMn();
		String lastName=FakeData.getln();
		String email=FakeData.getEmail();
		rp.addDetails(firstname, middleName, lastName, email);
	}

}
