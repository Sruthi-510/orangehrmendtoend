package com.qa.orangeendtoend.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import com.qa.orangeendtoend.basetest.BaseTest;

public class LoginTest extends BaseTest {
	@Test
	public void doLogin() {
		lp.enterDetails( Usern,passw);
	}
	

}
