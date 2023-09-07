package suresh;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pom_classes {   //https://demo.actitime.com/login.do
       //Declaration
	
			@FindBy(xpath="//input[@id='username'] ")private WebElement untextbox;
			@FindBy(xpath="//input[@name='pwd'] ")private WebElement pwtextbox;
			@FindBy(xpath="//div[text()='Login']")private WebElement letinbtn;   //>Login<
			public pom_classes() {
				
			}
			//initialization
			public WebElement getUntextbox() {
				return untextbox;
			}
			public WebElement getPwtextbox() {
				return pwtextbox;
			}
			public WebElement getLetinbtn() {
				return letinbtn;
			}
			
		
}
