package com.hefshine.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class config {
	
	WebDriver driver;
	
	public void browserSetting() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver=new ChromeDriver();
		
		// driver.get();
		
		
		driver.get(this.readPropertyFile());
		
	}
	
	public String readPropertyFile() {
		String url=null;
		
		try {
			FileInputStream fis=new FileInputStream("D:\\Selenium_Workspace\\April2024\\configData\\myfile.properties");
			
			Properties prop=new Properties();
			prop.load(fis);
			
			url=prop.getProperty("url");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return url;
		
		
	}
	

}
