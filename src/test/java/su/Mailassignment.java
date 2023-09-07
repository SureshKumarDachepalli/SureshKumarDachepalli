package su;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mailassignment {

	public static void main(String[] args) {
		WebDriver dri=new ChromeDriver();
		dri.get("https://www.google.com");
	//WebElement	gmail=driver.findElement(By.xpath("(//a[@class='gb_y'])[1] "));
		WebElement	gmail=dri.findElement(By.xpath("//span[@class='gb_Ad'] "));
	Actions act=new Actions(dri);
	 act.moveToElement(gmail).perform();
	act.contextClick(gmail).perform();
	act.moveToElement(gmail).click().perform();
	dri.findElement(By.xpath("//input[@type='email'] ")).sendKeys("sureshkumar.d467@gmail.com");
	
	WebElement	next=dri.findElement(By.xpath("//span[@class='gb_Ad'] "));
	Actions act1=new Actions(dri);
	act1.moveToElement(next).perform();
	act1.contextClick(next).perform();
	act1.moveToElement(next).click().perform();	
	dri.findElement(By.xpath("//span[@jsname='V67aGc'])[2]")).click();

	}

}
