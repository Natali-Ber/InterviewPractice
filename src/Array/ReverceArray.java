package Array;

import java.util.Arrays;

public class ReverceArray {
    public static void main(String[] args) {

//NUMBERS
        int[] numbers = {10, 20, 30, 40};
        //               0    1   2   3
        int[] reversed = new int[numbers.length];
        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }
        System.out.println(Arrays.toString(reversed));
        //RESULT : [40, 30, 20, 10]

//STRINGS
        String[] names = {"Elminur Ablimit", "Ali Kilic", "Jonathan Holly", "Gulsen Sohret"};

        for (String each : names) {

            String reverse = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }

            System.out.println(reverse);
        // RESULT :       //timilbA runimlE
                         // ciliK ilA
                         // ylloH nahtanoJ
                         // terhoS nesluG
        }

//CHARS
        char[] letters = {'A', 'B', 'C'};
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.println(letters[i]);
        }
// RESULT : //C
            //B
            //A


//Sentence

    String[] sentence = {"Today", "is", "a", "good", "day!" };


    String reverseSentence = ""; // !day good a is Today

    for (int i = sentence.length - 1; i >= 0; i--) {
        reverseSentence += sentence[i] + " ";
    }
    System.out.println(reverseSentence);
//RESULT: day! good a is Today

}

}
