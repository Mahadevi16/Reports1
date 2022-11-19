package school;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Student {
	ExtentReports report;
	ExtentTest test;
    private void add() {
    	int a=90, b=4, c;
		c=a+b;
		report=new ExtentReports("C:\\Users\\ACER\\git\\repository30\\Automation\\Reports\\results.html", true);
		test=report.startTest("Demo");
		System.out.println(c);
		
	}
    private void add1() {
    	int a=90, b=4, c;
		c=a+b;
		test.log(LogStatus.INFO, "Result of sample");
		System.out.println(c);
		String title="Hello";
		test.log(LogStatus.PASS, title);
		
	}
    private void clos() {
		report.endTest(test);
		report.flush();

	}
	public static void main(String args[]) {
		
		Student test = new Student();
		test.add();
		test.add1();
		test.clos();
		
	}

}
