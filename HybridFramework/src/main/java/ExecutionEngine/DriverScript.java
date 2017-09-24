package ExecutionEngine;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import Constant.Constant;
import Reusable.*;
import junit.framework.Assert;

public class DriverScript {
	public WebDriver driver;
	public String data[][];
	public String username; 
	public String password; 
	public NewtoursReusableMethods newtoursReusable = new NewtoursReusableMethods();
	 
	
	@BeforeMethod
	public void config() throws MalformedURLException, InterruptedException{
		DesiredCapabilities capabilities =  DesiredCapabilities.chrome();
		driver =  new RemoteWebDriver(new URL("http://192.168.0.108:4444/wd/hub"), capabilities);
		//System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get(Constant.baseUrl);
		Thread.sleep(4000);

}
	
	/*
	 * Test Case ID : hsdjds_011
	 * desc : this test is used the create wo
	 * 
	 */
	@Test
	  public void Create_Order_Flow() throws InterruptedException {
		  	driver.manage().window().maximize();
			driver.get(Constant.baseUrl);
			Thread.sleep(10000);
			driver.close();
	 } 
	  @Test(priority=0)
	  public void Test_Case_2() throws InterruptedException {
			driver.manage().window().maximize();
			driver.get(Constant.baseUrl_2);
			Thread.sleep(10000);
			driver.close();
	 }
	  @Test
	  public void Test_Case_3() throws InterruptedException {
			driver.manage().window().maximize();
			driver.get(Constant.baseUrl_2);
			
			Thread.sleep(10000);
			driver.close();
	 }
	@Test
	 public void Register() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(Constant.baseUrl);
		driver.findElement(By.linkText("REGISTER")).click(); 
		Thread.sleep(10000);
		SignUp.SignUpUser(driver, username, password);
		
		
		String labelText = driver.findElement(By.id("labelID")).getText();
		if("labelText".equalsIgnoreCase(labelText)) { System.out.println("text validated"); }
		
		Assert.assertEquals("labelText", labelText);
		
		
		
		driver.findElement(By.linkText("SIGN-OFF")).click();
		}
	 @Test
	 public void Login() throws InterruptedException {
		 newtoursReusable.Login(driver);
	 }
	@Test
	 public void Logout() throws InterruptedException {
	   driver.findElement(By.linkText("SIGN-OFF")).click();
	   Thread.sleep(10000);
	}
	
	@AfterTest
	public void Endsession(){
	   driver.close();	
	}
	
}
