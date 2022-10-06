package org.fb;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbjavaUnit {
		public static WebDriver driver;
		@BeforeClass
		public static void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			}
		@AfterClass
		public static void quitbrowser() {
			driver.quit();
		}
		@Test
		public void tc1() throws InterruptedException, IOException {
			BaseClass b= new BaseClass();
			
			b.launchUrl(driver, "https://www.facebook.com/");
//			PageFactory.initElements(driver, LoginPojo.class); 
			LoginPojo lp = new LoginPojo();
			WebElement txtUser = lp.getTxtUser();
//			WebElement txtUser = driver.findElement(By.id("email"));
			b.sendValues(txtUser, b.getDataFromExcel("C:\\Users\\mypc\\eclipse-workspaces\\Facebooklogin\\excel\\students detail.xlsx", "login", 2, 1));
			WebElement txtPass = lp.getTxtPass();
//			WebElement txtPass = driver.findElement(By.id("pass"));
			b.sendValues(txtPass, b.getDataFromExcel("C:\\Users\\mypc\\eclipse-workspaces\\Facebooklogin\\excel\\students detail.xlsx", "login", 2, 2));
//			WebElement btnlogin = driver.findElement(By.name("login"));
			WebElement btnlogin = lp.getBtnlogin();
			b.btnClick(btnlogin);
			

		}
		
		@Test
		public void tc2() throws InterruptedException, IOException {
			BaseClass b= new BaseClass();
			
			b.launchUrl(driver, "https://www.facebook.com/");
			LoginPojo lp = new LoginPojo();
			WebElement txtUser = lp.getTxtUser();
			b.sendValues(txtUser, b.getDataFromExcel("E:\\JAVA SELENIUM\\data files\\students detail.xlsx", "login", 1, 1));
			WebElement txtPass = lp.getTxtPass();
			b.sendValues(txtPass, b.getDataFromExcel("E:\\JAVA SELENIUM\\data files\\students detail.xlsx", "login", 1, 2));
			WebElement btnlogin = lp.getBtnlogin();
			b.btnClick(btnlogin);
			}
		@Test
		public void tc3() throws InterruptedException, IOException {
			BaseClass b= new BaseClass();
			
			b.launchUrl(driver, "https://www.facebook.com/");
			LoginPojo lp = new LoginPojo();
			WebElement txtUser = lp.getTxtUser();
			b.sendValues(txtUser, b.getDataFromExcel("E:\\JAVA SELENIUM\\data files\\students detail.xlsx", "login", 3, 1));
			WebElement txtPass = lp.getTxtPass();
			b.sendValues(txtPass, b.getDataFromExcel("E:\\JAVA SELENIUM\\data files\\students detail.xlsx", "login", 3, 2));
			WebElement btnlogin = lp.getBtnlogin();
			b.btnClick(btnlogin);
			

		}
		@Ignore
		@Test
		public void tc4() throws InterruptedException, IOException {
			BaseClass b= new BaseClass();
			
			b.launchUrl(driver, "https://www.facebook.com/");
			LoginPojo lp = new LoginPojo();
			WebElement txtUser = lp.getTxtUser();
			b.sendValues(txtUser, b.getDataFromExcel("E:\\JAVA SELENIUM\\data files\\students detail.xlsx", "login", 4, 1));
			WebElement txtPass = lp.getTxtPass();
			b.sendValues(txtPass, b.getDataFromExcel("E:\\JAVA SELENIUM\\data files\\students detail.xlsx", "login", 4, 2));
			WebElement btnlogin = lp.getBtnlogin();
			b.btnClick(btnlogin);
			

		}
	@After
	public void waitTime() throws InterruptedException {
		Thread.sleep(5000);
	}
	@Before
	public void frontwait() throws InterruptedException {
		Thread.sleep(5000);

	}

}
