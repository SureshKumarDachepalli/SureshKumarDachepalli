
package suresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Minimize {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		Thread.sleep(3000);
		d.manage().window().minimize();

	}

}
