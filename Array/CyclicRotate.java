package Array;

// Write a program to cyclically rotate an array by k.
public class CyclicRotate {

    // function to execute this task
    private static void rotate(int arr[], int k) {
        
        int n = arr.length;

        for(int i = 0; i<k; i++) {
            int temp = arr[n-1];

            for(int j = n-1; j>0; j--) {
                arr[j] = arr[j-1];
            }

            arr[0] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, -11, 45, -22, 1, 45, -23, 23, -66, -9, 12, 45, -76};

        // calling a function
        rotate(arr, 2);

        for(int i: arr) {
            System.out.print(i+", ");
        }
    }
}
