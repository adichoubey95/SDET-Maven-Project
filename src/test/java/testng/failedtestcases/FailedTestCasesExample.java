package testng.failedtestcases;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class FailedTestCasesExample {
    @Test(retryAnalyzer = IRetryAnalyzerforFailedTestScripts.class)
    public void TestCases11(){
       Assert.assertTrue(false);
        System.out.println("TestCases11");
    }
    @Test(retryAnalyzer = IRetryAnalyzerforFailedTestScripts.class)
    public void TestCases22(){
        System.out.println("TestCases22");
    }
    @Test(retryAnalyzer = IRetryAnalyzerforFailedTestScripts.class)
    public void TestCases33(){
        System.out.println("TestCases33");
    }
    @Test(retryAnalyzer = IRetryAnalyzerforFailedTestScripts.class)
    public void TestCases44(){
        Assert.assertTrue(false);
        System.out.println("TestCases44");
    }
    @Test(retryAnalyzer = IRetryAnalyzerforFailedTestScripts.class)
    public void TestCases55(){
        System.out.println("TestCases55");
    }
}

