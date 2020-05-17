package com.swetank.problemsolving.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NextGreaterElementTest {
    NextGreaterElement SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new NextGreaterElement();
    }

    @Test
    public void test1() {
        int result = SUT.nextGreaterElement(12);
        Assert.assertEquals(21, result);
    }

    @Test
    public void test2() {
        int result = SUT.nextGreaterElement(21);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void test3() {
        int result = SUT.nextGreaterElement(152222);
        Assert.assertEquals(212225, result);
    }

    @Test
    public void test4() {
        int result = SUT.nextGreaterElement(218765);
        Assert.assertEquals(251678, result);
    }

    @Test
    public void test5() {
        int result = SUT.nextGreaterElement(1234);
        Assert.assertEquals(1243, result);
    }

    @Test
    public void test6() {
        int result = SUT.nextGreaterElement(4321);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void test7() {
        int result = SUT.nextGreaterElement(534976);
        Assert.assertEquals(536479, result);
    }

    @Test
    public void test8() {
        int result = SUT.nextGreaterElement(5);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void test9() {
        int result = SUT.nextGreaterElement1(1999999999);
        Assert.assertEquals(-1, result);
    }
}