package com.thetestingacademy.TESTNGAdvanceExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngGroupsLab17 {
//    @Test(groups = {"sanity","reg"})
    @Test(groups = {"sanity"})

    public void test_sanityRun() {
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    @Test(groups = {"reg"})
    public void test_regRun() {
        System.out.println("Reg");
        Assert.assertTrue(true);
    }

    @Test(groups = {"smoke"})
    public void test_smokeRun() {
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }

}

