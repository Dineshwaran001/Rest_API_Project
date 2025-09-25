package org.RestAPi.ex_05_TestNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lab19_Parameters_TestNG {
    @Parameters("browser")
    @Test
    public void demo(String browser){// rather than browser we can give value also
        System.out.println("this program will execute Via Parameter TestNG.xml");
        System.out.println("Parameter name given via xml Parameter and value given same area");

        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("start the chrome");
        }
        if(browser.equalsIgnoreCase("firefox")){
            System.out.println("start the firefox");
        }
    }
}
