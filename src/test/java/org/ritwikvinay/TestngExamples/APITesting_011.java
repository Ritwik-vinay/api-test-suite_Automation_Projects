package org.ritwikvinay.TestngExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting_011 {
    @BeforeTest
    public void getToken() {
        System.out.println("Before Test Annotation");
    }

    @Test
    public void test_put() {
        System.out.println("Test Annotation");

    }

    @AfterTest
    public void requestId() {
        System.out.println("After Test Annotation");
    }
}

