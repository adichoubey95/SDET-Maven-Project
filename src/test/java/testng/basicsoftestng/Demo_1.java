package testng.basicsoftestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo_1 {

    @BeforeClass
    public void beforeClassMethodForDemo(){
        System.out.println("Execution of before class method for Demo_1");
    }
    @Test
    public void TestCaseX(){
        System.out.println("TestCaseX");
    }
    @Test
    public void TestCaseZ(){
        System.out.println("TestCaseZ");
    }
    @AfterClass
        public void afterClassMethodForDemo1(){
            System.out.println("execution of AfterClass Method for Demo_1");
        }



}
