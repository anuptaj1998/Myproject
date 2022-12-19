package TestNg_Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.Assert;

public class HardAssertion_EX {
	
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test
	public void Username() throws InterruptedException {
		
		WebElement Username=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		WebElement Password=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		
		//AssertTrue
		Assert.assertTrue(Username.isDisplayed());
		Username.sendKeys("Admin");
		Thread.sleep(2000);
		
		Assert.assertTrue(Password.isDisplayed());
		Password.sendKeys("admin123");
		
		//Assertfalse
		
//		Assert.assertFalse(Username.isDisplayed());
//		Username.sendKeys("Admin");
//		Thread.sleep(2000);
//		
//		Assert.assertFalse(Password.isDisplayed());
//		Password.sendKeys("admin123");
	}
	@Test
	public void orangeHRM() throws InterruptedException {
		Thread.sleep(2000);
		boolean Text1=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		
		Assert.assertTrue(Text1);
		
	}
	
	@AfterMethod
	public void Teardown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
