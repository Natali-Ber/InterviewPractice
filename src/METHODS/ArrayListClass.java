package METHODS;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListClass {
    public static void main(String[] args) {


     ArrayList<String> employees = new java.util.ArrayList<>();
     employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};
        java.util.ArrayList<String> list = new java.util.ArrayList<>( Arrays.asList(names) );

     ArrayList<String> list2 = new java.util.ArrayList<>();
        list.add("Java");
        list.add("Python");

        list.set(2, "JavaScript"); // replace
    }
}
