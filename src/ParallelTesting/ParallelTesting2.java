package ParallelTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting2 {
	
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	public void Module1() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String Text = driver.getCurrentUrl();
		System.out.println(Text);
		driver.quit();
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void Module2() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String Text = driver.getCurrentUrl();
		System.out.println(Text);
		driver.quit();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void Module3() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Installer\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String Text = driver.getCurrentUrl();
		System.out.println(Text);
		driver.quit();
	}

}


