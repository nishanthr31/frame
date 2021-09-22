package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinThirdPage extends BaseJava {
	public AdactinThirdPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement fname;

	@FindBy(id = "last_name")
	private WebElement lname;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement cardno;

	@FindBy(id = "cc_type")
	private WebElement cardtype;

	@FindBy(id = "cc_exp_month")
	private WebElement cmonth;

	@FindBy(id = "cc_exp_year")
	private WebElement cyear;

	@FindBy(id = "cc_cvv")
	private WebElement ccvv;
	
	@FindBy(id="book_now")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getCmonth() {
		return cmonth;
	}

	public WebElement getCyear() {
		return cyear;
	}

	public WebElement getCcvv() {
		return ccvv;
	}

}
