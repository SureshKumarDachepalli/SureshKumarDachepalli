package suresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) throws Throwable {
	WebDriver	driver=new ChromeDriver();
	/*driver.get("https://www.google.com");
   WebElement	gmail= driver.findElement(By.xpath(" //a[@target='_top']"));
   Actions act=new Actions(driver);
   act.moveToElement(gmail).contextClick().perform();
   act.moveToElement(gmail).click().perform();
   act.contextClick(gmail).perform();
   act.doubleClick(gmail).perform();*/
	
  driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
 
  WebElement srs=driver.findElement(By.xpath(" //div[@id='draggable']" )); //write x-path for source element
 WebElement dest=driver.findElement(By.xpath("//div[@id='droppable'] ")); //write x-path for destination element
 Thread.sleep(5000);
 Actions act=new Actions(driver);
 act.dragAndDrop(srs, dest).perform();
 
 driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
 
 WebElement dest1=driver.findElement(By.xpath("//div[@id='droppable'] "));//write x-path for destination element
 WebElement srs1=driver.findElement(By.xpath(" //div[@id='draggable']" ));//write x-path for source element
 
 Actions act1=new Actions(driver);
 act1.dragAndDrop(dest1,srs1).perform();
   
   

	}

}
