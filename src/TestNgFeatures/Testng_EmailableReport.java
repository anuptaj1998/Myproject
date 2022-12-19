package TestNgFeatures;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng_EmailableReport {
	
	@Test
	public void orangeHRMTest() {
		
		System.out.println("@Test--orangeHRMTest");
		
		Reporter.log("Running OrangeHRMTest",true);
	}
	
	@Test
	public void orangeHRMsearch() {
		
		System.out.println("@Test--orangeHRMSearch");
		
		Reporter.log("Search Test Passed",true);
	}

}
