package Array;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
//STRINGS
        String[] arr1 = {"AAA", "BBB", "CCC"};
        String[] arr2 = {"DDDDD", "EEEEE", "FFFFF", "GGGGgg", "Jgjjjj"};

        String[] students = new String[arr1.length + arr2.length];  // 8
        int i = 0;
        for (String each : arr1) { // Ali, Layan, Aysenur
            students[i++] = each;
        }
        for (String each : arr2) {
            students[i++] = each;
        }
        System.out.println(Arrays.toString(students));

//RESULT :[AAA, BBB, CCC, DDDDD, EEEEE, FFFFF, GGGGgg, Jgjjjj]

        System.out.println("-----------------------------------------------");
//CHAR
        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int j = 0;

        for (char ch : ch1) {
            chars[j]= ch;
            j++;
        }

        for (char ch : ch2) {
            chars[j]= ch;
            j++;
        }

        System.out.println(Arrays.toString(chars));

//RESULT :[A, B, C, D, E, F, G, H]
    }
}
