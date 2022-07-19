package otherInterviwQuestions;

import java.util.ArrayList;

public class airbiquty2 {
    public static void main(String[] args) {

        ArrayList<String> strings = new java.util.ArrayList<String>();
        strings.add("Hello, World!");
        strings.add("Welcome to CoderPad.");
        strings.add("This pad is running Java " + Runtime.version().feature());

        for (String string : strings) {
            System.out.println(string);
            System.out.println(wordReverse(string));
        }

    }

    public static String wordReverse(String str) {

        String []words = str.split(" ");

        String reverseSentence="";
        for (int i = words.length - 1; i >= 0; i--) {
            reverseSentence += words[i] + " ";
        }
        return reverseSentence;
    }
}
