package com.hefshine.basic;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(priority = 1)
	public void usernameTest() {
		System.out.println("usernameTest Execute....");
	}
	
	@Test(priority = 2)
	public void passwordTest() {
		System.out.println("passwordTest Execute....");
	}

}
