package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AveregeNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,2,3,4,5,6,9,7));
        System.out.println(list);

        int max = list.get(0);
        int min = list.get(0);
        int sum = 0;

        for (Integer each : list) {
            sum += each;

        }
//RESULT : average = 5.0
        double average = (double) sum / list.size();

        System.out.println("average = " + average);
    }

}
