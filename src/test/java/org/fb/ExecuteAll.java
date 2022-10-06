package org.fb;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@Suite.SuiteClasses({FbjavaUnit.class,AssertJunit.class})
public class ExecuteAll {
	public static void main(String[] args) {
		Result runClasses = JUnitCore.runClasses(FbjavaUnit.class,AssertJunit.class);
		System.out.println("Failure Count "+runClasses.getFailureCount());
		System.out.println("Ignore Count "+ runClasses.getIgnoreCount());
		System.out.println("RunCount "+ runClasses.getRunCount());
		int passCount = runClasses.getRunCount() - runClasses.getFailureCount();
		System.out.println("PassCount "+ passCount);
		List<Failure> failures = runClasses.getFailures();
		for (Failure failure : failures) {
			System.out.println(failure);
		}
	}
	

}
