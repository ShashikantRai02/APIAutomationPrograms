package com.thetestingacademy.TESTValidations;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngAssertionsLab27 {
    @Test
    public void test_Hard(){
        System.out.println("start");
        Assert.assertEquals("pramod","Pramod");
        System.out.println("end");
    }
    @Test
    public void test_Soft(){
        System.out.println("start");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("pramod","Ppramod");
        System.out.println("end");
        softAssert.assertAll();
    }

}
