package LOOP;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        // +1 +2 +3 .... +100

        for (int i = 1; i < 101 ; i++) { //i: 1,2,3,4,5,6... 100
            sum += i;
        }

        System.out.println(sum); //5050

        System.out.println("++++++++++++++++++++");


        int sum2 = 0;
        int n = 10;
        // +1 +2 +3 .... +100

        for (int i = 1; i < n ; i++) { //i: 1,2,3,4,5,6... 100
            sum += i;
        }

        System.out.println(sum); //5050
    }

}
