package TestNgFeatures;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword4_dependsOnMethod {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void loginTest() {
		
		int i=10/2;
	}
	@Test(dependsOnMethods="loginTest")
	public void Homepage() {
		System.out.println("Home page");
	}
	@Test(dependsOnMethods="loginTest")
	public void Searchpage() {
		System.out.println("Search page");
	}
	@Test
	public void dashboard() {
		System.out.println("Dashboard");
		Reporter.log("Running dashboardtestcase", true);
	}

}
