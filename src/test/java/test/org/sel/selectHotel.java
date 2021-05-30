package test.org.sel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectHotel extends GlobalLib{
	public selectHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@id='radiobutton_0'])[1]")
	private WebElement selectHotel;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement btncontinue;

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public void setSelectHotel(WebElement selectHotel) {
		this.selectHotel = selectHotel;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}

	public void setBtncontinue(WebElement btncontinue) {
		this.btncontinue = btncontinue;
	}
}
