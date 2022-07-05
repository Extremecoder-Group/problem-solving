package com.extremecoder.leetcode;

public class BestTimeToBuyAndSellStock_121 {

    public int maxProfit(int[] prices) {
        int minSoFar=Integer.MAX_VALUE;
        int maxProfit=0;

        for (int price : prices) {
            if (price <= minSoFar)
                minSoFar = price;

            if (price - minSoFar >= maxProfit)
                maxProfit = price - minSoFar;

        }
        return maxProfit;
    }
}
