import java.util.ArrayList;
import java.util.List;

public class DayOne {
    public static String theSum (List<String> input) {
        int count = 0;
        for (int i=0; i<input.size(); i++) {
            int lineNumber = getNumberInString(input.get(i));
            count += lineNumber;
        }

        return Integer.toString(count);

    }

    public static int getNumberInString(String input) {
        List<String> listOfLineNumber = new ArrayList<>();
        for (int i=0; i<input.length(); i++) {
            try {
                String character = input.substring(i, i+1);
                int asNumber = Integer.parseInt(character);
                listOfLineNumber.add(Integer.toString(asNumber));

            } catch(Exception ignored) {
                if (input.substring(i).startsWith("one")) {
                    listOfLineNumber.add("1");
                } else if (input.substring(i).startsWith("two")) {
                    listOfLineNumber.add("2");
                } else if (input.substring(i).startsWith("three")) {
                    listOfLineNumber.add("3");
                } else if (input.substring(i).startsWith("four")) {
                    listOfLineNumber.add("4");
                } else if (input.substring(i).startsWith("five")) {
                    listOfLineNumber.add("5");
                } else if (input.substring(i).startsWith("six")) {
                    listOfLineNumber.add("6");
                } else if (input.substring(i).startsWith("seven")) {
                    listOfLineNumber.add("7");
                } else if (input.substring(i).startsWith("eight")) {
                    listOfLineNumber.add("8");
                } else if (input.substring(i).startsWith("nine")) {
                    listOfLineNumber.add("9");
                }
            }
        }
        String lineNumber = listOfLineNumber.getFirst() + listOfLineNumber.getLast();

        return Integer.parseInt(lineNumber);

    }

}
