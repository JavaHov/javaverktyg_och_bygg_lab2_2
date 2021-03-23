package stringcalculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {


    public int add(String string) {


        if(string.length() == 0)
            return 0;

        char[] charArray = string.toCharArray();
        List<Integer> intList = new ArrayList<>();

        for(int i = 0; i < charArray.length; i++) {

            if(Character.isDigit(charArray[i])) {

                StringBuilder sb = new StringBuilder();
                while(i < charArray.length && Character.isDigit(charArray[i]) ) {

                    sb.append(charArray[i]);
                    i++;
                }
                int temp = Integer.parseInt(sb.toString());
                if(temp >= 0 && temp <= 1000)
                    intList.add(temp);
            }
        }
        int result = intList.stream().mapToInt(i -> i).sum();
        return result;
    }
}
