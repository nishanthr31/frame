package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ques41 extends BaseJava {
	public Ques41() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first-name")
	private WebElement name;

	@FindBy(id = "email")
	private WebElement mail;

	@FindBy(id = "mobile")
	private WebElement mob;

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(id = "message")
	private WebElement msg;

	@FindBy(id = "code")
	private WebElement code;

	public WebElement getName() {
		return name;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getMob() {
		return mob;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getMsg() {
		return msg;
	}

	public WebElement getCode() {
		return code;
	}
}
