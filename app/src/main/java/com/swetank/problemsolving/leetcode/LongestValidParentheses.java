package com.swetank.problemsolving.leetcode;

import java.util.Stack;

/**
 * Longest Valid Parentheses - 32
 */
public class LongestValidParentheses {
    public int getLVPLength(String s) {
        Stack<Integer> openParanStack = new Stack();
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                openParanStack.push(0);
            } else{
                if(!openParanStack.isEmpty()){
                    int sum = 0;
                    while(!openParanStack.isEmpty()){
                        int top = openParanStack.peek();
                        if(top == 0){
                            openParanStack.pop();
                            sum = sum + 2;
                            try{
                                while(openParanStack.peek() > 0){
                                    sum = sum + openParanStack.pop();
                                }
                            } catch(Exception e){

                            }

                            openParanStack.push(sum);
                            break;
                        } else if(top == -1){
                            openParanStack.push(sum);
                            openParanStack.push(-1);
                            break;
                        } else{
                            sum = sum + openParanStack.pop();
                        }
                    }
                    if(openParanStack.isEmpty()){
                        openParanStack.push(sum);
                        openParanStack.push(-1);
                    }
                    if(sum > max)
                        max = sum;
                } else{
                    openParanStack.push(-1);
                }
            }
        }
        // int current = 0;
        // while(!openParanStack.isEmpty()){
        //     int top = openParanStack.pop();
        //     if(top == 0){
        //         current = 0;
        //     } else if(top == -1){
        //         current = 0;
        //     } else{
        //         current += top;
        //         if(current > max)
        //             max = current;
        //     }
        // }
        return max;
    }
}