package Reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewtoursReusableMethods {
	
	public void Login(WebDriver driver){
		try{
		 driver.findElement(By.linkText("SIGN-ON")).click();
		 Thread.sleep(2000);
	     driver.findElement(By.id("userName")).sendKeys("TEST");
	     driver.findElement(By.id("password")).sendKeys("Test@123");
	     driver.findElement(By.name("register")).click();
	     Thread.sleep(2000);
		 System.out.println("Login Successful !");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
