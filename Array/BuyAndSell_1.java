package Array;

public class BuyAndSell_1 {

    public static int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int profit = 0;

        for(int i=0; i<prices.length; i++) {
            if(profit < prices[i]-min) profit = prices[i] - min;
            if(min > prices[i]) min = prices[i];
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};

        // calling a function
        int result = maxProfit(arr);

        System.out.print(result);
    }
}
