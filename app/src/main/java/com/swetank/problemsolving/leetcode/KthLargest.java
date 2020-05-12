package com.swetank.problemsolving.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 215. Kth Largest Element in an Array
 */
public class KthLargest {
    public int findKthLargest1(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue();
        for(int i = 0; i < nums.length;i++){
            heap.offer(nums[i]);
            if(heap.size() > k) heap.poll();
        }
        return heap.peek();
    }
}
