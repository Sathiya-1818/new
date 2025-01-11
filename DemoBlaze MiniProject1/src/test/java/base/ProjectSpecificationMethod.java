package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.*;
import utils.UtilityClass;

public class ProjectSpecificationMethod extends UtilityClass {


    @BeforeSuite
    public void reportInitialization(){

        String path ="E:\\DemoBlaze MiniProject1\\test-output\\old" ;
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("DemoBlaze Repo");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter();
    }
    @BeforeClass
    public void testDetails() {
        test = extent.createTest(testName,testDescription);
        test.assignCategory(testCategory);
        test.assignAuthor(testAuthor);

    }

    @Parameters({"browser","url"})
    @BeforeMethod
    public void launchAndLoad(String browser, String url) {

        browserLaunch(browser, url);

    }
    @AfterMethod
    public void browserclose(){

        browserclose();

    }
    @AfterSuite
    public void reportClose(String loginTestData) {

        extent.flush();

    }
}
