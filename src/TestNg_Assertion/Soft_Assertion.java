package TestNg_Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion {
	
	SoftAssert soft= new SoftAssert();
	
	@Test
	public void DemoTest1() {
		
		soft.assertEquals("Welcome", "Welcome");
		System.out.println("Execution started");
		
		soft.assertEquals("Selenium","Selenium");//false
		System.out.println("Successfully passed DemoTest");
		
		soft.assertAll();
		
		//It collect the result of all the assertion and in case of any failure mark 
		//the test as failed
	}
	@Test
	public void DemoTest2() {
		soft.assertEquals("Welcome", "Welcome");
		System.out.println("Execution started");
		
		soft.assertTrue(true);
		soft.assertEquals(false, false);//false
		soft.assertEquals("Selenium", "Selenium");
		
		System.out.println("Successfully passed DemoTest2");
		
		soft.assertAll();
	}

}
