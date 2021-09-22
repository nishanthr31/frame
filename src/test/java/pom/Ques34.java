package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ques34 extends BaseJava {
public Ques34() {
	PageFactory.initElements(driver,this );
}
@FindBy(xpath="//a[text()='CAREERS']")
private WebElement career;

@FindBy(xpath="//a[text()='www.greenstechnologys.com.']")
private WebElement email;

public WebElement getCareer() {
	return career;
}

public WebElement getEmail() {
	return email;
}
}
