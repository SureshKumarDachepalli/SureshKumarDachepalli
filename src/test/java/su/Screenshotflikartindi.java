package su;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshotflikartindi {
	public static void main(String[] args) throws Throwable {
		WebDriver	driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		WebElement abc=driver.findElement(By.xpath("//img[@title='Flipkart']"));
	File src=abc.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\dell\\Desktop\\screenshot\\flipkartlogo.png");
	Files.copy(src, dest);

}
}
