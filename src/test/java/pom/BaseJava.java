package pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseJava {
	public static WebDriver driver;

	public static void launchUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// FluentWait<WebDriver> d=new FluentWait<WebDriver>(driver).withTimeout(10,
		// TimeUnit.SECONDS).pollingEvery(10, TimeUnit.MILLISECONDS);
	}

	public static void pageurl(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public static void exit() {
		driver.quit();
	}

	public static void getattribute(WebElement key,int r,int o,int u) throws IOException {
		String g = key.getAttribute("value");
		System.out.println(g);
		
		File f = new File("C:\\Users\\global\\eclipse-workspace framework\\pom\\table\\face.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(r);
		Row t = s.createRow(o);
		Cell c = t.createCell(u);
		c.setCellValue(g);
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		System.out.println("...finished...");
	}

	public static void alert() {
		Alert i = driver.switchTo().alert();
		i.accept();
	}

	public static void fill(WebElement tar, String value) {
		tar.sendKeys(value);
	}

	public static void text(WebElement j) {
		String y = j.getText();
		System.out.println(y);
	}

	public static void click(WebElement tar) {
		tar.click();
	}

	public static void actions(WebElement name) {
		Actions mov = new Actions(driver);
		mov.moveToElement(name).build().perform();
	}

	public static void scrollup(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", ele);
	}

	public static void scrolldown(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
	}

	public static String getvalue(int r, int o, int u) throws IOException {
		File f = new File("C:\\Users\\global\\eclipse-workspace framework\\pom\\table\\face.xlsx");
		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(r);
		Row t = s.getRow(o);
		Cell c = t.getCell(u);

		int cellType = c.getCellType();

		String value;
		if (cellType == 1) {
			value = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date dateCellValue = c.getDateCellValue();
			SimpleDateFormat d = new SimpleDateFormat("dd-mm-yyyy");
			value = d.format(dateCellValue);
		} else {
			double num = c.getNumericCellValue();
			long n = (long) num;
			value = String.valueOf(n);
		}
		return value;
	}

	public static void createsheet(String name, String name1, int d, int i, String name2) throws IOException {
		File f = new File("C:\\Users\\global\\eclipse-workspace framework\\pom\\table\\" + name + ".xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet s = wb.createSheet("nish");
		Row r = s.createRow(d);
		Cell c = r.createCell(i);
		c.setCellValue(name2);
     FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		System.out.println("writed.");
		
	}
                                                        
	

}
