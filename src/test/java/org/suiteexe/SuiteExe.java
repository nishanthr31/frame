package org.suiteexe;

import java.util.List;

import org.cts.Question1;
import org.cts.Question2;
import org.cts.Question3;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({Question1.class,Question2.class,Question3.class})
public class SuiteExe {
	@Test
	public void tc1() {
		Result r = JUnitCore.runClasses(Question1.class, Question2.class, Question3.class);

		System.out.println(r.getRunTime());
		System.out.println(r.getRunCount());
		System.out.println(r.getFailureCount());
		System.out.println(r.getIgnoreCount());

		List<Failure> l = r.getFailures();
		for (Failure failure : l) {
			System.out.println(failure);
		}
	}
}
