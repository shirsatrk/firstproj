package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.testbase.BaseClass;
	
public class ExcellReadUtility extends BaseClass{
	FileInputStream fis = null;
	Workbook wb = null;
	
	public String getCelldata(String filePath, String sheetName, Integer rownum, Integer colnum) {
	DataFormatter df = new DataFormatter();
	try {
		fis = new FileInputStream(filePath);
		wb = WorkbookFactory.create(fis);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	 catch (EncryptedDocumentException e) {
		e.printStackTrace();
	} catch (InvalidFormatException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	Sheet sh = wb.getSheet(sheetName);
	Cell c = sh.getRow(rownum).getCell(colnum);
	return df.formatCellValue(c);
	}
	
	@Test
	public void uTest() {
		String poi = System.getProperty("user.dir")+"/src/test/resources/poi.xlsx";
		String jxl = System.getProperty("user.dir")+"/src/test/resources/jxl.xls";
		
		System.out.println(getCelldata(jxl, "Sheet1", 0, 0));
		System.out.println(getCelldata(poi, "Sheet1", 0, 0));
		
		
		
	}
	
	
}