public class SelectionSort {
    public static void main(String[] args){
        /*instantiate array*/
        int[] a = {237,213,14,314,4,134,4,134,14,134,431,4,314};
        /*Still counting down just like the bubble sort, this array is counting down and the sorted partition is
        growing from right to left*/
        for(int lastUnsorted = a.length-1; lastUnsorted > 0; lastUnsorted--){
            /*Largest is instantiated as our first value in the array at index zero*/
            int largest = 0;
            /*The second for loop grows from index one because the largest is already instantiated at index 0 so we
            compare zero to one. if one is greater than zero then the largest is one, or two, and so on and so forth
             then we swap the "largest" with b. */
            for(int b = 1; b <= lastUnsorted; b++){
                if (a[b] > a[largest]) {
                    largest = b;


                }
                /* once we exit the loop meaning once we have officially found the largest in the array we then need to
                swap the largest which is really actually the largest with the last element in the array which would be
                the lastUnsorted. Then we do it again and even compare the object to the lastUnsorted*/
                swap(a,largest,lastUnsorted);
            }
        }
        for( int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        /* In a nutshell what this array does is find the largest, put it in the last place, find the second largest,
        compare it to the first largest in the last place then put it in the second to last place, find the third lar-
        est then compare to the second largest and put it in the third to last place in the array*/
    }
    public static void swap(int[] a, int x, int y){
        if(x == y){

        }
        int holder = a[x];
        a[x] = a[y];
        a[y] = holder;

    }

}
