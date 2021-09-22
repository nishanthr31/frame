package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ques1 extends BaseJava {
	public Ques1() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement mail;

	@FindBy(name = "login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	@FindBy(id = "pass")
	private WebElement pass;

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPass() {
		return pass;
	}

}
