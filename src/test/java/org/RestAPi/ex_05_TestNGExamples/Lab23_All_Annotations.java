package org.RestAPi.ex_05_TestNGExamples;

import org.testng.annotations.*;

public class Lab23_All_Annotations {
    @BeforeSuite
    public void before1(){
        System.out.println("BeforeSuite");
    }
    @BeforeTest
    public void before2(){
        System.out.println("BeforeTest");
    }
    @BeforeClass
    public void before3(){
        System.out.println("BeforeClass");
    }
    @BeforeMethod
    public void before4(){
        System.out.println("BeforeMethod");
    }
    @Test
    public void before5(){
        System.out.println("@Test");
    }
    @AfterMethod
    public void before6(){
        System.out.println("AfterMethod");
    }
    @AfterClass
    public void before7(){
        System.out.println("AfterClass");
    }

    @AfterTest
    public void before8(){
        System.out.println("AfterTest");
    }
    @AfterSuite
    public void before9(){
        System.out.println("AfterSuite");
    }
}
