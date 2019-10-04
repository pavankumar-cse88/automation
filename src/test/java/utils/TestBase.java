package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

    public ExtentTest extentTest;
    public static ExtentReports extentReport;

    @BeforeTest
    public void start() {
        extentReport = new ExtentReports(Constants.report);
    }

    @AfterTest
    public static void endTest() {
        extentReport.flush();
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            extentTest.log(LogStatus.FAIL, "Test failed " + result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            extentTest.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
        } else {
            extentTest.log(LogStatus.PASS, "Test passed");
        }

        extentReport.endTest(extentTest);
    }

}
