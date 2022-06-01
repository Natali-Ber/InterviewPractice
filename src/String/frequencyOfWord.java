package String;

public class frequencyOfWord {

    public static void main(String[] args) {
        String str = "Cat Cat Dog Dog caT CAT";
        int frequancy = 0;

        for (int i = 0; i<=str.length()-3; i++){
            // or for (int i = 0; i<str.length()-2; i++){

            String eachSub =str.substring(i,i+3);
            //System.out.println(eachSub);
            if (eachSub.equalsIgnoreCase ("Cat")){
                frequancy++;
            }
        }
        System.out.println(" Word Cat meet " +frequancy+ " times");

    }
}
//RESULT :  Word Cat meet 4 times