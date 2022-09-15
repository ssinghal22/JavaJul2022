package javaTests;

public class FindEvenDigitNumbersInAnArray {
    public static void main(String[] args){
        System.out.println(solution(new int[] {12, 324, 7890, 9, 1}));
    }
    private static int solution(int[] a){
        int count = 0;
        for (int num: a){
            //count digits in num
            int digit = 0;
            int digitCount = 0;
            while (num > 0){
                digit = num%10;
                ++ digitCount;
                num = num/10;
            }
            if (digitCount%2 == 0){
                ++count;
            }
        }
        return count;
    }
}


