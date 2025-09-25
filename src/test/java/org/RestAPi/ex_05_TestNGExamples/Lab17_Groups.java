package org.RestAPi.ex_05_TestNGExamples;

import org.testng.annotations.Test;

public class Lab17_Groups {
    // calling Regression will run 2 cases sanity and Regression
    // calling sanity will run only sanity
    //calling smoke will run only  smoke
    @Test(groups={"Sanity", "Regression"}, priority = 1)
    public void test_Sanity(){
        System.out.println("sanity");
    }

    @Test(groups={"Smoke" }, priority = 2)

    public void test_Smoke(){
        System.out.println("smoke");
    }

    @Test(groups={"Regression" }, priority = 3)
    public void test_Regression(){
        System.out.println("regression");
    }


}
