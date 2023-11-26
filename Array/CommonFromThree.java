package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonFromThree {

    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        
        HashMap<Integer, Integer> map = new  HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        for(int i : A){
            if(map.containsKey(i)) map
            map.add(i, );
        }
        
        for(int i : B){
            if(hs.contains(i)) list.add(i);
        }
        
        for(int i : C){
            if(list.contains(i) && hs.contains(i)) list2.add(i); 
        }
        
        return list2;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 5, 10, 20, 40, 80};
        int arr2[] = {6, 7, 20, 80, 100};
        int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        ArrayList<Integer> result = commonElements(arr1, arr2, arr3, arr1.length, arr2.length, arr3.length);
    }
}
