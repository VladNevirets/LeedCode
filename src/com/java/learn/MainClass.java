package com.java.learn;

import com.java.learn.LeetCode.BinarySearch.BinarySearch;
import com.java.learn.LeetCode.BinarySearch.SearchInsertPosition;
import com.java.learn.LeetCode.BinarySearch.SquareX;
import com.java.learn.LeetCode.String.ValidParentheses;

public class MainClass {
    public static void main(String[] args){
        BinarySearch bin = new BinarySearch();

        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(bin.binary(nums,0));
        
    }
}
