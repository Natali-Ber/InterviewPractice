package otherInterviwQuestions;

import java.util.ArrayList;

public class airbiquty {
    public static void main(String[] args) {

  ArrayList<String> strings = new java.util.ArrayList<String>();
        strings.add("Hello, World!");
        strings.add("Welcome to CoderPad.");
        strings.add("This pad is running Java " + Runtime.version().feature());

        for (String string : strings) {
            System.out.println(string);
        }

    ArrayList<String> newstrings = new ArrayList<String>();
        newstrings.add(wordReverse(strings.get(0)));
        newstrings.add(wordReverse(strings.get(1)));
        newstrings.add(wordReverse(strings.get(2)));
        for (String string : newstrings) {
            System.out.println(string);
        }
    }


    public static String wordReverse(String str) {
        String reverse="";
        for(int i=str.length()-1; i >= 0; i--)
            reverse += str.toCharArray()[i];
        return reverse;
    }




}

