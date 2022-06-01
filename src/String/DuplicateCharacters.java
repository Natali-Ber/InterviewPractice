package String;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "ABBCCD";
        String result = "";
        // for find unique
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); ///'A'
            int count = 0; //represents the frequency of the ch

            for (int i = 0; i < str.length(); i++) { //compares the character that outer loop picked, with each
                char each = str.charAt(i);//each character of str
                if (ch == each) {
                    count++;
                }
            }
           if (count == 2) {
             //  if (count == 1) {
                result += ch;
            }
        }
        System.out.println(result);
      }
    }
//RESULT :   AD
//RESULT : BBCC
