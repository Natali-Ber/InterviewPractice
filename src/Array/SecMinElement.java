package Array;

public class SecMinElement {
    public static void main(String[] args) {
        int temp, size;
        int[] array = {50, 20, 30, 40,57,2,7};
        size = array.length;

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){

                if(array[i]<array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("The second MIN number is:: "+array[size-2]);
    }
}
