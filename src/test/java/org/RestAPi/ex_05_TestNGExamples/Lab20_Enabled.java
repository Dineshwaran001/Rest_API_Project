package org.RestAPi.ex_05_TestNGExamples;

import org.testng.annotations.Test;

public class Lab20_Enabled {
    @Test
    public void test01(){
        System.out.println("test1");
    }

    @Test(enabled = false)// means this case will not run
    public void test02(){
        System.out.println("test2");
    }

    @Test
    public void test03(){
        System.out.println("test3");
    }
}
