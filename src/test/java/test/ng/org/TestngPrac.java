package test.ng.org;

import java.io.IOException;

import org.fb.BaseClass;
import org.fb.LoginPojo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngPrac {
	public static WebDriver driver;
	
	@Test
	@Parameters({"UserName", "Password"})
	public void test1(String usrName, String pswrd) throws IOException, InterruptedException {
		BaseClass b= new BaseClass();
		WebDriver driver = b.launchBrowser();
		b.launchUrl(driver, "https://www.facebook.com/");
		LoginPojo lp = new LoginPojo();
		WebElement txtUser = lp.getTxtUser();
		b.sendValues(txtUser, usrName);
		WebElement txtPass = lp.getTxtPass();
		b.sendValues(txtPass, pswrd);
		WebElement btnlogin = lp.getBtnlogin();
		b.btnClick(btnlogin);
		Thread.sleep(5000);

	}
	
	/*@Test	
	public void test2() throws IOException, InterruptedException {
		BaseClass b= new BaseClass();
		WebDriver driver = b.launchBrowser();
		b.launchUrl(driver, "https://www.facebook.com/");
		LoginPojo lp = new LoginPojo();
		WebElement txtUser = lp.getTxtUser();
		b.sendValues(txtUser, b.getDataFromExcel("E:\\JAVA SELENIUM\\data files\\students detail.xlsx", "login", 1, 1));
		WebElement txtPass = lp.getTxtPass();
		b.sendValues(txtPass, b.getDataFromExcel("E:\\JAVA SELENIUM\\data files\\students detail.xlsx", "login", 1, 2));
		WebElement btnlogin = lp.getBtnlogin();
		b.btnClick(btnlogin);
		Thread.sleep(5000);

	}*/
	
	/*@Test(groups= {"Ndgroup"}, priority=1)
	public void test3() throws IOException, InterruptedException {
		BaseClass b= new BaseClass();
		WebDriver driver = b.launchBrowser();
		b.launchUrl(driver, "https://www.facebook.com/");
		LoginPojo lp = new LoginPojo();
		WebElement txtUser = lp.getTxtUser();
		b.sendValues(txtUser, b.getDataFromExcel("E:\\JAVA SELENIUM\\data files\\students detail.xlsx", "login", 3, 1));
		WebElement txtPass = lp.getTxtPass();
		b.sendValues(txtPass, b.getDataFromExcel("E:\\JAVA SELENIUM\\data files\\students detail.xlsx", "login", 3, 2));
		WebElement btnlogin = lp.getBtnlogin();
		b.btnClick(btnlogin);
		Thread.sleep(5000);

	}
	@Test(groups= {"Vdgroup"}, priority=0)
	public void test4() throws IOException, InterruptedException {
		BaseClass b= new BaseClass();
		WebDriver driver = b.launchBrowser();
		b.launchUrl(driver, "https://www.facebook.com/");
		LoginPojo lp = new LoginPojo();
		WebElement txtUser = lp.getTxtUser();
		b.sendValues(txtUser, b.getDataFromExcel("E:\\JAVA SELENIUM\\data files\\students detail.xlsx", "login", 4, 1));
		WebElement txtPass = lp.getTxtPass();
		b.sendValues(txtPass, b.getDataFromExcel("E:\\JAVA SELENIUM\\data files\\students detail.xlsx", "login", 4, 2));
		WebElement btnlogin = lp.getBtnlogin();
		b.btnClick(btnlogin);
		Thread.sleep(5000);

	}*/

	
//	@AfterMethod
//	private void closeBrowser() throws InterruptedException {
//		BaseClass b= new BaseClass();
//		b.quitBrowser(driver);
//		
//
//	}
}
