package testng.priorty;

import org.testng.annotations.Test;

public class PriortyExample {
    @Test(priority =1)
    public void TestCaseA(){
        System.out.println("TestCaseA1");
    }
    @Test(priority =2)
    public void TestCaseX(){

        System.out.println("TestCaseX1");
        System.out.println("TestCaseXY");
    }
    @Test
    public void TestCaseF(){
        System.out.println("TestCaseF");
    }
    @Test
    public void TestCaseM(){
        System.out.println("TestCaseM");
    }
    @Test(priority = -5)
    public void TestCaseO(){
        System.out.println("TestCaseO");
    }
    @Test(priority =0)
    public void TestCaseG() {
        System.out.println("TestCaseG");
    }
    @Test(priority ='A')
    public void TestCaseZ() {
        System.out.println("TestCaseZ");
    }
}
//1) if we do not give the priority in TestCases so it will execute alphabaetically.
//2) if some testcases have priority and others don't so other tasecase will execute first then priority test case will run aplhabetically.