package javaTests;
//Find all substrings with unique chars. If their indexes are different, they qualify, like two 'a' at two different indices

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindAllSubstrings {
    public static void main(String[] args) {
        System.out.println(findSubstrings("bcada"));
    }

    private static int findSubstrings(String test) {
        if (test == null || test.length() == 0) {
            return 0;
        }
        ArrayList<String> arrSubs = new ArrayList<String>();

        for (int i = 0; i < test.length(); i++) {
            for (int j = i + 1; j <= test.length(); j++) {
                String sub = test.substring(i, j);
                System.out.println(sub);
                Set<Character> set = new HashSet<Character>();
                for (int k = 0; k < sub.length(); k++) {
                    set.add(sub.charAt(k));
                }
                if (sub.length() == set.size()) {
                    arrSubs.add(test.substring(i, j));
                    System.out.println(arrSubs);
                }
            }
        }
        System.out.println(arrSubs);
        return arrSubs.size();
    }
}
