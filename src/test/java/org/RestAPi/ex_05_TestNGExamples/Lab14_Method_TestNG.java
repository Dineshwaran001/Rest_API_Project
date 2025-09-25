package org.RestAPi.ex_05_TestNGExamples;

import org.testng.annotations.Test;

public class Lab14_Method_TestNG {
    public void noParameter(){
        System.out.println("This is not runnable TC");
    }
    @Test
    public void TestNG_Testcase(){
        System.out.println("This is runnable TC--> with @Test");
    }
}
