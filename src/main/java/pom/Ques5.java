package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ques5 extends BaseJava {
public Ques5() {
	PageFactory.initElements(driver, this);
}
@FindBy()
private WebElement name;

}
