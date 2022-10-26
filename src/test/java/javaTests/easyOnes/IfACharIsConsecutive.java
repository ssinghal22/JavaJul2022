package javaTests.easyOnes;

/*
 Given a String and a character, return true if all occurrence of a given character are consecutive, else return false.
like s = “aaaabbbbbccccccccddd”, c=‘b’, return true
s = “aaababbbaaccdd”, c =‘a’, return false
 */

public class IfACharIsConsecutive {
    public static void main(String[] args) {
        System.out.println(isConsecutive("jjjjaaababbbaazccdd", 'z'));
        System.out.println(isConsecutive("aaabbabbccdd", 'a'));
    }

    private static boolean isConsecutive(String test, char c) {
        if (test == null || test.length() == 0) {
            return false;
        }

        boolean flag = true;
        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) == c) {
                if (!flag) {
                    return flag;
                }
                flag = true;
            } else {
                flag = false;
            }
        }
        return true;
    }
}