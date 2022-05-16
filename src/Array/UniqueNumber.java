package Array;

import java.lang.reflect.Array;

public class UniqueNumber {
    public static void main(String[] args) {

        int[] num = {1, 4, 5, 5, 8, 6, 6};

        for (int j = 0; j < num.length; j++) {
            int ch = num[j]; //'A'
            int frequency = 0;

            for (int i = 0; i < num.length; i++) {
                if(num[i] ==ch){
                    frequency++;
                }
            }
            if(frequency == 1){   // UNIQUE
           // if(frequency == 2){ //DUPLICATES
                    System.out.println(ch);
            }

        }
    }
}
//RESULT :  //1
            //4
            //8