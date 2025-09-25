package org.RestAPi.ex_05_TestNGExamples;

import org.testng.annotations.Test;

public class Lab16_Priority {
    @Test (priority = 4)
    public void methodOne(){
        System.out.println("One");
    }

    @Test (priority = 3)
    public void methodTwo(){
        System.out.println("2");
    }

    @Test (priority = 2)
    public void methodThre(){
        System.out.println("3");
    }

    @Test(priority = 1)
    public void methodfour(){
        System.out.println("4");
    }
}
