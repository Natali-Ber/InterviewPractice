package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverceArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            int each = list.get(i);
            reversedList.add(each);
        }
        System.out.println(reversedList);
    }
}
//RESULT : [8, 7, 6, 5, 4, 3, 2, 1]