package org.cts;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pom.BaseJava;

public class Question2 extends BaseJava{

	@BeforeClass
	public static void browser() {
	launchUrl();
	pageurl("https://www.redbus.in/");
	}
	
	@Before
	public void startdate() {
		Date d=new Date();
		System.out.println(d);
	}
	
	@Test
	public void tc1() {
	WebElement click=driver.findElement(By.xpath("//i[@id='i-icon-profile']"));	
	click(click);
	WebElement click2=driver.findElement(By.xpath("//li[@id='signInLink']"));
	click(click2);
	}
	
	@Test
	public void tc2() {
		WebElement num = driver.findElement(By.id("mobileNoInp"));
		fill(num, "9080612287");
		
		String number = num.getAttribute("value");
		Assert.assertEquals("check", "9080612287", number);
		Assert.assertTrue("check ", true);
	}
	@Ignore
	@Test
	public void tc3() {

	}
	@Ignore
	@Test
	public void tc4() {
		
	}
	
	@Before
	public void sdate() {
		Date d=new Date();
		System.out.println(d);
	}
	
	
	
}
