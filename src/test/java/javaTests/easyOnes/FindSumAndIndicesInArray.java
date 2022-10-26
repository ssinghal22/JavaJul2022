package javaTests.easyOnes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
// not clear how do in sorted array

public class FindSumAndIndicesInArray {
    public static void main(String[] args){
        System.out.println(findPair(new int[]{2, 9, 1, 3, 7, 8}, 16));
    }

    private static ArrayList<Integer> findPair(int[] arr, int sum){
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= arr.length; i++){
            if (set.contains(arr[i])){
                list.add(arr[i]);
                System.out.println("index 2: " + i);

                list.add(sum-arr[i]);
                for (int j =0; j < arr.length; j++){
                    if (arr[j] == sum - arr[i]){
                        System.out.println("index 1: " + j);
                        break;
                    }
                }
                break;
            }
            set.add(sum - arr[i]);//14, 7, 15, 13,
        }
        return list;
    }
}
