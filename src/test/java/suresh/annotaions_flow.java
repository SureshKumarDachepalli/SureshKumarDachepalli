package suresh;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotaions_flow {
	@BeforeSuite
	public void m1() {
		Reporter.log("=== connection to database ===",true);
	}
	@BeforeClass
	public void m2() {
		Reporter.log("=== open the browser",true);
	}
	@BeforeMethod
	public void m3() {
		Reporter.log("=== login to application",true);
	}
	@BeforeTest
	public void m4() {
		Reporter.log("===execute before every test runner===",true);
	}
	@Test
	public void t1() {
		Reporter.log("===main test case===",true);
	}
	
	@AfterTest
	public void m5() {
		Reporter.log("=== execute after every test runner===",true);
	}
	@AfterMethod
	public void m6() {
		Reporter.log("=== logout from application===",true);
	}
	@AfterClass
	public void m7() {
		Reporter.log("====close the browser===",true);
	}
	@AfterSuite
	public void m8() {
		Reporter.log("===database disconnection===",true);
	}

}
