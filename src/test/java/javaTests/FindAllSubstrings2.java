package javaTests;
//Find all substrings with unique chars. If their indexes are different, they qualify, like two 'a' at two different indices

import java.util.ArrayList;

public class FindAllSubstrings2 {
    public static void main(String[] args){
        System.out.println(findSubstrings("bcada"));
    }
    private static String findSubstrings(String test){
        ArrayList<String> list = new ArrayList<>();
for (int i = 0; i < test.length(); i++){
    for (int j = i +1; j <= test.length(); j++){
        String sub = test.substring(i, j);
        list.add(sub);
    }
}
        return String.valueOf(list);
    }
}