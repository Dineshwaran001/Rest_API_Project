package org.RestAPi.ex_06_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab25_TestNg_Assertions {
    @Test
    public void hardAssertion(){
        System.out.println("start of the program");

        System.out.println("This is hard Assertion");
        System.out.println("This will check Expect and actual are same or not");
                          //here we can pass original value come from application
        Assert.assertEquals("Dinesh","dinesh");// program will stop here
        System.out.println("End of the program");// this will not execute
    }
}
