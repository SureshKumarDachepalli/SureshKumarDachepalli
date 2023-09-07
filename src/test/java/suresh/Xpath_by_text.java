package suresh;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_text {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
	
		driver.findElement(By.xpath("//input[text()='text']")).sendKeys("ganesh");
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	}

}