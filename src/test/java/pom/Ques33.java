package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ques33 extends BaseJava{
public Ques33() {
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='COURSES']")
private WebElement course;

@FindBy(xpath="//span[text()='Java Training']")
private WebElement jc;

@FindBy(xpath="//span[text()='Core Java Training']")
private WebElement cjt;

@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
private WebElement g;

public WebElement getCourse() {
	return course;
}

public WebElement getJc() {
	return jc;
}

public WebElement getCjt() {
	return cjt;
}

public WebElement getG() {
	return g;
}
}
