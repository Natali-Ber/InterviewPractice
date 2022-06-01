package OOP;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodPractice {


    public static void main(String[] args) {
//FIRST INT
        testPrint(10, 40);
//SECOND INT
        System.out.println(testReturn(11, 41));
//FIRST ARRAY
        String [] days = {"Monday","Tuesday","Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"};
        printEachElement(days);
//SECOND ARRAY
        System.out.println(returnEachElement(days));
    }

//FIRST INT
    public static void testPrint(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
//SECOND INT
    public static int testReturn(int a, int b) {
        int result = a + b;
        return result;
    }
//FIRST ARRAY
public static void printEachElement(String[] array){
    for (String each : array) {
        System.out.println(each);
    }
}
//SECOND ARRAY
public static String returnEachElement(String[] array) {
    String result = "";
    for (String each : array) {

        result+=each +"\n";
    }
    return result;
}



}




