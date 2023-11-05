package Array;

// Write a program to find minimum and maximum element in an array

public class FindMinMax {

    // defining min and max variables to find min and max element in the array
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    // function to find min and max element in the array
    static void minMaxSearch(int[] arr) {

        // finding while traversing
        for(int i: arr) {

            // assigning which one is greater, max itself or the current element
            max = Math.max(max, i);

            // assigning which one is smaller, min itself or the current element
            min = Math.min(min, i);
        }
    }

    public static void main(String[] args) {
        
        // defining and initiating an array
        int[] arr = {32, 22, 67, 2, 45, 43, 23, 24, 11};

        // calling a function to find minimum and maximum of array
        minMaxSearch(arr);

        //printing result
        System.out.println("Min element: " + min);
        System.out.println("Max element: " + max);

    }
}
