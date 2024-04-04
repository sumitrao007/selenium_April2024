package com.hefshine.config;

import java.util.Iterator;
import java.util.List;

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
	
	public void webtableAutomate() {
		
		List<WebElement> rowList= driver.findElements(By.tagName("tr"));
		System.out.println(rowList.size());
		
		for(int i=1;i<rowList.size();i++) {
			
			WebElement row= rowList.get(i);
			List<WebElement> colList= row.findElements(By.tagName("td"));
			System.out.println(colList.size());
			
			for(int j=0;j<8;j++) {
				WebElement col= colList.get(j);
				
				System.out.print("\t"+col.getText());
				
			}
			System.out.println("\n------------------------");
			
			
		}
		
		
	}

}
