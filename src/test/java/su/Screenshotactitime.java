package su;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshotactitime {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		Thread.sleep(2000);
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\dell\\Desktop\\screenshot\\actitimepage.png");
		Files.copy(src, dest);


	}

}
