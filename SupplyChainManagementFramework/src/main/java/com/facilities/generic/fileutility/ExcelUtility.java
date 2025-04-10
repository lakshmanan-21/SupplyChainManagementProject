package com.facilities.generic.fileutility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtility 
{	
	public String getDataFromExcel(String sheetname,int rownum,int cellnum) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./testdata/ExcelFramework.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
		
	}
	
}
