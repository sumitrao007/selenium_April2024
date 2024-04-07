package com.testcase;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.config.Config;

public class LoginTest extends Config {
	
	@BeforeClass
	public void openBrowser() {
		browserSetting();
	}
	
	@Test(priority = 1)
	public void userNameTest() {
		System.out.println("U r in Usernae Test case ...");
		WebElement emailElement= accessById("email");
		emailElement.sendKeys("sumit@gmail.com");
	}
	
	@Test(priority = 2)
	public void passwordTest() {
		accessById("password").sendKeys("1234");
	}
	
	@Test(priority = 3)
	public void btntest() {
		accessByXpath("//button[contains(text(),'Sign In')]").click();
		
		String emailActularResult= accessById("email_error").getText();
		System.out.println(emailActularResult);
		// BRD Document 
		//String expectedData="fgsdhfbk";
		String expectedData="Please enter email as kiran@gmail.com";
		
		
		
		//Hard assert
	//	Assert.assertEquals(emailActularResult, expectedData);
		
		// Soft Assert
		
		SoftAssert softAssert=new SoftAssert();
		
		softAssert.assertEquals(emailActularResult, expectedData);
		
		String passwordActualResult= accessById("password_error").getText();
		
		// BRD 
		String pwdExpectedResult="Please enter password 123456";
		
		softAssert.assertEquals(passwordActualResult, pwdExpectedResult);
		
		softAssert.assertAll();
		
		
		
		
	//	System.out.println("========= After Assert====");
		
		
		
		
	}
	
	

}
