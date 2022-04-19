package java_package1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class data {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fs = new FileInputStream("./Excel_data/Book1.xlsx");
		Workbook book = WorkbookFactory.create(fs);
		Sheet s =book.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String value = c.getStringCellValue();
		System.out.println(value);
 
		
		
	}

}
