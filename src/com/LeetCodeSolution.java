package com;

public class LeetCodeSolution {
    public static void main(String[] args) {
        int[] a = {12, 3, 23, 4, 34, 42, 54, 5, 6, 4, 6, 6, 57, 46, 57, 86, 465, 8768};
        arrayDoubler(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
    public static int[] arrayDoubler(int[] array) {
        int index = 0;
        int[] doubler = new int[(array.length * 2) - 1];
        int mid = doubler.length / 2 - 1;
        while (index < array.length) {
            for(int i = 0; i<array.length; i++)
            doubler[index++] = array[i];


        }
        System.arraycopy(array, array[0], doubler,doubler[mid], array.length - 1);
        return doubler;
    }
}