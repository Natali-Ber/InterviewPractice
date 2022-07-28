package otherInterviwQuestions;

public class Howl {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println(contains(arr,5));
    }

    static boolean contains(int[] array, int key) {
        for (final int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }
}
