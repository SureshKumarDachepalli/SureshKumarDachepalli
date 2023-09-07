package suresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		
       WebDriver  driver=new ChromeDriver();
     
	driver.get("https://www.amazon.com");//it will open application
	driver.manage().window().maximize();//method chaining
	driver.close();//don't give arguments

	}

	

}
