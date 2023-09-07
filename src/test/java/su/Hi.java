package su;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hi {

	public static void main(String[] args) throws Throwable {
		WebDriver dri=new EdgeDriver();
		dri.get("https://amazon.in");
	WebElement	textb=dri.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	dri.navigate().refresh();
	
	textb.sendKeys("watches in 20000");


	}

}
