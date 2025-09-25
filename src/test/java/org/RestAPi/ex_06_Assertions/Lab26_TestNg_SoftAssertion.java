package org.RestAPi.ex_06_Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Lab26_TestNg_SoftAssertion {
    @Test
    public void soft_Assert(){
        SoftAssert soft = new SoftAssert();
        System.out.println("start of the program");

        soft.assertEquals("dinesh", "Dinesh");

        System.out.println("End of the program"); // program will end here even if assertion fail
        soft.assertAll(); // this is mandatory in the last line of the TC(we are asserting all)
    }
}
