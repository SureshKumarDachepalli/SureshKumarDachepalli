package suresh;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test_ngprogram {
	@Test
	public void m1() {
		Reporter.log("boss i am from tc1",true);
		Reporter.log("hello i am from tc0 ",true);
	}
	@Test
	public void m2() {
		Reporter.log("hello i am from tc2 ");
	}

}
