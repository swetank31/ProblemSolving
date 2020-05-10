package com.swetank.problemsolving.practice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciMemoizedTest {
    private FibonacciMemoized fibMemo;

    @Before
    public void setUp() {
        fibMemo = new FibonacciMemoized();
    }

    @Test
    public void fibAssertEquals() {
        Assert.assertEquals(0, fibMemo.fib(0));
        Assert.assertEquals(1, fibMemo.fib(1));
        Assert.assertEquals(1, fibMemo.fib(2));
        Assert.assertEquals(2, fibMemo.fib(3));
        Assert.assertEquals(3, fibMemo.fib(4));
        Assert.assertEquals(5, fibMemo.fib(5));
        Assert.assertEquals(8, fibMemo.fib(6));
        Assert.assertEquals(13, fibMemo.fib(7));
        Assert.assertEquals(21, fibMemo.fib(8));
        Assert.assertEquals(34, fibMemo.fib(9));
        Assert.assertEquals(55, fibMemo.fib(10));
    }

    @Test
    public void fib() {
        long nthFib = fibMemo.fib(10);
        System.out.println("Nth Fib = " + nthFib);
    }

    @Test
    public void recordTimeMemoized() {
        long startTime = System.currentTimeMillis();
        fibMemo.fib(1999);
        long endTime = System.currentTimeMillis();
        long elapsedTime = (endTime - startTime) / 1000;
        System.out.println("elapsedTime = " + elapsedTime);
    }
}