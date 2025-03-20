package org.ritwikvinay.TestngExamples;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting_018_SoftAssertion {
    @Test
    public void softAssertExample(){
        SoftAssert softassert = new SoftAssert();
        System.out.println("Step 1");
        softassert.assertEquals(2 + 2, 5, "Expected 5 but got 4!");  // Fails but continues execution
        System.out.println("Step 2");
        softassert.assertTrue(3 > 5, "3 is not greater than 5!");  // Fails but continues execution
        System.out.println("Step 3");

        softassert.assertAll();  // Marks test as failed if any assertion failed

    }
}
