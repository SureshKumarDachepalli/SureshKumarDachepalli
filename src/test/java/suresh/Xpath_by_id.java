package suresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_id {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("suresh");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("dachepalli");
		driver.findElement(By.xpath("//button[@id=u_0_5_+U] ")).click();
		

	}

}
