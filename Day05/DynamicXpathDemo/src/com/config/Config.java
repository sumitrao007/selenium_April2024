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
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/nav/a[2]")).click();
		
	}

}
