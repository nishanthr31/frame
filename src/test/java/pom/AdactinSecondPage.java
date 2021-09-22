package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinSecondPage extends BaseJava {
	public AdactinSecondPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement click;
	@FindBy(id="continue")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}
	public WebElement getClick() {
		return click;
		

	}

}
