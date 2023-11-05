package Array;

// Write a program to reverse the array.

public class ReverseArray {

    // declared the reverse array, passing array as argument to perform modification on it.
    static void reverse(int[] arr){

        // using two pointers, i and j to keep tracking on elements from both sides.
        int i = 0;
        int j = arr.length - 1;

        // running a loop until they comes so close that they about to crosse each other.
        while (i<j) {

            // swapping the elements values. 
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            // increasing the i, and decreasing the j.
            i++;
            j--;
        }
    }
    
    public static void main(String[] args) {

        // declaring an array.
        int[] arr = {32, 22, 67, 2, 45, 43, 23, 24, 11};

        // calling a reverse method/function to reverse the array.
        reverse(arr);

        // finally printing the array.
        for(int i: arr){
            System.out.print(i + ", ");
        }
    }
    
}