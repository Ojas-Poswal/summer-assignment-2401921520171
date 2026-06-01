class Solution {
    public int maxProfit(int[] prices) {
      int maxProfit=0;
      int minPrice=Integer.MAX_VALUE;

      for(int price : prices){

        minPrice = Math.min(minPrice,price);
        int currentMax = price - minPrice;
        maxProfit=Math.max(maxProfit,currentMax);

      }
      
      return maxProfit;
    }
}