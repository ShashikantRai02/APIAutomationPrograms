package com.thetestingacademy.TESTNGAdvanceExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAllanotationsLab25 {
    @BeforeTest
    void demo4(){
        System.out.println("BeforeMethod");
    }

    @Test
    void demo5(){
        System.out.println("Test");
    }

    @AfterTest
    void demo6(){
        System.out.println("AfterMethod");
    }
}

