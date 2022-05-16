package Array;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {

        int []numbers ={10,5,4,20,1};
        int min = numbers[0];

        /*
OR     for (int i = 0; i <numbers.length; i++){
            if (numbers[i]<min) {
                min = numbers[i];
            }
        }
OR
        */
        for (int number:numbers ){
            if (number<min) {
                min =number;
            }
        }
        System.out.println(min);


    }
}
//RESULT : min = 1