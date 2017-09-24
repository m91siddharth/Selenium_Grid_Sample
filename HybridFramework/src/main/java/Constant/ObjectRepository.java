package Constant;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectRepository {
	
	
	
	@FindBy(id = "j_idt5:idade")
	private WebElement inputIdade;
	
	@FindBy(xpath = "somepath")
	private WebElement hompage_signin_btn_xpath;

	public WebElement getInputIdade() {
		return inputIdade;
	}

	public WebElement gethompage_signin_btn_xpath() {
		return inputIdade;
	}

}
