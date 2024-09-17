package com.java.learn.LeetCode;

public class MaximumMatrixSum {
    public long maxMatrixSum(int[][] matrix){
        long sum = 0;
        long min = Long.MAX_VALUE;
        int negative = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                sum+=Math.abs(matrix[i][j]);
                min=Math.min(min,matrix[i][j]);
                if(matrix[i][j]<0){
                    negative++;

                }
            }
        }
        if(negative%2==0){
            return sum;
        }else{
            return sum-2*min;
        }



    }
}
