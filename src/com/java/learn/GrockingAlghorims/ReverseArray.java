package com.java.learn.GrockingAlghorims;

import java.util.Arrays;

public class ReverseArray {
    public void reverseArray(int[] arr){
        for(int i=0;i<=arr.length/2-1;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
