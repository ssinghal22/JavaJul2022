package javaTests;

// bool CanMakePalindrome ( string str)
// CanMakePalindrome() must return true, if any rearrangement of ALL the characters in the given string can #make a palindrome
// CanMakePalindrome() must return false, if any rearrangement of ALL the characters in the given string does #not create a  palindrome

// example : "aab" , can make a palindrome – returns true
// example : "aabbccdef". cannot make a palindrome - returns false
// example : "dedeff" can make a palindrome – returns true
// example : "xyzz" cannot make a palindrome – returns false

import java.util.HashMap;

public class CanMakeAPalindrome {
    public static void main(String[] args) {
        System.out.println(canMakePalindrome("abbdbbaaac"));
    }

    private static boolean canMakePalindrome(String test) {
        if (test == null || test.length() == 0) {
            System.out.println("empty or null string");
            return false;
        }
        if (test.length() == 1) {
            return true;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < test.length(); i++) {
            if (map.keySet().contains(test.charAt(i))) {
                map.put(test.charAt(i), map.get(test.charAt(i)) + 1);
            } else {
                map.put(test.charAt(i), 1);
            }
        }

        int count = 0;
        for (Character key : map.keySet()) {
            if (!(map.get(key) % 2 == 0)) {
                ++count;
            }
        }

        if (count > 1) {
            return false;
        } else {
            return true;
        }

    }
}