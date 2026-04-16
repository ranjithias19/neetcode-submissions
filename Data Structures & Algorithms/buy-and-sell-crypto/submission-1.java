class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        if(n==0 || n==1) {
            return 0;
        }
        int maxProfit = 0;
    
        int l = 0;
        int r = 1;
        while(r<n) {
            if(prices[l]<prices[r]) {
                int profit = prices[r]-prices[l];
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                l=r;
            }
            r++;
        }

        return maxProfit;


    }
}
