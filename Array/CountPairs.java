package Array;

import java.util.HashMap;

public class CountPairs {
    static int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for(int i=0; i<n; i++) {
            int v = arr[i];
            
            if(map.containsKey(k-v))
                count+=map.get(k-v);
            
            if(map.containsKey(v))
                map.put(v, map.get(v)+1);
            else
                map.put(v, 1);
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};

        int K = 6;

        int result = getPairsCount(arr, arr.length, K);

        System.out.println(result);
    }
}
