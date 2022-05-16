package String;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "ABBCDEE";
        //ABBCDEE
        String result= "";
        for (int i =0; i < str.length();  i++){ // i: represent all index numbers of str

            String ch =""+ str.charAt(i);

            if (!result.contains(ch)){
                result +=ch;
            }
        }
        System.out.println(result);
    }
}
//RESULT :ABCDE