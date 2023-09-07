package suresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
	    //enter username
	    driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
	    driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
	    driver.findElement(By.id("loginButton")).click();
	    

	}

}
