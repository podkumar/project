package test.org.sel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class customerDetailsPage extends GlobalLib {
	public customerDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstName;

	@FindBy(xpath="//input[@id='last_name']")
	private WebElement secondName;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement billingAddress;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement creditCardNumber;
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement creditCardType;
	
	@FindBy(id ="cc_exp_month")
	private WebElement expiryMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvvNumber;
	
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement btnBookNow;

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getSecondName() {
		return secondName;
	}

	public void setSecondName(WebElement secondName) {
		this.secondName = secondName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(WebElement billingAddress) {
		this.billingAddress = billingAddress;
	}

	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(WebElement creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(WebElement creditCardType) {
		this.creditCardType = creditCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(WebElement expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(WebElement expiryYear) {
		this.expiryYear = expiryYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public void setCvvNumber(WebElement cvvNumber) {
		this.cvvNumber = cvvNumber;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public void setBtnBookNow(WebElement btnBookNow) {
		this.btnBookNow = btnBookNow;
	}
	
}


