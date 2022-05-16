package String;

public class UniqueCharacters {
    public static void main(String[] args) {


        String str = "ABBCCD";
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {// if the first and last index numbers of the
                // character a same - unique
                //result += ch;
                result += ch;
            }
        }
        System.out.println(result);

    }
}
//RESULT : AD