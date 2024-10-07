package Amazon.India;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Amazon.Amazon_Artifact.BrowserFactory;

public class Amazon_Home{
	private static final TimeUnit TimeUnit = null;
	private static final String Seconds = null;
	WebDriver driver;
	
	@BeforeClass
	public void browserInit()
	{
	driver = BrowserFactory.browsers();	
	}
	@Test
	public void verifyMenu()
	{
	String Menu2=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).getText();
	System.out.println(Menu2); 
	}
	
	

}
