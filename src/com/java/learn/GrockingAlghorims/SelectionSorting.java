package com.java.learn.GrockingAlghorims;

public class SelectionSorting {
    public int[] selectionSort(int[] arr){
        int leng = arr.length;
        int[]  sortedArray = arr.clone();
        for(int i=0;i<=leng-1;i++){
            int minIndex=0;
            for(int j=i+1;j<leng;j++){
                //4,5,6,7,8,1,2
                if(sortedArray[j]<sortedArray[i]){
                    minIndex = j;
                }
            }
            int temp = sortedArray[minIndex];
            sortedArray[minIndex] = sortedArray[i];
            sortedArray[i] = temp;


        }


        return sortedArray;
    }

}
