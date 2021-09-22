package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinFirstPage extends BaseJava {
	public AdactinFirstPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(name = "hotels")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement rooms;

	@FindBy(id = "datepick_in")
	private WebElement indate;

	@FindBy(id = "datepick_out")
	private WebElement outdate;

	@FindBy(id = "adult_room")
	private WebElement adult;

	@FindBy(id = "child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getIndate() {
		return indate;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}
	private void sysout() {
		// TODO Auto-generated method stub

	}

}
