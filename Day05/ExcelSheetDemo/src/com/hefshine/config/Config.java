package com.hefshine.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Config {
	
	
	public void readExcelSheet() {
		
		try {
			FileInputStream fis=new FileInputStream("D:\\Selenium_Workspace\\April2024\\Testdata\\testdata.xlsx");
		
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet= workbook.getSheet("Sheet1");
			XSSFRow row= sheet.getRow(1);
			XSSFCell cell= row.getCell(1);
			
			String str1= cell.getStringCellValue();
			System.out.println(str1);
			
			XSSFRow row0= sheet.getRow(0);
			XSSFCell cell0= row0.getCell(0);
			
			String str2= cell0.getStringCellValue();
			System.out.println(str2);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public void accessDynamicWay() {
		
		try {
			FileInputStream fis=new FileInputStream("D:\\Selenium_Workspace\\April2024\\Testdata\\testdata.xlsx");
		
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet= workbook.getSheet("Sheet1");
			
			int rowcount= sheet.getLastRowNum();
			
			for(int i=0;i<=rowcount;i++) {
				//System.out.println(i);
				
				XSSFRow row= sheet.getRow(i);
				
				int colcount= row.getLastCellNum();
				System.out.println(colcount);
				
				for(int j=0;j<colcount;j++) {
					XSSFCell cell= row.getCell(j);
					String str= cell.getStringCellValue();
					System.out.print(str+"\t");
				}
				
				System.out.println("");
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			
			e.getStackTrace();
		}
		
		
		
	}

}
