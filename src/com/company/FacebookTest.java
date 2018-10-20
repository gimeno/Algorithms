package com.company;

public class FacebookTest {

    public static void main(String[] args) {
        int[] prices = {20, 40, 70, 10, 60};
        System.out.println(profit(prices));
    }

    private static int profit(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {


            return arr[0];
        }

        int profit = 0;
        int buyDay = 0, saleDay = 0;


        for (int i = 1; i < arr.length; i++) {
            int tProfit = arr[i] - arr[buyDay];


            if (profit < (profit + tProfit)) {
                profit = profit + tProfit;
                saleDay = i;
            } else {


                if (profit > 0) {
//                    printf("Buy on day: %d  Sale on day: %d\n", buyDay, saleDay);
                    profit = 0;
                }
                buyDay = i;
                saleDay = i;
            }
        }


        if (profit > 0) {
//            printf("Buy on day: %d  Sale on day: %d\n", buyDay, saleDay);
        }

        return 0;
    }

}
