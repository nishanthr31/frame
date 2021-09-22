package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ques31 extends BaseJava {
public Ques31()  {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//u[contains(text(),'e T')]")
private WebElement text;
@FindBy(xpath="//h1[contains(text(),'e T')]")
private WebElement text1;
public WebElement getText() {
	return text;
}
public WebElement getText1() {
	return text1;
}




}
