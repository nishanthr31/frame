package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pom.BaseJava;

public class frame extends BaseJava{
public static void main(String[] args) {
	
	launchUrl();
	pageurl("https://netbanking.hdfcbank.com/netbanking/");
	
	//mostly used in finacial  sector
	
	driver.switchTo().frame(0);
	// or //
	driver.switchTo().frame("login_page");
	
	WebElement n=driver.findElement(By.xpath("//input[@type='text']"));
	n.sendKeys("nish");
	
	driver.switchTo().defaultContent();//-------first first page go
	driver.switchTo().parentFrame();//---------before page go 
}
 }
