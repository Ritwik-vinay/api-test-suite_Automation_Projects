package org.ritwikvinay.ex09_TestngExamples;

import org.testng.annotations.Test;

public class APITesting_012_TestngPriority {
    @Test(priority = 1)
    public void priority1(){
        System.out.println("set Pr-1");
    }
    @Test(priority = 2)
    public void priority2(){
        System.out.println("set Pr-2");
    }
    @Test(priority = 4)
    public void priority4(){
        System.out.println("set Pr-4");
    }
    @Test(priority = 3)
    public void priority3(){
        System.out.println("set Pr-3");
    }
}
