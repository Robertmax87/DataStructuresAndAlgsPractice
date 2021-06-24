package com;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {4939,234,25,4,65,6,3563,6,356,356};
       /*First array goes from the top down. the last item in the array is length-1 because the last item in the array
       will be counting down from.  then the lower bound would be item 0;*/
        for (int b = a.length-1; b > 0; b--) {
            /* The second array here is basically going the opposite way so we will be counting up. All of this except
            that the second array is bounded to the first array's upper bound so that they count down together; */
            for (int c = 0; c < b; c++) {
                /*we use an if expression right here to make sure that we are looping up and doing our "ifs" on  the
                second for loop, we use our swap method if the "if" is true;*/
                if(a[c] > a[c+1]){
                    swap(a, c,c+1);
                }
            }
        }
    for(int d = 0; d < a.length; d++){
        System.out.println(a[d]);
    }
    }
    /*Swap method: Here we will make our swap method which needs to be called by our "if"
    Swap will take in our array and the two integers on the array will be instantiated by integer variables in the
    swap method  */
    public static void swap( int[] a, int x, int y){
        /* if the array items are equal then we will just be returning*/
        if (x==y){
            return;

        }/*now we will be switching around items in the array setting the one behind in front and vice versa*/
        int holder = a[x];
        a[x] = a[y];
        a[y] = holder;

    }

}
