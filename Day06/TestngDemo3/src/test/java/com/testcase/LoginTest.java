package com.testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.config.Config;

public class LoginTest extends Config {
	
	@BeforeClass
	public void openBrowser() {
		browserSetting();
	}
	
	@Test(priority = 1,dataProvider = "logindata")
	public void login(String username,String pwd) {
		//System.out.println("U r in Login Test ...");
//		System.out.println("Username=> "+username);
//		System.out.println("Password=> "+pwd);
		
		WebElement emailElement= accessById("email");
		emailElement.sendKeys(username);
		
		WebElement pwdElement= accessById("password");
		pwdElement.sendKeys(pwd);
		
		accessByXpath("//button[contains(text(),'Sign In')]").click();
		
		
		SoftAssert softAssert=new SoftAssert();
		
		String emailActularResult= accessById("email_error").getText();
		String passwordActualResult= accessById("password_error").getText();
		String expectedData="Please enter email as kiran@gmail.com";
		// BRD 
		String pwdExpectedResult="Please enter password 123456";
		
		softAssert.assertEquals(emailActularResult, expectedData);
		
		softAssert.assertEquals(passwordActualResult, pwdExpectedResult);
		
		softAssert.assertAll();
		emailElement.clear();
		pwdElement.clear();
		
	}
	
	
	@DataProvider(name = "logindata")
	public Object[][] loginTestData(){
		Object[][] obj=readExcelFile();
		return obj;
	}

}
