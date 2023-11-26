package Array;

public class SmallestSubarraySumGreaterThan {

    public static int smallestSubWithSum(int a[], int n, int x) {
    	int i = 0;
    	int j = 0;
    	int ans = n+1;
    	int sum = 0;
    
    	while(j<n) {
    
    		while(sum<=x && j<n){
    			sum += a[j];
    			j++;
    		}
    		while(sum>x && i<n) {
    			ans = Math.min(ans, j-i);
    			sum -= a[i];
    			i++;
    		}
    	}
    	if(ans == n+1) return 0;
    	return ans;
    }

    public static void main(String[] args) {
        int A[] = {1, 4, 45, 6, 0, 19};
        int x = 51;

        int ans = smallestSubWithSum(A, A.length, x);

        System.out.println(ans);


    }
}
