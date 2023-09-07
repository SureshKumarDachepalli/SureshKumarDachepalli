package suresh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Fileinputstream {

	public static void main(String[] args) throws Throwable {
		/*first step create folder in desktop,second step desktop folder copy,next create folder in suresh package and copy paste is create folder.
		we will get one class ,after go to properties and copy the location.*/
 FileInputStream	fis=new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\suresh\\src\\test\\java\\suresh\\datadriven testing\\credential.properties1 "); //java.io
 Properties p=new Properties();         //java.util
 p.load(fis);
 String sts=p.getProperty("browser");
 System.out.print(sts);

	}

}
