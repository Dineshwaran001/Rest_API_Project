package org.RestAPi.ex_05_TestNGExamples;

import org.testng.annotations.Test;

public class Lab18_dependsOnMethods {
    @Test
    public void dataBaseStarting(){
        System.out.println("DataBase Launched for Testing");
    }

    @Test(dependsOnMethods = "dataBaseStarting")
    public void application1(){
        System.out.println("Application 1 data can be fetched via database");
    }

    @Test(dependsOnMethods = "dataBaseStarting")
    public void application2(){
        System.out.println("Application 2 data can be fetched via database");
    }
}
