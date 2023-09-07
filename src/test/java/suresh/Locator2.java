package suresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		/*       driver.get("https://www.google.com/");
		         driver.findElement(By.linkText("Gmail")).click();     */
		
		driver.get("https://www.google.com");
		driver.findElement(By.partialLinkText("Images")).click();

	}

}
