package String;

public class requencyOfCharacter2 {
    public static void main(String[] args) {
        String word = "Ferrari";

        String mostUsedChar = "";
        int count = 0;

        String[] array = word.split("");

        for (int i = 0; i < array.length; i++) {
            int tempCount = 0;
            for (int j = 0; j < array.length; j++)
            {
                if (array[i].equals(array[j])) {
                    tempCount++;
                }
                if (tempCount > count) {
                    count = tempCount;
                    mostUsedChar = array[i];
                }
            }
        }
        System.out.println(count + " Most Used Char: " + mostUsedChar);

    }
}
