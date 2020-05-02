package com.project.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static String ReadExcel() throws IOException
	{
		
		// read the data from excel
		String data;
		String Path = System.getProperty("user.dir") + "/TestData/Mobile.xlsx";
		FileInputStream readfile=new FileInputStream(Path);
	    XSSFWorkbook workbook=new XSSFWorkbook(readfile);
	    XSSFSheet sheet =workbook.getSheetAt(0);
	    data=String.valueOf(sheet.getRow(0).getCell(0));
	    workbook.close();
		return data;
	}	
}
