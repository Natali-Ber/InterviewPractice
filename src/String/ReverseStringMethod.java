package String;

public class ReverseStringMethod {
    public static void main(String[] args) {

        String reverse = reverseString("Hello");
        System.out.println(reverse);


//RESULT:     olleH


    }

    public static String reverseString(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }





}
