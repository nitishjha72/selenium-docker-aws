package com.nitish.util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryUtil implements IRetryAnalyzer {

    private int count = 1;
    private static final int MAX_RETRY_COUNT = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(count<MAX_RETRY_COUNT){
            count++;
            return true;
        }
        return false;
    }
}
