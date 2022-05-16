package String;

import java.util.Arrays;

public class AnagramTwoStrings {

    public static void main(String[] args) {

//WITH SORT
       String str1= "acdb";
       String str2 = "dbca";
        char[]chars1 = str1.toCharArray();
        char[]chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        boolean anagram = Arrays.equals(chars1, chars2);
        System.out.println(anagram);

//NO SORT
        String s1= "Java";
        String s2 = "java";
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");


        }
    }
}
//RESULT : true