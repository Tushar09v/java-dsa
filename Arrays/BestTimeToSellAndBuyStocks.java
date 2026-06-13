public class BestTimeToSellAndBuyStocks {
    public static int maxprofit(int[] prices){ 
        int minimumPrice = prices[0];
        int maximumProfit = 0;

        for(int i = 0; i < prices.length; i++){
            int currentPrice = prices[i];
            if(currentPrice < minimumPrice){
                minimumPrice = currentPrice;
            }
            int profit = currentPrice - minimumPrice;
            if(profit >maximumProfit){
                maximumProfit = profit;
            }
        }
        return maximumProfit;
    }

    public static void main(String[] args) {
        int[] prices = {1,2,4,6,8,1,2,7,6};
        System.out.println(maxprofit(prices));
    }
}
