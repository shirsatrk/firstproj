package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.google.common.collect.Table.Cell;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Utilities {

	
	public static String excell_uname() throws BiffException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Open\\Desktop\\1234.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet sh = wb.getSheet(0);
		int row = sh.getRows();
		int col = sh.getColumns();
		for (int i = 0; i < row; i++) {
			String uname = sh.getCell(0, i).getContents();
			System.out.print(uname);
			return uname;
		}
		return null;
	}
		public static String excell_pass() throws BiffException, IOException {
			
			FileInputStream file = new FileInputStream("C:\\Users\\Open\\Desktop\\1234.xls");
			Workbook wb = Workbook.getWorkbook(file);
			Sheet sh = wb.getSheet(0);
			int row = sh.getRows();
			int col = sh.getColumns();
			for (int i = 0; i < row; i++) {
				String pass = sh.getCell(1, i).getContents();
				System.out.print(pass);
				return pass;
			}
			return null;
		
	}
	
}
