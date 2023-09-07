package su;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot {

	public static void main(String[] args) throws Throwable {
		WebDriver	driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		//convert the control of selenium from wd to takesscreenshot
		
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 
		 /*folder location and\\folder name\\googlepage.png*/
		 
		  File dest=new File("C:\\Users\\dell\\Desktop\\screenshot\\googlepage.png");
		  Files.copy(src, dest);

	}

}
