package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
	
	
	public Object[][] readExcelFile() {
		FileInputStream fis=null;
		XSSFWorkbook workbook=null;
		String[][] tabArray=null;
		int ci,cj;
		
		try {
		fis=new FileInputStream("D:\\Selenium_Workspace\\April2024\\Testdata\\testdata.xlsx");
		
		workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rowcount=sheet.getLastRowNum();
		
		tabArray=new String[rowcount+1][2];
		ci=0;
		for(int i=0;i<=rowcount;i++,ci++) {
			XSSFRow row= sheet.getRow(i);
			
			int collCount= row.getLastCellNum();
			cj=0;
			for(int j=0;j<collCount;j++,cj++) {
				XSSFCell cell= row.getCell(j);
				
//				System.out.println("Cell data "+cell.getStringCellValue());
				
				tabArray[ci][cj]=cell.getStringCellValue();
				
				
			}
			
			
			
		}
		
		
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(workbook!=null) {
					workbook.close();
					workbook=null;
				}
				
				if(fis!=null) {
					fis.close();
					fis=null;
				}
				
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
		return tabArray;
		
		
	}
	

}
