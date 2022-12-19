package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import graphql.Assert;

public class DataProvider1 {
	
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test(dataProvider="LoginData")
	public void LoginTest(String Username,String Password) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Time at Work')]")).isDisplayed());
		Thread.sleep(2000);
		driver.quit();
	}
	@DataProvider(name="LoginData")
	public Object[][] logindata() {
		 
		Object data[][] = new Object[4][2];
		
		//correct username & correct password
		
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		//correct username & wrong password
		
		data[1][0]="Admin";
		data[1][1]="admin12";
		
		//wrong username & correct Password
		
		data[2][0]="Admin1234";
		data[2][1]="admin123";
		
		//Wrong username & Wrong Password
		
		data[3][0]="Admin23";
		data[3][1]="admin134";
		
		return data;
	}

}
