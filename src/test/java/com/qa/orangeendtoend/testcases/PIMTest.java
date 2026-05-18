package com.qa.orangeendtoend.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.orangeendtoend.basetest.BaseTest;
import com.qa.orangeendtoend.utilities.FakeData;
import com.qa.orangeendtoendpages.PIMPage;

public class PIMTest extends BaseTest {
	@BeforeMethod
	public void precondition() {
		dpg=lp.enterDetails(Usern, passw);
		pim=(PIMPage) dpg.selectModule("PIM");
		pim.clickonaddemp();
	}
	@Test
	public void ClickModuleandDetails() {
	
		
		String firstName=FakeData.getFn();
		String middleName=FakeData.getMn();
		String lastName=FakeData.getln();
		pim.createemp(firstName, middleName, lastName);
	}

}
