package stringcalculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator calculator = new StringCalculator();

    @Test
    void testEmptyString() {

        int expected = 0;
        int actual = calculator.add("");

        assertEquals(expected, actual);
    }

}