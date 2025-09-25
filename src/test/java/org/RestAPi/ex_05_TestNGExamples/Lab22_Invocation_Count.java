package org.RestAPi.ex_05_TestNGExamples;

import org.testng.annotations.Test;

public class Lab22_Invocation_Count {
    @Test(invocationCount = 4)// this will run 4 times
    public void Registration(){
        System.out.println("test1");
    }

    @Test(invocationCount = 3)//means  how many times you want to run the Testcase
    public void Login(){
        System.out.println("invocation count is used to how many times you want to run the Testcase");
    }

    @Test
    public void test03(){
        System.out.println("test3");
    }
}
