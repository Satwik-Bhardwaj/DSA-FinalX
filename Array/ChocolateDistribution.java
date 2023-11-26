package Array;

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistribution {

    public static long findMinDiff (ArrayList<Integer> a, int n, int m) {
    	Collections.sort(a);
    
    	int min_diff = Integer.MAX_VALUE;
    
    	for(int i=0; i+m-1<n; i++) {
    		min_diff = Math.min(min_diff, a.get(i+m-1) - a.get(i));
    	}
    
    	return min_diff;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(9);
        list.add(56);
        list.add(7);
        list.add(9);
        list.add(12);

        long ans = findMinDiff(list, list.size(), 5); 
        
        System.out.println(ans);
    }
}
