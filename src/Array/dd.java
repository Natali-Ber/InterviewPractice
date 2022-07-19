package Array;

import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class dd {


    public static String LetterCount(String str) {

        String[] arr = str.split(" ");

        int count = 0;

        String res = "-1";

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                int counter = 0;
                for (int k = j + 1; k < arr[i].length() ; k++) {

                    if(arr[i].charAt(j) == arr[i].charAt(k) )
                        counter ++;
                }
                if (counter > count) {
                    count = counter;   res = arr[i];
                }
            }

        }
        return res;
    }

    public static void main (String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCount(s.nextLine()));
    }

}


