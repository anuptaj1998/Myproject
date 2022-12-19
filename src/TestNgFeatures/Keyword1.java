package TestNgFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Keyword1 {
	
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void SetUp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test
	public void LoginPage() {
		
		String Title = driver.getTitle();
		System.out.println();
	}
	@Test
	public void OrangeHRMLogo() {
		
		boolean b=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println(b);
	}
	@Test
	public void forgotpassword() {
		
		driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")).click();
	}
	@AfterMethod
	public void TearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	
}
