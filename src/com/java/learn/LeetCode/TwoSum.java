package com.java.learn.LeetCode;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]+nums[i+1]==target){
                return new int[]{i,i+1};

            }
        }
        return new int[]{};


    }
}
