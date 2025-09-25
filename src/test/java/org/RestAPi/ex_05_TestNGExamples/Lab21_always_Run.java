package org.RestAPi.ex_05_TestNGExamples;

import org.testng.annotations.Test;

public class Lab21_always_Run {
    @Test
    public void Registration(){
        System.out.println("test1");
    }

    @Test(alwaysRun = true)// means it will run
    public void Login(){
        System.out.println("After the Registration it is compulsory to check the login is work so we can use here");
    }

    @Test
    public void test03(){
        System.out.println("test3");
    }
}
