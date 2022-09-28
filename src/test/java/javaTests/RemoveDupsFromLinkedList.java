package javaTests;

import java.util.*;

public class RemoveDupsFromLinkedList {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);
        System.out.println(Arrays.toString(condense(list)));
    }

    private static Object[] condense(LinkedList<Integer> list){
        Set<Integer> set = new LinkedHashSet<>();

//        for (int i = 0; i < list.size(); i++){
//            set.add(list.get(i));
//        }

        set.addAll(list); // short of above code
        System.out.println(set);
        return set.toArray();
    }

}
