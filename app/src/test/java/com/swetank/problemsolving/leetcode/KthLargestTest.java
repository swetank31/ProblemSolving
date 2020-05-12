package com.swetank.problemsolving.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KthLargestTest {
    KthLargest kthLargest = null;

    @Before
    public void setUp() throws Exception {
        kthLargest = new KthLargest();
    }

    @Test
    public void testAssertEquals() {
        int[] data1 = new int[]{3, 2, 1, 5, 6, 4};
        Assert.assertEquals(5, kthLargest.findKthLargest1(data1, 2));
        Assert.assertEquals(5, kthLargest.findKthLargest2(data1, 2));

        int[] data2 = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        Assert.assertEquals(4, kthLargest.findKthLargest1(data2, 4));
        Assert.assertEquals(4, kthLargest.findKthLargest2(data2, 4));
    }

    @Test
    public void findKthLargest() {
        int[] data2 = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        int num1 = kthLargest.findKthLargest1(data2, 4);
        System.out.println(num1);
        int num2 = kthLargest.findKthLargest2(data2, 4);
        System.out.println(num2);
    }
}