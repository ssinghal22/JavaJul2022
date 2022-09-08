package javaTests;
/*
 Let's say you have a list of stock prices from a stock market. Each index is a different day and represents the price of the stock.
 Your job here is to find the maximum amount of money you can make from buying and selling that stock.
Remember, that selling your stock has to come after buying it.
[1,2,3,4,5]
*/
public class SellStockAtMaxProfit {
    public static void main(String[] args){
        System.out.println(makeMaxMoney(new int[] {100, 1, 2, 3, 4, 5, 50, 90}));
    }

    private static int makeMaxMoney(int[] price){
        if (price == null || price.length < 3){
            return 999;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;

//find max and min stock price and its day
        for (int i = 0; i < price.length; i++){
            if (price[i] > max){
                max = price[i];
                maxIndex = i;
            }
            if (price[i] < min){
                min = price[i];
                minIndex = i;
            }
        }

//check day of buying is before day of sale
        if(minIndex >= maxIndex){
            System.out.println("Sorry! can't sell!");
            return 0;
        }
        else{
            return max - min;
        }
    }
}