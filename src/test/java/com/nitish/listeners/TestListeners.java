package com.nitish.listeners;

import com.nitish.util.Constants;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListeners implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        TakesScreenshot driver = (TakesScreenshot)result.getTestContext().getAttribute(Constants.DRIVER);
        String screenshot = driver.getScreenshotAs(OutputType.BASE64);
        String htmlImageFormat = "<img width=700px src='data:image/png;base64,%s' />";
        String htmlImage = String.format(htmlImageFormat, screenshot);
        Reporter.log(htmlImage);
    }

    public void onTestSuccess(ITestResult result) {

    }

    public void onTestSkipped(ITestResult result) {
    }

}
