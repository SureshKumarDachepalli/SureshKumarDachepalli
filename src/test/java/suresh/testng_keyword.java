package suresh;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testng_keyword {
	@Test(invocationCount=5)
	public void m1(){
		Reporter.log("hi",true);
	}
	@Test(priority=1)//0,1,2
	public void m2() {
		Reporter.log("hello",true);
	}
	@Test(enabled=false)
	public void m3() {
		Reporter.log("guru",true);
	}
	@Test(priority=2)
	public void m4() {
		Reporter.log("welcome",true);
		Assert.fail();   //intentionally we are failing the test case
	}
	

}
