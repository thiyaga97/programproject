package org.fb;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public  WebDriver launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		return driver;
		}
	public  void launchUrl(WebDriver driver, String url) {
		driver.get(url);
		}
	public  void sendValues(WebElement element, String data) {
		element.sendKeys(data);
		}
	public void btnClick(WebElement element) {
		element.click();
	}
	
	public void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	public String getUrl(WebDriver driver) {
	String Url=	driver.getCurrentUrl();
	return Url;
	}
	public String getPageTilte(WebDriver driver) {
		String title = driver.getTitle();
		return title;
	}
	public String getDataFromExcel(String loc, String sheetName, int rNo, int cNo) throws IOException {
		String value=null;
		File fileloc = new File(loc);
		FileInputStream fileIn = new FileInputStream(fileloc);
		Workbook w = new XSSFWorkbook(fileIn);
		Sheet sheet = w.getSheet(sheetName);
		Row row =  sheet.getRow(rNo);
		Cell cell = row.getCell(cNo);
		int cellType = cell.getCellType();
		

		if (cellType==1) {
			value = cell.getStringCellValue();
			
		
		}
	
		if (cellType==0) {
			boolean b = DateUtil.isCellDateFormatted(cell);
			if(b) {
				Date date = cell.getDateCellValue();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			 value = sdf.format(date);
			
			}else {
				Long l = (long)cell.getNumericCellValue();
				value = String.valueOf(l);
				
						
						
			}
			
		}
		return value;
		
	}
	

		
		
				
		
		
	}
	


