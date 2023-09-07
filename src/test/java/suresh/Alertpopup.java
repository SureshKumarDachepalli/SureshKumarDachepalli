package suresh;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws Throwable {
	WebDriver	driver=new ChromeDriver();
	driver.get("https://www.demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	Alert alt=driver.switchTo().alert();//switchTo() use -->control enter to alerts
	//switch the control of driver from web page to alert pop up
	
	alt.accept();              //accept()-->Ok the alert
	Thread.sleep(3000);
	
		String	text =alt.getText();//getText()-->capture the text msg 
           
	 System.out.println(text);
	 
	  String	text1 =alt.getText();
	 alt.dismiss();       //click on the "cancel" button
	 System.out.println(text1);
	}

}
