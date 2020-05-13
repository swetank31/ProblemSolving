package com.swetank.problemsolving.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KClosestPointsToOriginTest {
    KClosestPointsToOrigin kClosestPointsToOrigin;

    @Before
    public void setUp() throws Exception {
        kClosestPointsToOrigin = new KClosestPointsToOrigin();
    }

    @Test
    public void assertEqualsTest1() {
        int[][] input = {
                {1, 3}, {-2, 2},
        };
        int[][] output = {
                {-2, 2},
        };
        Assert.assertEquals(output, kClosestPointsToOrigin.kClosest(input, 1));
    }

    @Test
    public void assertEqualsTest2() {
        int[][] input = {
                {3,3},{5,-1},{-2,4},
        };
        int[][] output = {
                {3,3},{-2,4},
        };
        Assert.assertEquals(output, kClosestPointsToOrigin.kClosest(input, 2));
    }
}