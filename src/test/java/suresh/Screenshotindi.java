package suresh;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshotindi {

	public static void main(String[] args) throws Throwable {
		
		WebDriver	driver=new ChromeDriver();
		driver.get("https://www.google.com");

		TakesScreenshot ts=(TakesScreenshot)driver;
		 //inspect the element and store in reference variable
		  WebElement abc=driver.findElement(By.xpath("//img[@class='lnXdpd'] "));     //google page inspect
		 File src=abc.getScreenshotAs(OutputType.FILE);
		  File dest=new File("C:\\Users\\dell\\Desktop\\screenshot\\googlelogo.png"); //add googlelogo
		  Files.copy(src, dest);

	}

}
