package org.ritwikvinay.TestngExamples;

import org.testng.annotations.Test;

public class APITesting_013_groups {
    @Test(groups = {"Sanity", "QA"})
    public void test_sanityrun(){
        System.out.println("sanity");
        System.out.println("qa");
    }
    @Test(groups = {"reg", "QA"})
    public void test_regrun(){
        System.out.println("reg");
        System.out.println("qa");
    }
    @Test(groups = {"smoke", "QA"})
    public void test_smke(){
        System.out.println("Smoke");
        System.out.println("reg");
    }

}
