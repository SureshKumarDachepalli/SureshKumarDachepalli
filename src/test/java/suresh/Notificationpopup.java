package suresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Notificationpopup {

	public static void main(String[] args) throws Throwable {
	
   ChromeOptions c=new ChromeOptions();
    c.addArguments("--disable-notifications");
	c.addArguments("start-maximized");
	
	WebDriver	d=new ChromeDriver(c); //open browser
	Thread.sleep(3000);
	d.get("http://www.hdfc.com");
	

	}

}
