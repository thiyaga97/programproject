package org.fb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{

	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private static WebElement txtUser;
	@FindBy(id="pass")
	private static WebElement txtPass;
	@FindBy(name="login")
	private static WebElement btnlogin;
	public  WebElement getTxtUser() {
		return txtUser;
	}
	
	public  WebElement getTxtPass() {
		return txtPass;
	}
	public  WebElement getBtnlogin() {
		return btnlogin;
	}

}
