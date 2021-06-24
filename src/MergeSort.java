public class MergeSort {
    public static void main(String[] args){
     int[] array = {12,45,5,24,66,43,6,56,5,3,54245,5245,6,6,57,7,356};
    }
    //The end variable would be the actual length of the items, not the index, so here 17, not 16.
    public static void mergesort(int[] array, int start, int end){
       /*This is our base case. This means that once we reach this our recursive calls will start popping off the stack
       and bubbling up and whatnot. End and start are the ends and starts of the mini arrays we are doing. This means
       that if the end and start are less than two meaning the array is an array of 1 you will return because the array
       doesn't need to be sorted. */
        if ((end - start)<2){
            return;
        }
        //this is the midpoint of the array. The mid in the left array gets changed to end and back to mid again here.
        //Since the method call is to end and then here the variable is instantiated as mid.
        int mid = (start + end) / 2;
        /*calls itself again but this is the call for only the first array. For this call we are basically calling the
        first half of the array or the first array that will be sorted. We will then be splitting these arrays up
         since mid is included in both the next calls we can see the practical use of continuing to make mid smaller
         and smaller*/
        mergesort(array, start, mid);
        /* As we can see here we instantiated a mid point and then we used it for the end of the first array that we are
        sorting. for this one we used the mid point for the first part of our array and then then the end which was
        plugged in at the beginning of the method call as the end of our second half array. */
        mergesort(array, mid, end);
        //merge method needs the array, and the start mid and end. Calls after the arrays are sorted to merge them
        merge(array, start, mid, end);


    }
    public static void merge(int[] array, int start, int mid, int end){
        /*The array will be sorted if the last element in the right partition is less than the last element in the left
        partition because both arrays are already sorted.
         */
       if(array[mid-1] <= array[mid]){
           return;

        }
       int i = start;
       int j = mid;
       int tempArrayIndex = 0;
       int[] temp = new int[end-start];
       while(i< mid && j<end){
           /*traverse the temporary array adding elements from start that are less than the midpoint elements;
           tempArrayIndex is started at index zero so it starts at the beginning of the array. We are comparing the
           left and the right arrays and writing the smaller of the two in at the tempArrayIndex...*/
           temp[tempArrayIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
           /*Compares if i is less than or equal to j, if so i++ is equal to tempArrayIndex. Otherwise it is equal to
           j++. The question mark means otherwise or else and the colon adds to that to add j to the array otherwise.
           There will be extra numbers left over.
            */

       }
       //copy the leftover i elements. We need to do this because these numbers are probably bigger than the
        // leftover j numbers from mid - i are the largest numbers and we are copying them from the end backwards.
      /*Copying the leftover numbers into the original array at start + tempArrayIndex, then copying the array we made in the
       tempArrayIndex into the original array up until start.  */
       System.arraycopy(array, i, array, start + tempArrayIndex, mid-i);
       System.arraycopy(temp, 0, array, start, tempArrayIndex);
       //Fill the rest of the array

    }

}
/*SUMMARY: Once the left side gets partitioned into smaller arrays and the right side gets partitioned into smaller
arrays we call merge on the start, middle, and end of the array. The right and left element must be called until they
are one element arrays.
 */
