package com.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.baseclass.nov.Base_Class;

public class Read_ParticularData extends Base_Class{
	
//	public static void Particular_Data() throws IOException {
//		
//		File f = new File("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\Sample_Data.xlsx");
//
//		FileInputStream fis = new FileInputStream(f);
//		
//		Workbook wb = new XSSFWorkbook(fis);
//		
//		Sheet sheetAt = wb.getSheetAt(0);
//		
//		Row row = sheetAt.getRow(4);
//		
//		Cell cell = row.getCell(3);
//		
//		CellType cellType = cell.getCellType();
//		
//		if (cellType.equals(CellType.STRING)) {
//			
//			String stringCellValue = cell.getStringCellValue();
//			
//			System.out.println(stringCellValue);
//			
//		}
//		
//		else if (cellType.equals(CellType.NUMERIC)) {
//			
//			double numericCellValue = cell.getNumericCellValue();
//			
//			int value = (int) numericCellValue;
//			
//			System.out.println(value);
//			
//		}
//		
//}
	
public static void main(String[] args) throws IOException {
	
	System.out.println("running");

	ddfParticularData("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\Sample_Data.xlsx", 0, 1, 1);

	System.out.println(ddfParticularData("C:\\Users\\Saagar\\eclipse-workspace\\Oct_30_Mini_Project\\Excel\\Sample_Data.xlsx", 0, 1, 1));
	
	System.out.println("run successfully");
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
