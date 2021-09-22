package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ques4 extends BaseJava {
	public Ques4() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement mail;

	@FindBy(id = "pass")
	private WebElement pass;

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPass() {
		return pass;
	}
}
