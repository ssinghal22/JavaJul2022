package javaTests;

import cucumber.api.java.sl.In;

import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        // reverseAlphabets("a<x>d;f'g:t{");
        //  reverseSpecial("a<x>d;f'g:t{");
        // System.out.println(uniqueDigits(100, 200));
       // System.out.println(pushZeroesToEnd(new int[]{1, 0, 8, 0, 0, 9}));
       // System.out.println(longestContinuousString("abcdefakjh"));
       // System.out.println(longestContinuousString(null));
       // System.out.println(addTwoLists(list1, list2));
        String[] words = {"apple", "apply", "appium", "applied", "apps"};
        //System.out.println(longest(words));
        int[] arr1 = {3, 1, 4, -6, 3, 7, 4, -6, 2, 9, -7, 6};
        int[] arr2 = {1, -6, 7, -6, 9};
       // System.out.println(isSubsequent(arr2, arr1));


    }
    private static boolean isSubsequent(int[] arr2, int[] arr1){
        int start = 0;
        boolean flag = false;

     for (int i = 0; i < arr2.length; i++){
         flag = false;
         for (int j = start; j < arr1.length; j++){
             if (arr2[i] == arr1[j]){
                 flag= true;
                 start = ++j;
                break;
             }
         }
         if (!flag){
             return flag;
         }
     }
      return true;
    }

    private static String longest(String[] words){
        int shortestLength = Integer.MAX_VALUE;
        String shortestWord = "";
    for (String word: words){
        if (word.length() < shortestLength){
            shortestLength = word.length();
            shortestWord = word;
        }
    }
        System.out.println("shortestLength: " + shortestLength);
        System.out.println("shortestWord: " + shortestWord);
List<String> list = new ArrayList<>();
        for (String word: words){
            if (!word.equals(shortestWord)){
                list.add(word);
            }
        }
        System.out.println(list);
String prefix = "";

for (int i = 0; i < shortestLength; i++) {
    boolean flag = false;
    for (String word: list) {
        if (shortestWord.charAt(i) == word.charAt(i)) {
            flag = true;
        }
        else {
            break;
        }
    }
    if (flag){
        prefix += shortestWord.charAt(i);
    }
    else {
        break;
    }
}
        return prefix;
    }

    private static List<Integer> addTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2){
       int carryover = 0;
       int size1 = list1.size() - 1;
       int size2 = list2.size() - 1;
       List<Integer> list3 = new LinkedList<>();

       while (size1 >= 0 & size2 >= 0){
            int sum = list1.get(size1) + list2.get(size2);

            if (sum >= 10){

                if (carryover != 0){
                    sum += carryover;
                    list3.add(sum%10);
                }
                else {
                    list3.add(sum%10);
                    carryover = sum/10;
                }
            }
            else {
                list3.add(sum + carryover);
                carryover = 0;
            }
            --size1;
            --size2;
        }
       System.out.println("size1: " + size1);
       System.out.println("size2: " + size2);

if (size1 > 0){
    while (size1 >= 0){
        list3.add(list1.get(size1));
        --size1;
    }
}
if (size2 > 0) {
    while (size2 >= 0){
        list3.add(list2.get(size2));
        --size2;
    }
}
        return list3;
    }

    private static String longestContinuousString(String test){
        String longest = "";
        Set<Character> set = new HashSet<>();

        if (test == null || test.length() == 0){
            return longest;
        }

        for (int i = 0; i < test.length(); i++){
          if (!set.contains(test.charAt(i))){
              longest += test.charAt(i);
              set.add(test.charAt(i));
          }
          else {
              return longest;
          }
        }
        return longest;
    }

    private static String pushZeroesToEnd(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == 0) {
                    for (int j = i + 1; j < arr.length; j++){ // {1, 8, 0, 0, 0, 9}
                        if (arr[j] != 0){
                            arr[i] = arr[j];
                            arr[j] = 0;
                            break;
                        }
                    }
                }
        }
        return Arrays.toString(arr);
    }

    private static ArrayList<Integer> uniqueDigits(int start, int end) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isUnique(i)) {
                list.add(i);
            }
        }
        return list;
    }

    private static boolean isUnique(int num) { //102, 100
        Set<Integer> set = new HashSet<>();

        while (num > 0) {
            int digit = num % 10;
            if (!set.contains(digit)) {
                set.add(digit);
            } else {
                return false;
            }
            num = num / 10;
        }
        return true;
    }

    private static void reverseSpecial(String test) {
        String rev = "";
        String special = "";

        for (int i = 0; i < test.length(); i++) {


        }

    }

    private static void reverseAlphabets(String test) {
        String rev = "";
        String alpha = "";

        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) >= 'a' & test.charAt(i) <= 'z') {
                alpha += test.charAt(i);
            }
        }
        int j = alpha.length() - 1;
        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) >= 'a' & test.charAt(i) <= 'z') {
                rev += alpha.charAt(j);
                --j;
            } else {
                rev += test.charAt(i);
            }
        }
        System.out.println(rev);
    }
}
