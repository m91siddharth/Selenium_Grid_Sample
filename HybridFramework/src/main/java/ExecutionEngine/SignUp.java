package ExecutionEngine;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Constant.Constant;
import Constant.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SignUp {
	static ObjectRepository obr = new ObjectRepository();
//all the methods/ test cases related to sign up page will be create here 
	public static void SignUpUser(WebDriver driver,String username,String password){
		WebElement hompage_login_btn = driver.findElement(By.name(Constant.Homepage_login_button));
		hompage_login_btn.sendKeys("test");
		List<WebElement> btn = driver.findElements((By) obr.getInputIdade());
		btn.get(0).sendKeys("test");
		driver.findElement(By.name("phone")).sendKeys("5147865432");
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("address1")).sendKeys("st mathieu");
		driver.findElement(By.name("address2")).sendKeys("XYZ");
		driver.findElement(By.name("city")).sendKeys("montreal");
		driver.findElement(By.name("state")).sendKeys("Quebec");
		driver.findElement(By.name("postalCode")).sendKeys("H3H2J3");
		Select s=new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("CANADA");
		driver.findElement(By.name("email")).sendKeys("aa@gmail.com");
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("confirmPassword")).sendKeys(password);
		driver.findElement(By.name("register")).click();
	}
}
