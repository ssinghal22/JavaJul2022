package javaTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        // System.out.println(findAnagram(new String[] {"tea", "eat"}));
        // findListOfAnagrams(new String[]{"tea", "eat", "meat", "team", "owl", "low"});
        //System.out.println(isAnagram(new String[]{"teea", "eate"}));
        findListOfAnagramsImproved(new String[]{"tea", "eat", "meat", "team", "owl", "low"});
    }

    private static void findListOfAnagramsImproved(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        for (String word : words) {
            char[] chArr = word.toCharArray();
            Arrays.sort(chArr);
            list.add(String.valueOf(chArr));
        }
        System.out.println(list);

        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.putIfAbsent(list.get(i), new ArrayList<Integer>());
            map.get(list.get(i)).add(i);
        }
        System.out.println(map.entrySet());

        for (String key : map.keySet()) {
            List<Integer> list1;
            List<String> list2 = new ArrayList<>();
            list1 = map.get(key);
            for (int i : list1) {
                list2.add(words[i]);
            }
            System.out.println(list2);
        }
    }

    private static void findListOfAnagrams(String[] words) {
        for (int i = 0; i < words.length; i++) {
            char[] chArr1 = words[i].toCharArray();
            Arrays.sort(chArr1);
            ArrayList<String> list = new ArrayList<>();
            list.add(words[i]);

            for (int j = i + 1; j < words.length; j++) {
                char[] chArr2 = words[j].toCharArray();
                Arrays.sort(chArr2);
                if (Arrays.equals(chArr1, chArr2)) {
                    list.add(words[j]);
                }
            }
            System.out.println(list);
        }
    }

    private static boolean findAnagram(String[] words) {
        char[] arr1 = words[0].toCharArray();
        Arrays.sort(arr1);
        System.out.println(arr1);

        char[] arr2 = words[1].toCharArray();
        Arrays.sort(arr2);
        System.out.println(arr2);

        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    private static boolean isAnagram(String[] words) {
        //without using sort method

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < words[0].length(); i++) {
            if (map1.keySet().contains(words[0].charAt(i))) {
                map1.put(words[0].charAt(i), map1.get(words[0].charAt(i)) + 1);
            } else {
                map1.put(words[0].charAt(i), 1);
            }
        }
        System.out.println(map1.entrySet());
        System.out.println(map1.keySet());
        System.out.println(map1.values());

        //with 2 hashmaps
//        for (int i = 0; i < words[1].length(); i++){
//            if (map2.keySet().contains(words[1].charAt(i))){
//                map2.put(words[1].charAt(i), map2.get(words[1].charAt(i)) + 1);
//            }
//            else {
//                map2.put(words[1].charAt(i), 1);
//            }
//        }
//        System.out.println(map2.entrySet());
//        System.out.println(map2.keySet());
//        System.out.println(map2.values());

//        if(map1.size() != map2.size()){
//            return false;
//        }
//
//        for (Character key: map1.keySet()){
//            if (!map2.containsKey(key)){
//                return false;
//            }
//            if (map1.get(key) != map2.get(key)){
//                return false;
//            }
//        }

        //with 1 hashmap
        for (int i = 0; i < words[1].length(); i++) {
            if (map1.keySet().contains(words[1].charAt(i))) {
                map1.put(words[1].charAt(i), map1.get(words[1].charAt(i)) - 1);
            }
        }
        for (Character key : map1.keySet()) {
            if (map1.get(key) != 0) {
                return false;
            }
        }
        return true;
    }
}
