package org.ritwikvinay.ex08_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_017_HardAssertion {
    @Test
    public void hardAssetExample(){
        System.out.println("Step 1");
        Assert.assertEquals(2 + 2, 4, "Values are not equal!");  // Passes
        System.out.println("Step 2");
        Assert.assertTrue(3 > 5, "3 is not greater than 5!");// Fails & stops execution
        System.out.println("Hard Assertion");
    }
}
