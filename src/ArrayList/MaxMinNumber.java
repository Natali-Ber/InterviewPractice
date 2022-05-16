package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinNumber {
    public static void main(String[] args) {
//MAX
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(list);

        int max = list.get(0);

        for (Integer each : list) {
            if (each > max) {
                max = each;
            }
        }
            System.out.println("max = " + max);
//RESULT : max = 9


//MIN
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        System.out.println(list2);
        int min = list.get(0);

        for (Integer each : list2) {
            if (each < min) {
                min = each;
            }
        }
            System.out.println("min = " + min);
//RESULT : min = 1


    }
}
