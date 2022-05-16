package ArrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

//Integer
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);
        System.out.println(list);

        ArrayList<Integer> result = new ArrayList<>(); //{10, 20}
        for (Integer each : list) {
            if (result.contains(each)) {
                continue;
            }
            result.add(each);
        }
        System.out.println(result);

//RESULT [10, 20, 30]

//String
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java"); //0
        list2.add("Java"); //1
        list2.add("Java"); //2
        list2.add("Python"); //3
        list2.add("C#"); //4
        list2.add("C#"); //5
        System.out.println(list2);

        ArrayList<String> unique = new ArrayList<>();
        for (String each2 : list2) {
            if (list2.indexOf(each2) == list2.lastIndexOf(each2)) {
                unique.add(each2);
            }
        }
        System.out.println(unique);
    }
}
//RESULT [Python]