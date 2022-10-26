package javaTests.easyOnes;

import java.util.HashSet;
import java.util.Set;

public class reverseVowelsInAString {
    public static void main(String[] args) {
        //System.out.println(reverseVowels("LeetCode"));
// System.out.println(reverseVowels(null));
// System.out.println(reverseVowels(""));
// System.out.println(reverseVowels("H"));
// System.out.println(reverseVowels("a"));
       // System.out.println(reverseVowels("12345"));
    }
    private static String reverseVowels(String test){
        if (test == null || test.length() == 0){
            return "null or empty string";
        }
        if (test.length() == 1){
            return test;
        }
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        String reverse = "";
        String vowels = "";

        for (int i = 0; i < test.length(); i++){
                if (set.contains(test.charAt(i))){
                    vowels += test.charAt(i); //"eo"
                }
            }

        int j = vowels.length() -1;
        for (int i = 0; i < test.length(); i++){
            if (set.contains(test.charAt(i))){
                reverse += vowels.charAt(j);
                --j;
            }
            else {
                reverse += test.charAt(i);
            }
        }
        return reverse;
    }
}
