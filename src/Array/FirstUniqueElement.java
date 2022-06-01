package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstUniqueElement {
    public static void main(String[] args) {



        String[] list = {"Layan", "Layan", "Oleksandr", "Olga"};

        for(String each :list){
            int frequency = 0;
            for (String element : list) {
                if(element == each){
                    frequency++;
                }
            }
            if(frequency == 1){
                System.out.println(each);
                break;
            }
        }
    }
}
//RESULT : 1
