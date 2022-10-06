package test.ng.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.fb.BaseClass;
import org.fb.LoginPojo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ngclass02 {
	
	public static String[][] data = null;
	
	private String[][] getExcelData() throws IOException {
		File file = new File("C:\\Users\\mypc\\eclipse-workspaces\\Facebooklogin\\excel\\students detail.xlsx");
		FileInputStream fin = new FileInputStream(file);
		Workbook work = new XSSFWorkbook(fin);
		Sheet s= work.getSheet("login");
		int rowCount = s.getPhysicalNumberOfRows();
		
		
		
		for (int i = 1; i < rowCount; i++) {
			Row row = s.getRow(i);
			int cellCount = row.getPhysicalNumberOfCells();
			
			for (int j = 1; j <cellCount; j++) {	
				Cell cell = row.getCell(j);
//				String testData[][] = new String[rowCount-1][cellCount-1];
				
				
			}
			
		}
		return data;
		
		

	}
	/*
	@DataProvider(name="dataDetails")
	public String[][] loginDataDetails() throws IOException {
		data= getExcelData();
		return data;

	}
	
	
	@Test(dataProvider="dataDetails")
	public void test4(String UserName, String Password) throws IOException, InterruptedException {
		BaseClass b= new BaseClass();
		WebDriver driver = b.launchBrowser();
		b.launchUrl(driver, "https://www.facebook.com/");
		LoginPojo lp = new LoginPojo();
		WebElement txtUser = lp.getTxtUser();
		b.sendValues(txtUser, UserName);
		WebElement txtPass = lp.getTxtPass();
		b.sendValues(txtPass, Password);
		WebElement btnlogin = lp.getBtnlogin();
		b.btnClick(btnlogin);
		Thread.sleep(5000);

	}*/

}
