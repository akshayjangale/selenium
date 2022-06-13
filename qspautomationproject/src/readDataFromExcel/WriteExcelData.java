package readDataFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("validcreds");
		Row row = sh.getRow(0);
		
		//select the cell value to write data
		Cell cell = row.createCell(2);
		
		//set the data value to write
		cell.setCellValue("Status");
		
		//get the path of the file to write
		FileOutputStream fos = new FileOutputStream("./data/ActiTimeTestData.xlsx");
		wb.write(fos);
		
		
	}

}
