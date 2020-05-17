package com.swetank.problemsolving.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Next Greater Element III - 556
 */
public class NextGreaterElement {
    public int nextGreaterElement(int n) {
        int swappingNumber = -1;
        ArrayList<Character> alldigits = new ArrayList<>();
        while (n > 0) {
            alldigits.add(0, (char) (n % 10));
            n = n / 10;
        }
        ArrayList<Character>  traversedDigits = new ArrayList<>();
        traversedDigits.add(alldigits.get(alldigits.size() - 1));
        for (int i = alldigits.size() - 1; i > 0; i--) {
            if (alldigits.get(i) > alldigits.get(i - 1)) {
                swappingNumber = alldigits.get(i - 1);
                break;
            } else{
                traversedDigits.add(alldigits.get(i - 1));
            }
        }
        if (swappingNumber == -1) return -1;
        int removingItemIndex = -1;

        for (int i = 0; i < traversedDigits.size(); i++) {
            if(traversedDigits.get(i) > swappingNumber){
                removingItemIndex = i;
                break;
            }
        }
        int swappedNumber = traversedDigits.get(removingItemIndex);
        traversedDigits.remove(removingItemIndex);
        traversedDigits.add((char) swappingNumber);

        Collections.sort(traversedDigits);

        // Combine digits to form result - digits Array, swappingNumber & traversedDigits
        long result = 0;
        for (int i = 0; i < alldigits.size() - traversedDigits.size() - 1; i++) {
            result = result * 10 + alldigits.get(i);
        }
        result = result * 10 + swappedNumber;
        for (int i = 0; i < traversedDigits.size(); i++) {
            result = result * 10 + traversedDigits.get(i);
        }
        return result > Integer.MAX_VALUE ? -1 : (int) result;
    }
    public int nextGreaterElement1(int n) {
        int swappingNumber = -1;
        ArrayList<Integer> alldigits = new ArrayList<>();
        while (n > 0) {
            alldigits.add(0, n % 10);
            n = n / 10;
        }
        ArrayList<Integer>  traversedDigits = new ArrayList<>();
        traversedDigits.add(alldigits.get(alldigits.size() - 1));
        for (int i = alldigits.size() - 1; i > 0; i--) {
            if (alldigits.get(i) > alldigits.get(i - 1)) {
                swappingNumber = alldigits.get(i - 1);
                break;
            } else{
                traversedDigits.add(alldigits.get(i - 1));
            }
        }
        if (swappingNumber == -1) return -1;
        int removingItemIndex = -1;

        for (int i = 0; i < traversedDigits.size(); i++) {
            if(traversedDigits.get(i) > swappingNumber){
                removingItemIndex = i;
                break;
            }
        }
        int swappedNumber = traversedDigits.get(removingItemIndex);
        traversedDigits.remove(removingItemIndex);
        traversedDigits.add(swappingNumber);

        Collections.sort(traversedDigits);

        // Combine digits to form result - digits Array, swappingNumber & traversedDigits
        long result = 0;
        for (int i = 0; i < alldigits.size() - traversedDigits.size() - 1; i++) {
            result = result * 10 + alldigits.get(i);
        }
        result = result * 10 + swappedNumber;
        for (int i = 0; i < traversedDigits.size(); i++) {
            result = result * 10 + traversedDigits.get(i);
        }
        return result > Integer.MAX_VALUE ? -1 : (int) result;
    }
}
