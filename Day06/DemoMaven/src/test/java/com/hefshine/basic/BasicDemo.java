package com.hefshine.basic;

import org.testng.annotations.Test;

public class BasicDemo {
	
	@Test(priority = 1,description = "Login Test...")
	public void ba1() {
		System.out.println("My First Test Case");
	}
	
	@Test(priority = 2)
	public void ab2() {
		System.out.println("My Second Test Case");
	}

}
