package otherInterviwQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class floQast {
    public static void main(String[] args) {
        String[] logs = {
                "A:1",
                "A:1",
                "A:2",
                "A:3",
                "A:1",
                "B:1",
                "B:1",
                "B:2",
                "B:3",
                "A:3",
                "C:3",
                "C:2",
                "C:1",
                "B:1",
                "C:1"
        };
        // System.out.println(array(logs));
        System.out.println("Experienced error list of user ID " + listOfErrorUsers(logs));

    }

    public static ArrayList<String> listOfErrorUsers(String[] logs) {
        ArrayList<String> result = new ArrayList<>();

        Map<String, String> logsMaps = new HashMap<>();
        for (String each : logs) {
            logsMaps.put("" + each.charAt(2), (logsMaps.get("" + each.charAt(2)) != null) ? logsMaps.get("" + each.charAt(2)) + each.charAt(0) : "" + each.charAt(0));
        }
        for (Map.Entry<String, String> entry : logsMaps.entrySet()) {
            if (entry.getValue().contains("ABC")) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

}
