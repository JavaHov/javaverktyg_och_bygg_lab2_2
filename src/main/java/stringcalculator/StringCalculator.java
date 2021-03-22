package stringcalculator;

public class StringCalculator {


    public int add(String input) {

        if(input.length() == 0)
            return 0;

        String defaultRegex = ",|:|\n";

        String[] data;
        int sum = 0;

        if(input.startsWith("//")) {
            data = getDataFromString(input, defaultRegex);
        }
        else {

            data = input.split(defaultRegex);
        }

        for(String s : data) {

            sum += Integer.parseInt(s);
        }

        return sum;

    }

    private String[] getDataFromString(String input, String anotherRegex) {

        String[] divide = input.split("\n");
        String regex = divide[0].substring(2);

        String finalRegex = anotherRegex + "|" + regex;

        return divide[1].split(finalRegex);
    }
}
