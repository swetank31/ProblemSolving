package com.swetank.problemsolving.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DistributeCoinsTest {
    DistributeCoins distributeCoins;

    @Before
    public void setUp() throws Exception {
        distributeCoins = new DistributeCoins();
    }

    @Test
    public void testCase1() {
        TreeNode treeNodeL = new TreeNode(0);
        TreeNode treeNodeR = new TreeNode(0);
        TreeNode treeNodeRoot = new TreeNode(3, treeNodeL, treeNodeR);
        Assert.assertEquals(2, distributeCoins.distributeCoins(treeNodeRoot));
    }

    @Test
    public void testCase2() {
        TreeNode treeNodeL = new TreeNode(3);
        TreeNode treeNodeR = new TreeNode(0);
        TreeNode treeNodeRoot = new TreeNode(0, treeNodeL, treeNodeR);
        Assert.assertEquals(3, distributeCoins.distributeCoins(treeNodeRoot));
    }

    @Test
    public void distributeCoins() {
        TreeNode treeNodeL = new TreeNode(0);
        TreeNode treeNodeR = new TreeNode(2);
        TreeNode treeNodeRoot = new TreeNode(1, treeNodeL, treeNodeR);
        int value = distributeCoins.distributeCoins(treeNodeRoot);
        System.out.println("value = " + value);
    }
}