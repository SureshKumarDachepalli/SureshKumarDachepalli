package suresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenpopup {
	public static void main(String args[]){
	WebDriver	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");//login page-enter email/mobile no: inspect
	driver.findElement(By. xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
	}

}
