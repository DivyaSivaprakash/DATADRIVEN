package com.Data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Excel {

	public static void particular_Data() throws IOException {
		File f = new File("C:\\Users\\SIVAPRAKASH\\eclipse-workspace\\Data_driven\\datadriven.xlsx");

		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(3);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {

			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);

		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int value = (int) numericCellValue;

			System.out.println(value);
		}
	}

	public static void all_Cellvalue() throws IOException {
		File f = new File("C:\\Users\\SIVAPRAKASH\\eclipse-workspace\\Data_driven\\datadriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < physicalNumberOfRows; i++) {

			Row row = sheetAt.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();

			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				} else if (cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int value = (int) numericCellValue;
					System.out.println(value);

				}

			}

		}

	}
	public static void particularrow() throws Throwable {
		File f=new File("C:\\Users\\SIVAPRAKASH\\eclipse-workspace\\Data_driven\\datadriven.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < physicalNumberOfCells; i++) {
			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
							System.out.println(stringCellValue);
			}else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value=(int) numericCellValue;
				System.out.println(value);
				
			}
			
		}
		

	}
	public static void particularcolumndata() throws Throwable {
		File f=new File("C:\\Users\\SIVAPRAKASH\\eclipse-workspace\\Data_driven\\datadriven.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(1);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
							System.out.println(stringCellValue);
			}else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value=(int) numericCellValue;
				System.out.println(value);
				
			}
		}
		
		
		

	}
	
	public static void main(String[] args) throws Throwable {
		System.out.println("***********particular data*********");
		particular_Data();
		System.out.println("***********all data***********");
		all_Cellvalue();
		System.out.println("*********particular row data************");
		particularrow();
		System.out.println("***********particular column data************");
		particularcolumndata();

	}
}
