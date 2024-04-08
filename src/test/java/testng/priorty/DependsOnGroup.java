package testng.priorty;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {
    @Test(groups = {"smoke"})
    public void VerifyLogin() {
        Assert.assertTrue(false);
        System.out.println("login");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void VerifyFundTransfer() {
        System.out.println("fund transfer");
    }

    @Test(enabled = false) //for diable the testcase,run option will remove
    public void VerifyCard() {
        System.out.println("card verification");
    }

    @Test
    public void VerifyDocument() {
        System.out.println("documentation");
    }
}
