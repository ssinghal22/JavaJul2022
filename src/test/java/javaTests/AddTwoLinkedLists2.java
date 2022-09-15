package javaTests;

import java.util.LinkedList;
import java.util.List;
// Add 2 lists from back. They have different size. If sum >= 10, add first digit, second digit goes as carryover
//same as other, maybe better code

public class AddTwoLinkedLists2 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(8);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        //{1, 2, 3}
        //{4, 8, 5, 6, 7}
        System.out.println(addTwoLists(list1, list2));
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
}
