package com.swetank.problemsolving.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FruitIntoBasketsTest {
    private FruitIntoBaskets fruitIntoBaskets;

    @Before
    public void setUp() {
        fruitIntoBaskets = new FruitIntoBaskets();
    }

    @Test
    public void totalFruitAssertEquals() {
        Assert.assertEquals(3, fruitIntoBaskets.totalFruit(new int[]{1,2,1}));
        Assert.assertEquals(3, fruitIntoBaskets.totalFruit(new int[]{0,1,2,2}));
        Assert.assertEquals(4, fruitIntoBaskets.totalFruit(new int[]{1,2,3,2,2}));
        Assert.assertEquals(5, fruitIntoBaskets.totalFruit(new int[]{3,3,3,1,2,1,1,2,3,3,4}));
    }

    @Test
    public void totalFruit() {
        long total = fruitIntoBaskets.totalFruit(new int[]{1,2,1});
        System.out.println("Total = " + total);
    }
}