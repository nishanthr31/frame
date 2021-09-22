package pom;

import java.io.IOException;

public class executionjav extends BaseJava{
	public static void main(String[] args) throws IOException {
		launchUrl();
		pageurl("https://www.facebook.com/");
	Ques4 n=new Ques4();
	fill(n.getMail(),getvalue(0,0, 0));
	fill(n.getPass(), getvalue(0,0,1));
	}
}