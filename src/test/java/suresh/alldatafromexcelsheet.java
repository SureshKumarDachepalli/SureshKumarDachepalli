package suresh;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class alldatafromexcelsheet {

	public static void main(String[] args) throws Throwable{
		FileInputStream	fis=new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\suresh\\src\\test\\resources\\alldata.xlsx");
		Workbook	wb=WorkbookFactory.create(fis);
	String	data=wb.getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue(); //String data stored in excel sheet
	System.out.println(data);
	
	double	data1=wb.getSheet("Sheet2").getRow(1).getCell(0).getNumericCellValue(); //numeric data stored in excel sheet
	System.out.println(data1);
	
	boolean	data2=wb.getSheet("Sheet2").getRow(2).getCell(0).getBooleanCellValue(); //boolean data stored in excel sheet
	System.out.println(data2);
	
	String	data3=wb.getSheet("Sheet2").getRow(4).getCell(0).getStringCellValue(); //int data stored in excel sheet
	System.out.println(data3);

	}

}
