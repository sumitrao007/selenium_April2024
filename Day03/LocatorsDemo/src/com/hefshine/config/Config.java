package com.hefshine.config;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	WebDriver driver;
	
	public void browserSetting(String url) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(url);
		
	}	
	
	public void locatorsDemo() {
		
		//driver.findElement(By.linkText("Register a new membership")).click();
		driver.findElement(By.partialLinkText("Register ")).click();
		
	//	driver.findElement(By.id("name")).sendKeys("Sumit");
		
		//CSS Selector
		
		driver.findElement(By.cssSelector("#name")).sendKeys("Spruha");
		
		driver.findElement(By.name("mobile")).sendKeys("9960556397");
		
		//driver.findElement(By.tagName("input")).sendKeys("sumit@gmail.com");
		
		List<WebElement> list= driver.findElements(By.tagName("input"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			
			String str=list.get(i).getAttribute("placeholder");
			//System.out.println(str);
			
			if(str.equalsIgnoreCase("email")) {
				System.out.println("========");
				list.get(i).sendKeys("sumit@gmail.com");
			}
			
			if(str.equalsIgnoreCase("password")) {
				list.get(i).sendKeys("123");
			}
			
		}
		
		driver.findElement(By.className("btn")).click();
		Alert alert= driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		
	}
	
	

}
