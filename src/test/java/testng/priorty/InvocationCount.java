package testng.priorty;

import org.testng.annotations.Test;

public class InvocationCount {

    @Test(invocationCount = 10)
    public void TestCase1(){
        System.out.println("TestCase1");
    }
    @Test(invocationCount = 2, invocationTimeOut = 1)
    public void TestCase2(){
        System.out.println("TestCase2");
    }
    @Test(invocationCount = 1000,invocationTimeOut = 1)
    public void TestCase3(){
        System.out.println("TestCase3");
    }
}


