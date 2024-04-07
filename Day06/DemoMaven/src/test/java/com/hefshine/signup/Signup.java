package com.hefshine.signup;

import org.testng.annotations.Test;

public class Signup {
	
	@Test(priority = 1)
	public void signupTest1() {
		System.out.println("U r in Signup class execute signupTest1===== ");
	}
	
	@Test(priority = 2,enabled = false)
	public void signupTest2() {
		System.out.println("=======U r in Signup class execute signupTest2===== ");
	}

}
