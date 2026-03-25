package com.thetestingacademy.TESTNGAdvanceExamples;

import org.testng.annotations.Test;

public class TestngInvocationCountLab23 {
    @Test(invocationCount = 2)
    public void test01(){
        System.out.println("Hi");
    }

    @Test(invocationCount = 4)
    public void test02(){
        System.out.println("Bye");
    }
}

