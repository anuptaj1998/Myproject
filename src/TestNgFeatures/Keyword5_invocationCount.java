package TestNgFeatures;

import org.testng.annotations.Test;

public class Keyword5_invocationCount {
	
	@Test(invocationCount=10)
	public void m1() {
		
		int a=10;
		int b=20;
		int c=a+b;
		
		System.out.println("Sum of 10 and 20 is :"+c);
	}

}
