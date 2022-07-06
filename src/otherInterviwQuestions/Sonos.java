package otherInterviwQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Sonos {
    public static void main(String[] args) {
        java.util.ArrayList<String> strings = new java.util.ArrayList<String>();
        strings.add("Hello, World!");
        strings.add("Welcome to CoderPad.");
        strings.add("This pad is running Java " + Runtime.version().feature());

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public String frequencyOfChars3(String str) {

        String b = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        b = b.replace(", ", "").replace("[", "")
                .replace("]", "");

        String result = "";
        for (int j = 0; j < b.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).equals("" + str.charAt(j))) {
                    count++;
                }
            }

            result += b.substring(j, j + 1) + count;
        }

        return result;

    }


}
