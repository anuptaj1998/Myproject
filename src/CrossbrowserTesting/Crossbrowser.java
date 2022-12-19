package CrossbrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
	
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Parameters("Browsername")
	@Test
	public void orangeHRMLogin(String Browsername) throws InterruptedException {
		
		if(Browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Installer\\geckodriver.exe");
		    driver = new FirefoxDriver();
			
		}
		
		if(Browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		if(Browsername.equals("IE")) {
			System.setProperty("webdriver.Ie.driver","C:\\Installer\\IEDriverServer_x64_4.6.0");
			driver=new InternetExplorerDriver();
	    }
		if(Browsername.equals("Edge")) {
			System.setProperty("webdriver.edge.driver","C:\\Installer\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
		Thread.sleep(2000);
		
		String Expectedname = "PaulRakesh Collings";
		String Actualname = driver.findElement(By.xpath("//p[contains(text(),'Time at Work')]")).getText();
		Thread.sleep(2000);
		
		if(Expectedname.equals(Actualname)) {
			System.out.println("Passed");
		}
		else {
			System.out.println("failed");
		}
		driver.quit();
	}
		
}
