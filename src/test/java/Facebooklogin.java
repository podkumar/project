import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\FacebookLogin\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	WebElement txtuser = driver.findElement(By.id("email"));
	txtuser.sendKeys("dinesh");
	WebElement txtpass = driver.findElement(By.id("pass"));
	txtpass.sendKeys("password");
	WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
	btnLogin.click();
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
 }	
}
