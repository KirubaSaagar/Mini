package com.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void main(String[] args) throws Throwable {
		
		File f = new File("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\Create_Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("credentials").createRow(0).createCell(0).setCellValue("username");
		
		wb.getSheet("credentials").getRow(0).createCell(1).setCellValue("MasterBruceWayne");
		
		wb.getSheet("credentials").createRow(1).createCell(0).setCellValue("password");;
		
		wb.getSheet("credentials").getRow(1).createCell(1).setCellValue("whitesr07");;
		
		wb.getSheet("credentials").createRow(2).createCell(0).setCellValue("checkindate");
		
		wb.getSheet("credentials").getRow(2).createCell(1).setCellValue("19/11/2021");
		
		wb.getSheet("credentials").createRow(3).createCell(0).setCellValue("checkoutdate");
		
		wb.getSheet("credentials").getRow(3).createCell(1).setCellValue("21/11/2021");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		
		System.out.println("Written data successfully");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
