package TestNgFeatures;

import org.testng.annotations.Test;

public class Keyword8_expectedException {
	
	//Q.If you want to handle exception without try catch blocks so how will you handle it
	//ans--By using (expectedException=Exceptiontype.class)
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void Test1() {
		System.out.println("Handle ArithmeticException");
		
		int i=10/0;
	}

}
