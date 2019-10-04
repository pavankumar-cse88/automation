package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import static utils.Constants.compareMovieDetailsReportPath;

public class TestBase {

    public ExtentTest test;
    public static ExtentReports report;

    @BeforeTest
    public void start() {
        report = new ExtentReports(compareMovieDetailsReportPath);
    }

    @AfterTest
    public static void endTest() {
        report.flush();
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(LogStatus.FAIL, "Test failed " + result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
        } else {
            test.log(LogStatus.PASS, "Test passed");
        }

        report.endTest(test);
    }

}
