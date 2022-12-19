package TestNgAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation1 {
	
	//Precondition anootation --starts with @Before
	
	/* @BeforeSuite--Set up Property--1st preference
	 * @BeforeTest-- Enter URL --2nd Pre.
	 * @BeforeClass--Launch Browser-3rd pre.
	 * 
	 * @BforeMethod--Login to application
	 * @Test--Google test
	 * @AfterMethod--LogOut from application
	 * 
	 * @AfterClass--Close Browser
	 * @AfterTest--deletecookies
	 * @AfterSuite--
	 */
	
	@BeforeSuite
	public void Setup() {
		System.out.println("@BeforeSuite--Set up Property for chrome");
	}
	
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("@BeforeClass--LaunchBrowser");
	}
	@BeforeTest
	public void URL() {
		System.out.println("@BeforeTest--EnterURL");
	}
	@BeforeMethod
	public void login() {
		System.out.println("@BeforeMethod--Login to application");
	}
	//Test annotation --starts with @Test
	@Test
	public void GoogletitleTest() {
		System.out.println("@Test--GoogleTest");
	}
	@Test
	public void demo() {
		System.out.println("@Test--Demotest");
	}
	@Test
	public void demo2() {
		System.out.println("@Test--demo2test");
	}
	
    //Postcondition --starts with @After @AfterMethod
	
	public void logout() {
		System.out.println("@AfterMethod--Logout from application");
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("@AfterMethod--Logout from application");
	}
	@AfterTest
	public void Deleteallcookies() {
		System.out.println("@AfterTest--deleteallacookies");
	}
	
	
	

}
