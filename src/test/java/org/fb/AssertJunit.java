package org.fb;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AssertJunit {

	@Test
	public void tc1() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		BaseClass b= new BaseClass();
		
		b.launchUrl(driver, "https://www.facebook.com/");
		Assert.assertTrue("verify url", driver.getCurrentUrl().contains("facebook"));
	
	
		WebElement txtUser = driver.findElement(By.id("email"));
		b.sendValues(txtUser, b.getDataFromExcel("C:\\Users\\mypc\\eclipse-workspaces\\Facebooklogin\\excel\\students detail.xlsx", "login", 2, 1));

		WebElement txtPass = driver.findElement(By.id("pass"));
		b.sendValues(txtPass, "java");
		Assert.assertEquals(" Verify Password", "java", txtPass.getAttribute("value"));
		WebElement btnlogin = driver.findElement(By.name("login"));
		b.btnClick(btnlogin);
		Thread.sleep(3000);
		driver.quit();

}
}