package METHODS;

public class MathUtility {
    //can return the sum of two integers
    public static int sum(int n1, int n2) {
        int result = n1 + n2;
        return result;

    }

    //can return the sum of two decimal numbers
    public static double sum(double n1, double n2) {
        double result = n1 + n2;
        return result;

    }

    //can return the subtraction of two integers
    public static int subtraction(int n1, int n2) {
        int result = n1 - n2;
        return result;
    }

    //can return the subtraction of two decimals
    public static double subtraction(double n1, double n2) {
        double result = n1 - n2;
        return result;
    }

    //can return the multiplication of two integers
    public static int multiplication(int n1, int n2) {
        int result = n1 * n2;
        return result;
    }

    //can return the multiplication of two decimals
    public static double multiplication(double n1, double n2) {
        double result = n1 * n2;
        return result;
    }

    //Create a method that passes two double parameters and return the division reslt
    public static double division(double n1, double n2) {
        double result = n1 / n2;
        return result;
    }

    //can check if an integer is even number
    public static boolean evenNumber(int n) {
        boolean even =n % 2 == 0;
        return even;
    }

    //can check if an integer is odd number
    public static boolean oddNumber (int n) {
        boolean odd =n % 2 != 0;
        return odd;
    }

    //Create a method that can return the maximum number between two integers
    public static int maxNumber (int n1, int n2) {

        int max=0;

        if(n1>n2){
            max = n1;
        }if(n2>n1){
            max = n2;
        }
        return max;
    }

    //can return the maximum number between two decimal numbers
    public static double maxNumber (double n1, double n2){
        double max=0;

        if(n1>n2){
            max = n1;
        }if(n2>n1){
            max = n2;
        }
        return max;
    }

    //can return the minimum number between two integers
    public static int minNumber (int n1, int n2) {

        int min=0;

        if(n1>n2){
            min = n2;
        }if(n2>n1){
            min = n1;
        }
        return min;
    }
    //can return the minimum number between two decimal numbers
    public static double minNumber (double n1, double n2){
        double min=0;

        if(n1>n2){
            min = n2;
        }if(n2>n1){
            min = n1;
        }
        return min;
    }

}
