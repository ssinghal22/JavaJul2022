package javaTests;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * print longest continuous string from a string until a char repeats
 */
public class LongestNonRepeatCharacterInAString {
    public static void main(String[] args) {
        String test = "abckrbbda";
        System.out.println(longestStr(test));
    }

    private static String longestStr(String test){
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
}