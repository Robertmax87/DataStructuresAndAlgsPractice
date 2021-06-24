public class ShellSort {
    public static void main(String[] args){
       int[] a = {12,1324,4,5,6,57,3245,7,87,9,59,68,245,65,3,6,87,7,79,68060,68};

       /* For the first for-loop we need to instantiate the gap. We need make the gap the length divided by 2;
      we need to make the gap greater than zero because we must have a greater gap than zero when we are comparing ele-
      ments. The final gap should be one and that gap will be insertion sort. We are dividing the gap by two to reduce
      the gap and we will reduce the gap to insertion sort/bubble sort...
        */
       for(int gap = a.length/2; gap>0; gap/=2){
          //These are the normal values iterating up that we will be comparing gap to. 1 to 3, 2 to 4 and so on
           for(int i = gap; i<a.length; i++){
                //save the comparison element
               int newElement = a[i];
                // instantiate an variable for i
                int j = i;
                /*compare j which starts at gap to the j minus gap. 3 to 3-3 equals zero... i is counting up while gap
                is being divided by after the loop is done. So the first loop makes the gap smaller while the second
                loop counts up. Not WHILE, but after. While this is greater than the newElement we will swap these
                elements then the first loop at the top will get smaller meaning the gap gets smaller.
                 */
                while(j>= gap && a[j-gap]>newElement){
                    a[j] = a[j-gap];
                    /*compares even farther behind but since it hits the array we have to go back to the top and do
                     another iteration and make gap smaller.*/
                    j-=gap;


                }
                //drop out if it isn't true
               a[j] = newElement;

            }

        }
       int i;
       for (i=0;i<a.length;i++){
           System.out.println(a[i]);
        }

    }








    public static void swap(int[] a, int x, int y){
        if (y == x){
            return;
        }
        int holder = a[x];
        a[x] = a[y];
        a[y] = holder;
    }

}
