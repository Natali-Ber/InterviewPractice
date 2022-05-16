package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondLargestElenent {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,2,3,4,5,6,9,7,8,8));


        for (int i = 1; i < 2; i++) {
            list.removeIf( p -> Collections.max(list) == p);
        }

        int SecondMax = Collections.max(list);

        System.out.println(SecondMax);

    }
}
