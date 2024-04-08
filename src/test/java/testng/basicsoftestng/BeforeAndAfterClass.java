package testng.basicsoftestng;

import org.testng.annotations.*;
public class BeforeAndAfterClass {

    @BeforeClass
    public void defineBybeforeClass(){
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void prerequisite(){
        System.out.println("Before Method");
    }
    @Test
    public void testCase1(){
        System.out.println("Test Case1");
    }
    @Test
    public void testCase2(){
        System.out.println("Test Case2");
    }
    @Test
    public void testCase3() {
        System.out.println("Test Case3");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After Method");
    }
    @AfterClass
    public void defineByAfterClass(){
        System.out.println("After Class");
    }
}


