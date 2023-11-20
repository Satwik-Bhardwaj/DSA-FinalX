package Array;

import java.util.ArrayList;
import java.util.HashSet;

// Find union and intersection of the array

public class UnionNIntersection {

    // function to find out the union
    private static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {

        // set to store unique elements
        HashSet<Integer> hs = new HashSet<>();

        // putting elements to hash set from first array
        for(int i: arr1) {
            hs.add(i);
        }

        // putting elements to hash set from second array
        for(int i: arr2) {
            hs.add(i);
        }

        // copying the elements from set to resultant array and return
        return new ArrayList<>(hs);
    }

    // function to find the intersecting elements in two arrays
    private static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2) {
        // creating hashset to find the intersecting elements
        HashSet<Integer> hs = new HashSet<>();

        // saving the elements uniquely in the set
        for(int i: arr1) {
            hs.add(i);
        }

        // arraylist for storing the result
        ArrayList<Integer> list = new ArrayList<>();

        for(int i: arr2) {
            if(hs.contains(i)) list.add(i);
        }

        return list;
    }

    public static void main(String[] args) {

        // two arrays to find out union and intersection
        int[] arr1 = {85, 25, 1, 32, 54, 6};
        int[] arr2 = {85, 2, 32};

        // storing union result
        ArrayList<Integer> union = findUnion(arr1, arr2);

        // printing the union result
        for(int i: union) {
            System.out.print(i+", ");
        }
        System.out.println("");

        // storing the intersection result
        ArrayList<Integer> intersection = findIntersection(arr1, arr2);

        // printing the intersection result
        for(int i: intersection) {
            System.out.print(i+", ");
        }

    }
}
