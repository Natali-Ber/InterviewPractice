package Array;

import java.util.Arrays;

public class Get_even_numbers {
    public static void main(String[] argc){
    System.out.println("Hello World!");
    System.out.println("Even numbers are");
    System.out.println(Arrays.toString(get_even_numbers(10)));

        get_even_numbers2(10);


}
        public static int[] get_even_numbers(int max) {
            int[] even_numbers = new int[10];
            int counter=0;
            for (int i=0; i<=max; i++){
                if (i % 2 != 0){
                    even_numbers[counter]=i;
                    counter++;
                }
            }
            return even_numbers;
        }
    public static void get_even_numbers2(int max) {
        int[] even_numbers = new int[10];
        int counter=0;
        for (int i=0; i<=max; i++){
            if (i % 2 != 0){
                even_numbers[counter]=i;
                counter++;
            }
        }
        System.out.println(Arrays.toString(even_numbers));
    }

}