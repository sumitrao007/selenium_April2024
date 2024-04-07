package com.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	
	WebDriver driver;
	
	public void browserSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(url);
		
		
	}
	
	public void accessElement() {
		//Absolute Xpath 
		// driver.findElement(By.xpath("/html/body/div[2]/div[1]/nav/a[2]")).click();
		
		//relative Xpath
		driver.findElement(By.xpath("//a[@id='navbtn_exercises']")).click();
		
	}
	
	public void rediffmailAccess() {
		//driver.findElement(By.xpath("//input[@name='name7bb5b1ef']")).sendKeys("Sumit");
		
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("Sumit");
		
	//	driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("sumit@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("abc@gmail.com");
		//driver.findElement(By.xpath("(//input[contains(@name,'passwd')])[1]")).sendKeys("1234");
		
		driver.findElement(By.xpath("//input[starts-with(@name,'passwd')]")).sendKeys("1234");
		
		
	}
	
	

}
