package String;

public class frequencyOfCharacter {
    public static void main(String[] args) {
        String str ="AABCCD";
        char ch = 'A';

        int frequency =0;

        for (int i =0; i<str.length(); i++){  // i: indexes of str

            char eachChar = str.charAt(i);  // eachChar: each character of str
            if (ch ==eachChar){ //if given ch is matching with the eachChar, then ch is appeared in the string
                frequency++;


            }
        }

        System.out.println("CHAR 'A' meet " +frequency+ " times");

//RESULT :     CHAR 'A' meet 2 times






    }
}
