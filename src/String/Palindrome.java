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


     */


    public static boolean isPalindrome(String s) {
        String reverced = "";

        String s1=s.replace(" ","") ;
        String s2=s1.replace(",","") ;
        String s3= s2.replace(":","");
        System.out.println(s3);
        for (int i= s3.length()-1; i>=0; i--){
            reverced += s3.charAt(i);

        }
        System.out.println(reverced);
        boolean isPalindrome = s3.equalsIgnoreCase(reverced);
        return isPalindrome;
    }

    public static void main(String[]args){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }




}