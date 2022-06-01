package Array;

public class MaxNumber {
    public static void main(String[] args) {

        int []numbers ={10,5,4,20,1,0};
        int max = numbers[0];

        /*
OR     for (int i = 0; i <numbers.length; i++){
            if (numbers[i]>max) {
                max = numbers[i];
            }
        }
OR
        */
        for (int number:numbers ){
            if (number>max) {
                max =number;
            }
        }
        System.out.println("MAX "+max);

    }
}
//RESULT : min = 20