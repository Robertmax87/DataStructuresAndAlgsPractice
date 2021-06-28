package com.DataStructuresAndAlgsUdemy;

public class ReverseMergeSort{
    //Sort the array in descending order...
    /*first I start by attempting to implement merge sort by memory.. then I will attempt to fill the array in descending
    order tomorrow after I reattempt implementing the algorithm from memory.
     */
    public static void main(String[] args){
    int[] a = {1,2,3,4,51,2,3,4,5};
    }
    public static void mergeSort(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }
       int mid = (start - end)/ 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);


    }
    public static void merge(int[] input, int start, int mid, int end){
        if(input[mid] < input[mid] + 1){
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] tempArray = new int[end - start];
        while(i < mid && j < end){
            //while i is less than j assign i++ and or assign j++; <= makes the algorithm equal
            tempArray[tempIndex++] = input[i] <= input[j] ? input[i++] :input[j++];

        }
        System.arraycopy(input, i, input, tempIndex + start,mid - i);
        System.arraycopy(tempArray,0,input,start,tempIndex);
    }
}

