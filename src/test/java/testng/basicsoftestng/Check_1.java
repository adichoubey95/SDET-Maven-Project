package testng.basicsoftestng;

import org.testng.annotations.*;

public class Check_1 {

    @BeforeTest
  public void beforeTestMethodForCheck(){
        System.out.println("execution of Before testmethod for check");
    }
    @BeforeClass
    public void beforeClassMethodForCheck(){
        System.out.println("Execution of before class method for Check_1");
    }
    @Test
    public void TestCaseP(){
        System.out.println("TestCaseP");
    }
    @Test
    public void TestCaseQ(){
        System.out.println("TestCaseQ");
    }

    @AfterClass
    public void afterClassMethodForCheck(){
        System.out.println("execution of AfterClass Method for Check_1");
    }
    @AfterTest
    public void afterTestMethodForAfterCheck(){
        System.out.println("execution of AfterTest Method For check");
    }
}
