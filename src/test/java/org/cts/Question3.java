package org.cts;

import java.io.IOException;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pom.BaseJava;
import pom.Ques2;

public class Question3 extends BaseJava {

	@BeforeClass
	public static void browser() {
		launchUrl();
		pageurl("https://www.toolsqa.com/selenium-training#enroll-form");
		String title = driver.getTitle();
		Assert.assertEquals("check title", title, title);
	}

	@Before
	public void startdate() {
		Date d = new Date();
		System.out.println(d);
	}

	@Before
	public void sdate() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void tc1() throws IOException {
		Ques2 j = new Ques2();
		fill(j.getName(), getvalue(1, 0, 0));
		String name = j.getName().getAttribute("value");
		Assert.assertEquals("check name", "nishanth", name);

	}

	@Test
	public void tc2() throws IOException {
		Ques2 j = new Ques2();
		fill(j.getMail(), getvalue(1, 1, 0));
		String mail = j.getMail().getAttribute("value");
		Assert.assertTrue("check mail", mail.contains("nishanth"));
	}

	@Test
	public void tc3() throws IOException {
		Ques2 j = new Ques2();
		fill(j.getMob(), getvalue(1, 2, 0));
		String mob = j.getMob().getAttribute("value");
		Assert.assertEquals("check mob", "9080612287", mob);

	}

	@Test
	public void tc4() throws IOException {
		Ques2 j = new Ques2();
		fill(j.getMsg(), getvalue(1, 3, 0));
		String msg = j.getMsg().getAttribute("value");
		Assert.assertEquals("check msg", "what are u doing now", msg);
	}

	@Test
	public void tc5() throws IOException {
		Ques2 j = new Ques2();
		fill(j.getCity(), getvalue(1, 4, 0)); 
	}

	@Test
	public void tc6() throws IOException {
		Ques2 j = new Ques2();
		fill(j.getCode(), getvalue(1, 6, 0));
	}

}
