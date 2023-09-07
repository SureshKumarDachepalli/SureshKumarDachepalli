package suresh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baby {

	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();

	driver.get("https://www.google.com");
List<WebElement> dr=driver.findElements(By.xpath("//textarea[@id='APjFqb']"));
	((WebElement) dr).sendKeys("baby movie ");
	((WebElement) dr).submit();
	 ((WebElement) dr).click();
	

	}

}
