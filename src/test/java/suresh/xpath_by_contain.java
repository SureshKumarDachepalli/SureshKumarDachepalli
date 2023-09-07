package suresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_contain {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("suresh");
        driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("kumar");
       driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
