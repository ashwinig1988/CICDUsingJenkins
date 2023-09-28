package automation.CICDDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestHomePage {
	
	public static WebDriver driver;
	@BeforeTest
	public void launchDriver()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seek.com.au/");

		
	}
	
	@Test(priority=1)
	public void Test1()
	{
		driver.getTitle();
		
		System.out.println("success");
	}
	
	@Test(priority=2)
	public void Test2() throws InterruptedException
	{
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='keywords-input']")).sendKeys("Test Analyst");
		System.out.print("passed test 2");
	}
	
	
	/*@AfterMethod
	public void tearDown()
		{
			driver.quit();
			
		}*/
	}
