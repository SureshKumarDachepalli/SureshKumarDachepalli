package suresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.Amazon.com");
		String x=d.getTitle();
		//System.out.println(d.getTitle()); //o/p:-Amazon.com. Spend less. Smile more.
		System.out.println(x);//o/p:-Amazon.com. Spend less. Smile more

	}

}

