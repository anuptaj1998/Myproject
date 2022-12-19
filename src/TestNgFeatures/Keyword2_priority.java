package TestNgFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Keyword2_priority {
	
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(priority=5)
	public void Loginpage() {
		String Title=driver.getTitle();
		System.out.println(Title);
		System.out.println("Test4");
	}
	@Test(priority=4)
	public void OranagehrmLogo() {
		boolean b=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println(b);
		System.out.println("Test5");
	}
	@Test
	public void A() {
		//driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")).click();
		System.out.println("Test6");
	}
	@Test(priority=-1)
	public void test1() {
		System.out.println("Test3");
	}
	@Test(priority=2)
	public void test2() {
		System.out.println("Test2");
	}
	@Test(priority=1)
	public void test3() {
		System.out.println("Test1");
	}
//	@AfterMethod
//	public void Teardown() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.quit();
	//}
	}


