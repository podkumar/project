package test.org.sel;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

public static void main(String[] args) throws InterruptedException, IOException {
	
	
	File file = new File("C:\\Users\\Dinesh\\eclipse-workspace\\FacebookLogin\\Excel\\testdata.xlsx");
	FileInputStream fileInputStream = new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(fileInputStream);
	Sheet sheet = workbook.getSheet("Mobile1");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinesh\\eclipse-workspace\\FacebookLogin\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	WebElement txtsrch = driver.findElement(By.id("twotabsearchtextbox"));
	txtsrch.sendKeys("Iphone");
	WebElement btnsrch = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
	btnsrch.click();
	Thread.sleep(2000);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
//	List<WebElement> products = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
//	for (int i = 0; i < products.size(); i++) {
//		String text = products.get(i).getText();
//	
//		Row createRow = sheet.createRow(i);
//		Cell createCell = createRow.createCell(0);
//		createCell.setCellValue(text);
//	}
//		FileOutputStream fileOutputStream2 = new FileOutputStream(file);
//		workbook.write(fileOutputStream2);
//	

	
}
}