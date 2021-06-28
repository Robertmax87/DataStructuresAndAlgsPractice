package com.DataStructuresAndAlgsUdemy;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {123, 4, 134, 5, 425, 4, 456547, 246, 65, 7, 64, 76, 8, 579, 8, 9680, 9, 79, 9};
        /*The firstUnsorted starts at 1 because the sorted array is just the first element item[0]
        in the array. The firstUnsorted is then 1 and we are comparing it to the sorted array which starts
        at item[0]; a[i] compared to a[i-1] in the second loop
        grows partition by one*/
        for (int firstUnsorted = 1; firstUnsorted < a.length; firstUnsorted++) {
            /*We need to save the value of the unsorted element we are comparing to the sorted array because we
            will be shifting the element through the sorted array depending on where it belongs.*/
                int newElement = a[firstUnsorted];
                //Declare i because we need it after
                int i;
                // The for-loop compares decrements i down the sorted array, allowing it to be compared to the items

                for(i = firstUnsorted; i>0 && a[i-1]>newElement; i--){
                    /*this part of the code shifts the elements that are larger than a[i] up(to the right).
                     If the element is larger it will become equal to a[i] place. Then i decrements, i--. So then i is
                     compared to i minus one
                    again and we get to see if it is larger. Once i hits zero we drop out of the loop
                    -
                    -
                    -
                    -
                    as long as the element behind our element is larger than it we will be moving the shifting the
                    larger element to the right*/
                    a[i] = a[i - 1];
                }
                /* Otherwise we will exit the loop and */
                a[i] = newElement;
            }
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    }

