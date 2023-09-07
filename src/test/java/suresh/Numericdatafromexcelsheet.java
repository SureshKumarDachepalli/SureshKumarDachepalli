package suresh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Numericdatafromexcelsheet {

	public static void main(String[] args) throws Throwable{ //numeric data stored in excel sheet
FileInputStream fis=new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\suresh\\src\\main\\resources\\second.xlsx");
  Workbook wb=WorkbookFactory.create(fis);
 double data=wb.getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
 System.out.println(data);

	}

}
