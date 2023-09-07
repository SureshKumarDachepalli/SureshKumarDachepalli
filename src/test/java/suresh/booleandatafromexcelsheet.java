package suresh;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class booleandatafromexcelsheet {

	public static void main(String[] args) throws Throwable{  //boolean data stored in excel sheet
		FileInputStream	fis=new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\suresh\\src\\main\\resources\\third.xlsx");
	Workbook	wb=WorkbookFactory.create(fis);
boolean	data=wb.getSheet("Sheet1").getRow(1).getCell(0).getBooleanCellValue();
System.out.println(data);

	}

}
