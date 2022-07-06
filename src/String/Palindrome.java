package String;

public class Palindrome {

    /*
        public static void main(String[] args) {

            String word = "Civic";

            String reversed = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }

            boolean isPalindrome = word.equalsIgnoreCase(reversed);

            System.out.println("isPalindrome = " + isPalindrome);

    //RESULT :isPalindrome = true


        }


    }

     */
   public static boolean solution(String inputString) {


        String reversed = "";

        for (int i = inputString.length() - 1; i >= 0; i--) {

            reversed += inputString.charAt(i);
        }
        boolean isPalindrome = inputString.equalsIgnoreCase(reversed);
        return isPalindrome;
    }

    public static void main(String[] args) {

        System.out.println(solution("aabaa"));
    }
}