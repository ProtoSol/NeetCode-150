public class BestTimeToBuySell {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxProfit = 0;
        while(r < prices.length){
            if(prices[l] < prices[r]){
                maxProfit = Math.max(maxProfit, prices[r] - prices[l]);
            }
            else{
                l = r;
            }
            r++;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        BestTimeToBuySell obj = new BestTimeToBuySell();
        System.out.println(obj.maxProfit(prices));
    }
}
