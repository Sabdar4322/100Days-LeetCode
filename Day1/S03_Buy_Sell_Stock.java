public class S03_Buy_Sell_Stock {
    public static int maxProfit(int[] prices) {

        int buyPrice = Integer.MAX_VALUE; // minPrice
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) { // profit condition
                int profit = prices[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i]; // update buy price when a lower price is found
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
    
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices)); // Output: 5
    }
}
