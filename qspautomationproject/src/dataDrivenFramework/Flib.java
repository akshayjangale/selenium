package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	public String readExcelData (String excelpath, String sheetname, int rowcount, int cellcount) throws IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		
		return data;
		
	}
	
	public int getRowCount (String excelpath, String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		int rc = sh.getLastRowNum();
		
		return rc;
	}
	
	public void writeExcelData (String excelpath, String sheetname, int rowcount, int cellcount, String value) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		cell.setCellValue(value);
		
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
	}

}
