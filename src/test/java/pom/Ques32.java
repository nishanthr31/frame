package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ques32 extends BaseJava{
public Ques32() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='Certifications']")
private WebElement certi;

@FindBy(xpath="(//a[text()='Course Content'])[29]")
private WebElement cc;


@FindBy(xpath="//strong[contains(text(),'m Tra')]")
private WebElement selenium;

@FindBy(xpath="//p[contains(text(),'Rated')]")
private WebElement para;

public WebElement getCerti() {
	return certi;
}

public WebElement getCc() {
	return cc;
}

public WebElement getSelenium() {
	return selenium;
}

public WebElement getPara() {
	return para;
}
}

