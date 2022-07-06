package otherInterviwQuestions;

public class proofPoint {

    static proofPoint instance;
    String stateVariable;

    proofPoint(String theVar) {
        stateVariable = theVar;
    }

    public static void main(String[] argc) {
        // String theValue = null;
        String theValue = "sharp objects";
        proofPoint instance = getInstance(theValue);
        theValue = "no sharp objects";
        instance.run();
    }

    static proofPoint getInstance(String theValue) {

        if (theValue != null) {
            instance = new proofPoint(theValue);

        }
        return instance;


    }
    void run (){
        System.out.println("Running with " + stateVariable);
    }

}
