package Array;

import java.util.ArrayList;

// Write a program to move negative numbers to the end of the array.

public class MoveNegativeToEnd {

    // function to move negative integers to an end of array
    private static void moveToEnd(int[] arr) {
        
        // Creating an arraylist to arrange the numbers in new order
        ArrayList<Integer> list = new ArrayList<>();

        // first moving all negative numbers to arraylist
        for(int i: arr) {
            if(i<0) list.add(i);
        }

        // moving all non-negative numbers to arraylist
        for(int i: arr) {
            if(i>=0) list.add(i);
        }

        // moving all numbers from arraylist to array
        for(int i =0; i<list.size(); i++) {
            arr[i] = list.get(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, -11, 45, -22, 1, 45, -23, 23, -66, -9, 12, 45, -76};

        // calling the function to move the negative numbers to the end.
        moveToEnd(arr);

        // finally printing the array.
        for(int i: arr){
            System.out.print(i + ", ");
        }
    }
}
