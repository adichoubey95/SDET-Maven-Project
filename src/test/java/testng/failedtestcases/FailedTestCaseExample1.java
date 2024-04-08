package testng.failedtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCaseExample1 {
    @Test
    public void TestCases11(){
        Assert.assertTrue(false);
        System.out.println("TestCases11");
    }
    @Test
    public void TestCases22(){
        System.out.println("TestCases22");
    }
    @Test
    public void TestCases33(){
        System.out.println("TestCases33");
    }
    @Test
    public void TestCases44(){
        Assert.assertTrue(false);
        System.out.println("TestCases44");
    }
    @Test
    public void TestCases55(){
        System.out.println("TestCases55");
    }
}


