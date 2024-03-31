package com.hefshine.config;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyConfig {	
	
	WebDriver driver;
	
	
	public void browserSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	
	public void login() {
		WebElement emailElement= driver.findElement(By.xpath("//*[@id=\"email\"]"));
		emailElement.sendKeys("kiran@gmail.com");
		
//		WebElement pwdElment= driver.findElement(By.xpath("//*[@id=\"password\"]"));
//		pwdElment.sendKeys("123");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	}
	
	
	public void showAddUser() {
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		
	}
	
	public void fillAddUserDetails() {
driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Sumit");
		
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9960556397");
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sumit@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"course\"]")).sendKeys("Selenium");
		
		driver.findElement(By.xpath("//*[@id=\"Male\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Female\"]")).click();
		
		
		WebElement selectElement= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		
		
		Select select=new Select(selectElement);
		
//		select.selectByIndex(2);
		
//		select.selectByValue("HP");
		
		select.selectByVisibleText("Punjab");
		
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345");
		
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input")).sendKeys("7972547618");
		
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		Alert alert= driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
		
	
	}

}
