package test.org.sel;

import org.openqa.selenium.WebElement;

public class mainClass extends GlobalLib{
 public static void main(String[] args) throws InterruptedException {
	GlobalLib global = new GlobalLib();
	global.getDriver();
	global.launchUrl("http://adactinhotelapp.com/");
	global.sleep();
	
	loginPage loginPage =new loginPage();
	WebElement txtUserName = loginPage.getTxtUserName();
	global.enterText(txtUserName, "dineshkm");
	WebElement txtPasswrod = loginPage.getTxtPasswrod();
	global.enterText(txtPasswrod, "password");
	WebElement btnLogIn = loginPage.getBtnLogIn();
	global.btnclick(btnLogIn);
	global.sleep();
	
	bookingPage bookingPage =new bookingPage();
	WebElement location = bookingPage.getDropDownLocation();
	global.dropDown(location, "London");
	WebElement hotel = bookingPage.getDropDownHotel();
	global.dropDown(hotel, "Hotel Sunshine");
	WebElement roomType = bookingPage.getRoomType();
	global.dropDown(roomType, "Super Deluxe");
	WebElement numberOfRooms = bookingPage.getNumberOfRooms();
	global.dropDown(numberOfRooms, "2 - Two");
	WebElement checkInDate = bookingPage.getCheckInDate();
	bookingPage.clear(checkInDate);
	global.enterText(checkInDate, "18/05/2021");
	WebElement checkOutDate = bookingPage.getCheckOutDate();
	global.clear(checkOutDate);
	global.enterText(checkOutDate, "20/05/2021");
	WebElement adultsPerRoom = bookingPage.getAdultsPerRoom();
	global.dropDown(adultsPerRoom, "2 - Two");
	WebElement childsPerRoom = bookingPage.getChildsPerRoom();
	global.dropDown(childsPerRoom, "2 - Two");
	WebElement btnsubmit = bookingPage.getBtnsubmit();
	global.btnclick(btnsubmit);
	global.sleep();
	
	selectHotel selectHotel =new selectHotel();
	WebElement selectHotel2 = selectHotel.getSelectHotel();
	global.btnclick(selectHotel2);
	WebElement btncontinue = selectHotel.getBtncontinue();
	global.btnclick(btncontinue);
	global.sleep();
	
	customerDetailsPage detailsPage =new customerDetailsPage();
	WebElement firstName = detailsPage.getFirstName();
	global.enterText(firstName, "Dinesh");
	WebElement secondName = detailsPage.getSecondName();
	global.enterText(secondName, "Kumar");
	WebElement address = detailsPage.getBillingAddress();
	global.enterText(address, "Madurai");
	WebElement cardNumber = detailsPage.getCreditCardNumber();
	global.enterText(cardNumber, "9876567894543332");
	WebElement cardType = detailsPage.getCreditCardType();
	global.dropDown(cardType, "Master Card");
	WebElement expiryMonth = detailsPage.getExpiryMonth();
	global.dropDown(expiryMonth, "March");
	WebElement expiryYear = detailsPage.getExpiryYear();
	global.dropDown(expiryYear, "2022");
	WebElement cvvNumber = detailsPage.getCvvNumber();
	global.enterText(cvvNumber, "987");
	WebElement btnBookNow = detailsPage.getBtnBookNow();
	global.btnclick(btnBookNow);
}
}
