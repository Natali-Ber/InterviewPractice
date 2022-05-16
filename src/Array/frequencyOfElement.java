package Array;

public class frequencyOfElement {
    public static void main(String[] args) {


        int[] num = {1,4,5,5,8,6,6};
        int frequencyOfElement= frequencyOfElement(num,5);
        System.out.println(frequencyOfElement);
 //RESULT   2

        String[] words = {"Java", "Pyton","Java"};
        int frequencyOfElementString= frequencyOfElement(words,"Java");
        System.out.println(frequencyOfElementString);
 //RESULT   2
    }

//Int
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;
    }
//String
    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;
    }
}
