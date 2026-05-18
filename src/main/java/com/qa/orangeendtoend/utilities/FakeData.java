package com.qa.orangeendtoend.utilities;

import com.github.javafaker.Faker;

public class FakeData {
	static Faker fake = new Faker();
	public static String vaccancyName() {
		return fake.job().position();
		
	}
	public static String HiringManager() {
		return fake.name().fullName();
	}
	public static String getFn() {
		return fake.name().firstName();
	}
	public static String getMn() {
		return fake.name().nameWithMiddle();
	}
	public static String getln() {
		return fake.name().lastName();
	}
	public static String getEmail() {
		return fake.internet().emailAddress();
	}
	public static String getPass() {
		return fake.internet().password();
	}
	public static String confpass(String password) {
		return password;
	
	}

}
