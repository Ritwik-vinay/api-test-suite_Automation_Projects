package org.ritwikvinay.TestngExamples;

import org.testng.annotations.*;

public class APITesting_016_AllAnnotations {
    @BeforeSuite
    void demo1(){
        System.out.println("Before Suite");
    }
    @BeforeTest
    void demo2(){
        System.out.println("BeforeTest");
    }
    @BeforeClass
    void demo3(){
        System.out.println("BeforeClass");
    }
    @BeforeMethod
    void demo4(){
        System.out.println("BeforeMethod");
    }
    @Test
    void demoTest(){
        System.out.println("Only Test!!");
    }
    @AfterSuite
    void demo5(){
        System.out.println("After Suite");
    }
    @AfterTest
    void demo6(){
        System.out.println("After Test");
    }
    @AfterClass
    void demo7(){
        System.out.println("After class");
    }
    @AfterMethod
    void demo8(){
        System.out.println("After Method");
    }

}
