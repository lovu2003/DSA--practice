public class Bubble {
    public static void main(String args[]){
        int nums[] = { 99,-13,1000123,82,-987,5675,436,-10,22,33};
        int a,b,t;
        int size;
        size = 10; //number of elements

        //display original array
        System.out.println("Organiged array is : ");
        for( int i = 0; i<size ; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        //this is the bubble sort
        for(  a = 1; a<size ; a++)
            for (b = size-1; b >= a; b--){
                if(nums[b-1] > nums[b]) { //if out of order

                    //exchange elements
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        //display sorted array
        System.out.print( "Sorted array is :");
        for (int i = 0;i<size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}
