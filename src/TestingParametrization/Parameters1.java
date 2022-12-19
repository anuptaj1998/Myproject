package TestingParametrization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parameters1 {

	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	@Parameters({"URL"})
	public void Setup(String URL) {
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);
	}
	@Test
	@Parameters({"Username","Password"})
	public void LoginTest(String Username,String Password) throws InterruptedException {
		
		WebElement User1=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		Thread.sleep(2000);
		User1.sendKeys(Username);
		
		WebElement User2=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		Thread.sleep(2000);
		User2.sendKeys(Password);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
		Thread.sleep(2000);
	}
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
