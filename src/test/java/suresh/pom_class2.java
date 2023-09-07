package suresh;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_class2 {  //pom or java design pattern/object repository
	//declaration
	@FindBy(xpath="//input[@id='u_2_b_pD'] ")private WebElement fntextbox;
	@FindBy(xpath="//input[@id='u_2_d_aY'] ")private WebElement sntextbox;
	@FindBy(xpath=" //input[@id='u_3_g_/4']")private WebElement mntextbox;
	@FindBy(xpath="//input[@id='password_step_input']")private WebElement Nptextbox;

	//Initialization
	public pom_class2(WebElement driver) {
		PageFactory.initElements(driver,this); /*pagefactory class in ---> initElements();*/
		
	}
	

    public WebElement getFntextbox() {
		return fntextbox;
	}


	public WebElement getSntextbox() {
		return sntextbox;
	}


	public WebElement getMntextbox() {
		return mntextbox;
	}


	public WebElement getNptextbox() {
		return Nptextbox;
	}
	
	

}
