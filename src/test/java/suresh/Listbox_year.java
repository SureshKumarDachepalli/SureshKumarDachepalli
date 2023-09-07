package suresh;

import java.lang.module.FindException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_year {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		//click on create new account button
		d.findElement(By.xpath("(//a[@role='button'])[2]")).click(); 
		Thread.sleep(2000);
		
	/*	//select year
		WebElement year=d.findElement(By.xpath("//select[@id='year']"));
		Select s=new Select(year);                   //create object of select class
		s.selectByVisibleText("2020");
		Thread.sleep(2000);
		
		//select month
		WebElement month=d.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Mar");
		Thread.sleep(2000);
		
		//select day
		WebElement day=d.findElement(By.xpath("//select[@id='day']"));
		Select s2=new Select(day);
	    s2.selectByVisibleText("10");
	    Thread.sleep(2000); */
		WebElement ma=d.findElement(By.xpath("//label[@text()='Male']"));
		Select  s3=new Select(ma);
		 s3.selectByVisibleText("male");
	    
	    //first name
	    WebElement s4=d.findElement(By.xpath("//input[@type='text']"));
	    s4.sendKeys("suresh");
	    
		
		
		}

	
}
