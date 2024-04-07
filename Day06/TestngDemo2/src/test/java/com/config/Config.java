package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	
	WebDriver driver;
	
	public void browserSetting() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get(null);
		
		driver.get(readPropertyFile());
	}
	
	public String readPropertyFile() {
		String url=null;
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("D:\\Selenium_Workspace\\April2024\\configData\\testconfig.properties");
			
			Properties prop=new Properties();
			prop.load(fis);
			
			 url= prop.getProperty("url");
			
			
			
		
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) {
					fis.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
		return url;
		
		
	}
	
	public WebElement accessById(String id) {
		return  (driver.findElement(By.id(id)));
	}
	
	public WebElement accessByXpath(String xpath) {
		return (driver.findElement(By.xpath(xpath)));
	}
	

}
