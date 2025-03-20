package org.ritwikvinay.TestngExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting_014_parameters {
    @Parameters("browser")
    @Test
    public void startBrowser(String value){

        if (value.equalsIgnoreCase("chrome")){
            System.out.println("Chrome is running");
        }
        if (value.equalsIgnoreCase("firefox")){
            System.out.println("Firefox is running");
        }
    }
}
