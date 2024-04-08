package testng.priorty;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
    @Test
    public void VerifyLogin(){
       Assert.assertTrue(false);
        System.out.println("login");
    }
    @Test(dependsOnMethods ={"VerifyLogin"},alwaysRun = true)
    public void VerifyFundTransfer(){

        System.out.println("fund transfer");
    }
    @Test
    public void VerifyCard(){

        System.out.println("card verification");
    }
    @Test
    public void VerifyDocument(){

        System.out.println("documentation");
    }
}
