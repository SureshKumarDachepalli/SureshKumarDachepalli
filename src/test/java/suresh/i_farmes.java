package suresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class i_farmes {

	public static void main(String[] args) throws Throwable {
	WebDriver	driver=new EdgeDriver();
	driver.get("https://selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	//navigate to 1st frame
	
	driver.switchTo().frame(0);
	//search any element store in reference variable
String	data=driver.findElement(By.xpath("//h2[@title='Packages']")).getText();
System.out.println(data);//element on first frame-->o.p:-Packages
Thread.sleep(4000);

//navigate to 2nd frame
driver.switchTo().defaultContent();
driver.switchTo().frame(1);
String text1=driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
System.out.println(text1);//o.p:-AbstractAnnotations
Thread.sleep(3000);



//navigate to 3rd frame
driver.switchTo().defaultContent();
driver.switchTo().frame(2);
String text2 = driver.findElement(By.xpath("//a[text()='org.openqa.selenium.chrome']")).getText();
	System.out.println(text2);//o.p:-org.openqa.selenium.chrome

	}

}
