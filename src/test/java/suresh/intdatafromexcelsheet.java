package suresh;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class intdatafromexcelsheet {//int data stored in excel sheet

	public static void main(String[] args) throws Throwable{
		FileInputStream	obj=new FileInputStream(" C:\\Users\\dell\\eclipse-workspace\\suresh\\src\\test\\resources\\firth.xlsx");
	Workbook	wb=WorkbookFactory.create(obj);
String	data=wb.getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
System.out.println(data);


	}

}
