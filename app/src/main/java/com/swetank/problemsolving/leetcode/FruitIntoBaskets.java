package com.swetank.problemsolving.leetcode;

/**
 * Fruit Into Baskets - 904
 */
public class FruitIntoBaskets {
    public int getTotalFruits(int[] tree) {
        int len = tree.length;
        if (len == 0) return 0;
        if (len == 1) return 1;
        int previousStratingIndex = 0;
        int currentStratingIndex = 0;
        int max = 1, count = 1;
        for (int i = 1; i < len; i++) {
            if (tree[i] == tree[currentStratingIndex]) {
                count++;
            } else if (tree[i] == tree[previousStratingIndex]) {
                count++;
                previousStratingIndex = currentStratingIndex;
                currentStratingIndex = i;
            } else {
                previousStratingIndex = currentStratingIndex;
                currentStratingIndex = i;
                count = i - previousStratingIndex + 1;
            }
            if (count > max) max = count;
        }
        return max;
    }
}