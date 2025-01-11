package utils;

import base.ProjectSpecificationMethod;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listener extends ProjectSpecificationMethod implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {

        test.log(Status.PASS,"Test passed");

    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.fail(result.getThrowable());
        String filepath = null;
        try {
            filepath = screenshot(result.getMethod().getMethodName());
        } catch (IOException e) {
            e.printStackTrace();
        }

        test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());

    }


    @Override
    public void onTestSkipped(ITestResult result) {

        System.out.println("Test skipped");
    }



    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {
    }

    @Override
    public void onTestStart(ITestResult result) {

    }



}
