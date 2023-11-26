package Array;

import java.util.HashMap;

public class ArraysSubset {

    public static String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long, Long> hs = new HashMap<>();
        for(int i=0; i<n; i++) {
            if(hs.containsKey(a1[i])) hs.put(a1[i], hs.get(a1[i])+1);
            else hs.put(a1[i], (long) 1);
        }
    
        for(int i=0; i<m; i++) {
            if(hs.containsKey(a2[i])) {
                hs.put(a2[i], hs.get(a2[i])-1);
                if(hs.get(a2[i]) == 0) hs.remove(a2[i]);
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }

    public static void main(String[] args) {
        long a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
        long a2[] = {11, 3, 7, 1, 7};

        String ans = isSubset(a1, a2, a1.length, a2.length);

        System.out.println(ans);

    }
}
