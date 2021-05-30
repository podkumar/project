package test.org.sel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends GlobalLib {
	
	public loginPage() {
		PageFactory.initElements(driver,this);
	}
	@FindAll({@FindBy(id="username"),@FindBy(xpath="(//input[@class='login_input'])[1]")})
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPasswrod;
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement btnLogIn;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public void setTxtUserName(WebElement txtUserName) {
		this.txtUserName = txtUserName;
	}

	public WebElement getTxtPasswrod() {
		return txtPasswrod;
	}

	public void setTxtPasswrod(WebElement txtPasswrod) {
		this.txtPasswrod = txtPasswrod;
	}

	public WebElement getBtnLogIn() {
		return btnLogIn;
	}

	public void setBtnLogIn(WebElement btnLogIn) {
		this.btnLogIn = btnLogIn;
	}
	
}
