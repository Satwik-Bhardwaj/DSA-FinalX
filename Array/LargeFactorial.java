package Array;

import java.util.*;

public class LargeFactorial {

    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        
        for(int i=2; i<=N; i++) {
            
            int carry = 0;
            
            for(int j=0; j<list.size(); j++) {
                int res = list.get(j) * i + carry;
                
                carry = res/10;
                
                list.set(j, res%10);
            }   
            while(carry>0) {
                list.add(carry%10);
                carry /= 10;
            }
        }
        
        Collections.reverse(list);
        
        return list;
        
    }

    public static void main(String[] args) {
        int N = 120;

        ArrayList<Integer> res = factorial(N);

        for (int i : res) {
            System.out.print(i);
        }
    }
}
