package pom;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExecutableJava extends BaseJava {

	@BeforeClass
	public static void chrome() {
		launchUrl();
		pageurl("http://adactinhotelapp.com/HotelAppBuild2/");
	}
	// AdactinLoginPage h=new AdactinLoginPage();
	// fill(h.getUsername(), "nishanth908061");
	// fill(h.getPassword(), "9080612287");
	// click(h.getLogin());
	//
	// AdactinFirstPage k=new AdactinFirstPage();
	// fill(k.getLocation(), "London");
	// fill(k.getHotel(), "Hotel Creek");
	// fill(k.getRoomtype(), "Standard");
	// fill(k.getRooms(), "5");
	// fill(k.getIndate(), "21/09/2021");
	// fill(k.getOutdate(), "22/09/2021");
	// fill(k.getAdult(), "3");
	// fill(k.getChild(), "1");
	// click(k.getSearch());
	//
	// AdactinSecondPage i=new AdactinSecondPage();
	// click(i.getClick());
	// click(i.getSearch());
	//
	// AdactinThirdPage t=new AdactinThirdPage();
	// fill(t.getFname(), "nishanth");
	// fill(t.getLname(), "selva");
	// fill(t.getAddress(), "nishanth,south street,gunavasal...");
	// fill(t.getCardno(), "5842698124587965");
	// fill(t.getCardtype(), "VISA");
	// fill(t.getCmonth(), "March");
	// fill(t.getCyear(), "2011");
	// fill(t.getCcvv(), "5432");
	// click(t.getSearch());
	// alert();
	// click(t.getSearch());
	//
	// AdactinLastPage r=new AdactinLastPage();
	// getattribute(r.getOrderno());

	// AdactinLoginPage h=new AdactinLoginPage();
	// fill(h.getUsername(), "nishanth908061");
	// fill(h.getPassword(), "9080612287");
	// click(h.getLogin());

	@Test
	public void tc2() throws IOException {
		AdactinFirstPage k = new AdactinFirstPage();
		fill(k.getLocation(), getvalue(1, 7, 0));
		fill(k.getHotel(), getvalue(1, 7, 1));
		fill(k.getRoomtype(), getvalue(1, 7, 2));
		fill(k.getRooms(), getvalue(1, 7, 3));
		fill(k.getIndate(), getvalue(1, 7, 4));
		fill(k.getOutdate(), getvalue(1, 7, 5));
		fill(k.getAdult(), getvalue(1, 7, 6));
		fill(k.getChild(), getvalue(1, 7, 7));
		click(k.getSearch());
	}

	@Test
	public void tc3() {
		AdactinSecondPage i = new AdactinSecondPage();
		click(i.getClick());
		click(i.getSearch());
	}

	@Test
	public void tc4() throws IOException {
		AdactinThirdPage t = new AdactinThirdPage();
		fill(t.getFname(), getvalue(1, 8, 0));
		fill(t.getLname(), getvalue(1, 8, 1));
		fill(t.getAddress(), getvalue(1, 8, 2));
		fill(t.getCardno(), getvalue(1, 8, 3));
		fill(t.getCardtype(), getvalue(1, 8, 4));
		fill(t.getCmonth(), getvalue(1, 8, 5));
		fill(t.getCyear(), getvalue(1, 8, 6));
		fill(t.getCcvv(), getvalue(1, 8, 7));
		click(t.getSearch());
		alert();
		click(t.getSearch());
	}

	@Test
	public void tc5() throws IOException {
		AdactinLastPage r = new AdactinLastPage();
		getattribute(r.getOrderno(), 1, 10, 0);
	}

	@Test
	public void tc1() throws IOException {
		AdactinLoginPage h = new AdactinLoginPage();
		fill(h.getUsername(), getvalue(0, 0, 0));
		fill(h.getPassword(), getvalue(0, 0, 1));
		click(h.getLogin());
	}

	
	@Before
	public void startdate() {
		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void Enddate() {
		Date d = new Date();
		System.out.println(d);
	}
	@AfterClass
	public static void exit() {
		exit();
	}

}
