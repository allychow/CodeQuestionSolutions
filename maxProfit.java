// brute force solution to best time to buy and sell stock on leetcode
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int result = 0;
        int min = 1;
        int minVal = prices[0];
        int max = 1;
        int absmax = 1;
        int maxVal = prices[1];
        while (max < prices.length) {
          if (maxVal <= prices[max]) {
            maxVal = prices[max];
            absmax = max;
            while (min < absmax) {
              if (minVal > prices[min]) {
                minVal = prices[min];
              }
              min++;
            }
            //System.out.println(absmax);
            //System.out.println(min);
            //System.out.println(result);
            if ((maxVal-minVal) > result) {
              result = maxVal-minVal;
              //System.out.println("UPDATE RESULT" + result);

            }
            maxVal = 0;
          }
          //System.out.println("Max" + max);
          max++;
        }
        //System.out.println(absmax);
        //System.out.println(minVal);
        return result;
    }
}
