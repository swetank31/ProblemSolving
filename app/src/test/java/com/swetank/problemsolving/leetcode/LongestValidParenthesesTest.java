package com.swetank.problemsolving.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestValidParenthesesTest {
    LongestValidParentheses longestValidParentheses;

    @Before
    public void setUp() {
        longestValidParentheses = new LongestValidParentheses();
    }

    @Test
    public void lvpAssertEquals(){
        Assert.assertEquals(2, longestValidParentheses.getLVPLength("(()"));
        Assert.assertEquals(4, longestValidParentheses.getLVPLength(")()())"));
    }

    @Test
    public void getLVPLength() {
        int validCount = longestValidParentheses.getLVPLength("(()");
        System.out.println("validCount = " + validCount);
    }
}