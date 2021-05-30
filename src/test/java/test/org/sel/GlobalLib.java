package test.org.sel;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class GlobalLib {
	private static final String TakesScreenshot = null;
	static WebDriver driver;
	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\FacebookLogin\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
	}
	public void launchUrl(String url) {
		driver.get(url);
	}
	public void enterText(WebElement element, String Data) {
		element.sendKeys(Data);
	}
	public void btnclick(WebElement element) {
		element.click();	
	}
	public void close() {
		driver.close();		
	}
	public void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public void title() {
		String title = driver.getTitle();
		System.out.println(title);		
	}
	public void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}
	public void getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}
	public void dropDown(WebElement element, String i) {
		Select select = new Select(element);
		select.selectByVisibleText(i);		
	}
	public void options(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
	}
	public void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public void alertDismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();		
	}
	public void promptAlert(String input) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(input);
		alert.accept();
	}
	public void alertGetText() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
	}
	public void moveToElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}
	public void dragAndDrop(WebElement source,WebElement target) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).perform();		
	}
	public void doubleClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).perform();
	}
	public void screenshot(String path) throws IOException {
		TakesScreenshot ss = (TakesScreenshot)driver;
		File screenshotAs = ss.getScreenshotAs(OutputType.FILE);
		File f = new File(path);
		FileHandler.copy(screenshotAs, f);
	}
	public void scrolldown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}
	public void scrollup(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)",element);
	}
	public void newFile(String path) throws IOException {
		File file = new File(path);
		boolean exists = file.exists();
		System.out.println(exists);
		boolean createNewFile = file.createNewFile();
		System.out.println(createNewFile);
	}
	public void newFolder(String path) {
		File file = new File(path);
		boolean mkdir = file.mkdir();
		System.out.println(mkdir);
	}
	public void insideNewFolder(String path) {
		File file = new File(path);
		boolean mkdirs = file.mkdirs();
		System.out.println(mkdirs);
	}
	public void refreshPage() {
		driver.navigate().refresh();		
	}
	public void forwardPage() {
		driver.navigate().forward();
	}
	public void backwardPage() {
		driver.navigate().back();
	}
	public void clear(WebElement element) {
		element.clear();		
	}
}
