package TestNgFeatures;

import org.testng.annotations.Test;

public class Keyword7_timeout {
	
	//TimeOutException
	@Test(timeOut=1000)
	public void infiniteloop() {
		for(;;) {
			System.out.println("Hello");
		}
	}

}
