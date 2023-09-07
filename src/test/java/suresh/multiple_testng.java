package suresh;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class multiple_testng {
	
	@Test
	 public void m1() {
		Reporter.log("boss i am from tc1",true); //Assert.fail()--> where use that case only fail
		}
	@Test
	public void m2() {
		Reporter.log("boss i am from tc2",true);
	}
	@Test
	public void m3() {
		Reporter.log("boss i am from tc3",true);
	}

}
