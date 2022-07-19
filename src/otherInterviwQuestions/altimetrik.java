package otherInterviwQuestions;

import java.util.*;

public class altimetrik {
    public static void main(String[] args) {

  /*
        Write a program to to print a 2 letter combination from a given unique stringInput - ABCD Combination -2 Output -AB,AC,AD,BC,BD,CD
   */

        String task = "ABCD";

        List<String> myList = new ArrayList<String>(Arrays.asList(task.split("")));
        Set<String> print = new TreeSet<>();
        //System.out.println(myList);
        String result = "";

        for (int i = 0; i < myList.size(); i++) {
            for (int j = 0; j < myList.size(); j++) {
                if (!myList.get(i).equals(myList.get(j))) {
                    result += myList.get(i) + myList.get(j) + " ";
                   // System.out.print(result);
                    char[] arr = result.toCharArray();
                    Arrays.sort(arr);
                    String str1 = new String(arr);

                    print.add(str1);
                    result = "";
                }
            }
        }
        System.out.println(print);
    }


}
