package test.ng.org;

import java.io.IOException;

import org.fb.BaseClass;
import org.fb.LoginPojo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class facebook {
@Test
private void testFacebook() throws IOException, InterruptedException {
	BaseClass b= new BaseClass();
	WebDriver driver = b.launchBrowser();
	b.launchUrl(driver, "https://www.facebook.com/");
	LoginPojo lp = new LoginPojo();
	WebElement txtUser = lp.getTxtUser();
	b.sendValues(txtUser, b.getDataFromExcel("E:\\JAVA SELENIUM\\data files\\students detail.xlsx", "login", 2, 1));
	WebElement txtPass = lp.getTxtPass();
	b.sendValues(txtPass, b.getDataFromExcel("E:\\JAVA SELENIUM\\data files\\students detail.xlsx", "login", 2, 2));
	WebElement btnlogin = lp.getBtnlogin();
	b.btnClick(btnlogin);
	Thread.sleep(5000);
}


}
