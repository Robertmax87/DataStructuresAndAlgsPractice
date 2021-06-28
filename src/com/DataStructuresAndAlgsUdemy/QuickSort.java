package com.DataStructuresAndAlgsUdemy;

public class QuickSort {
    public static void main(String[] args ){
        int[] a = {2394,234235,5,24,6,456,35,7,567,46875,8,579,579,5,34};

    }
    public static void quickSort(int[] input, int start, int end){
//end will be one greater than arrayIndex
       //if array has value of one then return and recurz;
        if ( end - start < 2){
            return;
        }
        //the place where the pivot will go after the elements have been sorted in front and behind it.
        int pivotIndex = partition(input, start, end);
        //Quicksorting the left and the right arrays on the each side of the pivot's new position.
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }
   //using the first element as the pivot... the integer this returns is the index in the first method.
    public static int partition(int[] input, int start, int end){
        //The pivot is the element we are partitioning around.
        int pivot = input[start];
        int i = start;
        int j = end;
        while(i < j){
           //EMPTY LOOP^^

            //While i is less than j and decrementing j is greater than the pivot.
            /* --J AND ++I prefix decrement and prefix increment. This means that when we do statement we then decrement
            or increment the variable THEN use the variable. so if the variable is at 1 we go to 2 then use the input[2]
             */

            while(i < j && input[--j] >= pivot);
                //if i hasn't crossed j yet
                if (i < j){
                    input[i] = input[j];
                }
                while (i < j && input[++i] <= pivot);
                if (i < j){
                    input[j] = input[i];
                }
            }
        input[j] = pivot;
        // we want to return the place where we insert the pivot so we put j there.
        return j;
    }
}
