package org.RestAPi.ex_05_TestNGExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab15_BeforeTest {
    @BeforeTest
    public void token(){
        //1
        System.out.println("This is token generation");
    }
    @BeforeTest
    public void get_Booking_ID(){
        //2
        System.out.println("After token generation This is Creating Booking ID");
    }
@Test
    public void test_Put(){
        //3
        // token and Booking ID
        System.out.println("");
    }

    @AfterTest
    public void closeAll(){
        //4
        System.out.println("close");
    }
}
