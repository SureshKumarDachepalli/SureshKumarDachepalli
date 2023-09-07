package su;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshotactitimelogo {
	public static void main(String[] args) throws Throwable {
		WebDriver	driver=new ChromeDriver();
		driver.get("https://www.actitime.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		Thread.sleep(2000);
		WebElement abc=driver.findElement(By.xpath("//img[@alt='actiTIME logo']"));
	File src=abc.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\dell\\Desktop\\screenshot\\actitimelogo.png");
	Files.copy(src, dest);
	}

}
