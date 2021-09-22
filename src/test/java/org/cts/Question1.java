package org.cts;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;

import pom.BaseJava;
import pom.Ques1;

public class Question1 extends BaseJava {

	@BeforeClass
	public static void chrome() {
		launchUrl();
		pageurl("https://www.facebook.com/");
	}

	@AfterClass
	public static void quit() {

	}

	@Before
	public void startdate() {
		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void enddate() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void tc1() throws IOException {
		Ques1 q = new Ques1();
		fill(q.getMail(), getvalue(0, 0, 0));
		String mail = q.getMail().getAttribute("value");
		Assert.assertEquals("check mail", "nishanth", mail);
	}

	@Test
	public void tc2() throws IOException {
		Ques1 q = new Ques1();
		fill(q.getPass(), getvalue(0, 0, 1));
		String pass = q.getPass().getAttribute("value");
		Assert.assertEquals("check the password", "password", pass);
		Dimension size = q.getMail().getSize();
		System.out.println(size);
	}

	@Test
	public void tc3() {
		Ques1 q = new Ques1();
		click(q.getLogin());
	}
}
