package com.java.learn;

import com.java.learn.GrockingAlghorims.ReverseArray;
import com.java.learn.LeetCode.BinarySearch.BinarySearch;
import com.java.learn.LeetCode.BinarySearch.SearchInsertPosition;
import com.java.learn.LeetCode.BinarySearch.SquareX;



public class MainClass {

    public static void main(String[] args){

        BinarySearch bin = new BinarySearch();
        SquareX sq = new SquareX();


        int[] nums = {4,5,6,7,0,1,2};
<<<<<<< HEAD

        System.out.println(sq.mySqrt(5));
        System.out.println(bin.binary(nums,0));
=======
        //System.out.println(sq.mySqrt(5));
        //System.out.println(bin.binary(nums,0));
        ReverseArray reverse = new ReverseArray();
        reverse.reverseArray(nums);
>>>>>>> cd008213c29b48f57b9a0eaa058e824d5e4f703c

    }


}
