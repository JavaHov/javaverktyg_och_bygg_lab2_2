package stringcalculator;

public class StringCalculator {


    public int add(String input) {

        if(input.length() == 0)
            return 0;

        String regex = ",|\n";
        String[] numbers = input.split(regex);

        int sum = 0;

        for(String s : numbers) {

            sum += Integer.parseInt(s);
        }

        return sum;
    }
}
