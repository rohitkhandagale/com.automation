package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegressionTest1 {
	
	
	
	
	@Test
	public void testCase1()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Synechron_Learning_Stuff\\chrome_driver\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("log-level=3");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
	    String title=driver.getTitle();
	    Assert.assertEquals(title, "Google");
	}

	

	@Test
	public void testCase2()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Synechron_Learning_Stuff\\chrome_driver\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("log-level=3");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title= driver.getTitle();
		Assert.assertEquals(title, "Facebook – log in or sign upTTT");
	}
}
