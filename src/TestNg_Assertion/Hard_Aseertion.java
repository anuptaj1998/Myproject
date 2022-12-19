package TestNg_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Hard_Aseertion {
	
	@Test
	public void DemoTest() {
		
		Assert.assertTrue(false);
		System.out.println("Hello good morning");//pass
		
		Assert.assertEquals("Welcome",true);//failed
		System.out.println("Hello");
		
		Assert.assertEquals("Selenium","Selenium");
		System.out.println("Sussessfully passed");
    }
	@Test
	public void demoTest() {
		System.out.println();
		
		Assert.assertTrue(true);
		System.out.println("Good morning");
		
		Assert.assertEquals("Selenium", "Selenium");
		System.out.println("Successfully passed");
	}
}