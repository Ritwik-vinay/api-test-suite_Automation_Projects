package org.ritwikvinay.ex09_TestngExamples;

import org.testng.annotations.Test;

public class APITesting_015_enabled {
    @Test
    public void method1(){
        System.out.println("I am Enabled");
    }
    @Test(enabled = false)
    public void method2(){
        System.out.println("I am Disabled");
    }
    @Test
    public void method3(){
        System.out.println("I am enabled");

    }}
