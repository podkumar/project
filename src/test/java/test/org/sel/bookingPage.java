package test.org.sel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookingPage extends GlobalLib{
public bookingPage() {
	PageFactory.initElements(driver, this);
	}
@FindBy(xpath="(//select[@class='search_combobox'])[1]")
private WebElement dropDownLocation;

@FindBy(xpath="(//select[@class='search_combobox'])[2]")
private WebElement dropDownHotel;

@FindBy(xpath="(//select[@class='search_combobox'])[3]")
private WebElement roomType;

@FindBy(xpath="(//select[@class='search_combobox'])[4]")
private WebElement numberOfRooms;

@FindBy(id="datepick_in")
private WebElement checkInDate;

@FindBy(id="datepick_out")
private WebElement checkOutDate;

@FindBy(xpath="(//select[@class='search_combobox'])[5]")
private WebElement adultsPerRoom;

@FindBy(xpath="(//select[@class='search_combobox'])[6]")
private WebElement childsPerRoom;

@FindBy(id="Submit")
private WebElement btnsubmit;

public WebElement getDropDownLocation() {
	return dropDownLocation;
}

public void setDropDownLocation(WebElement dropDownLocation) {
	this.dropDownLocation = dropDownLocation;
}

public WebElement getDropDownHotel() {
	return dropDownHotel;
}

public void setDropDownHotel(WebElement dropDownHotel) {
	this.dropDownHotel = dropDownHotel;
}

public WebElement getRoomType() {
	return roomType;
}

public void setRoomType(WebElement roomType) {
	this.roomType = roomType;
}

public WebElement getNumberOfRooms() {
	return numberOfRooms;
}

public void setNumberOfRooms(WebElement numberOfRooms) {
	this.numberOfRooms = numberOfRooms;
}

public WebElement getCheckInDate() {
	return checkInDate;
}

public void setCheckInDate(WebElement checkInDate) {
	this.checkInDate = checkInDate;
}

public WebElement getCheckOutDate() {
	return checkOutDate;
}

public void setCheckOutDate(WebElement checkOutDate) {
	this.checkOutDate = checkOutDate;
}

public WebElement getAdultsPerRoom() {
	return adultsPerRoom;
}

public void setAdultsPerRoom(WebElement adultsPerRoom) {
	this.adultsPerRoom = adultsPerRoom;
}

public WebElement getChildsPerRoom() {
	return childsPerRoom;
}

public void setChildsPerRoom(WebElement childsPerRoom) {
	this.childsPerRoom = childsPerRoom;
}

public WebElement getBtnsubmit() {
	return btnsubmit;
}

public void setBtnsubmit(WebElement btnsubmit) {
	this.btnsubmit = btnsubmit;
}
}
