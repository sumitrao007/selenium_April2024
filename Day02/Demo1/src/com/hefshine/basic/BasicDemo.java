package com.hefshine.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		
		driver.get("file:///D:/SeleniumSoftware/Offline%20Website/index.html");
		
		
//		String strUrl= driver.getCurrentUrl();
//		System.out.println(strUrl);
//		
//		String strPageSource= driver.getPageSource();
//		System.out.println(strPageSource);
//		
//		String strTitle= driver.getTitle();
//		System.out.println(strTitle);
		
		
		
		WebElement element= driver.findElement(By.xpath("/html/body/div/div[1]/a/b"));
		
		String strdata= element.getText();
		System.out.println(strdata);
		
		
		

	}

}
