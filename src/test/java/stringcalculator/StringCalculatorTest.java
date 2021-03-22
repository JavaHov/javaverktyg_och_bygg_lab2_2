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

    @Test
    void testAddOneTwo() {

        int expected = 3;
        int actual = calculator.add("1,2");

        assertEquals(expected, actual);
    }

    @Test
    void testAddTwo() {

        int expected = 2;
        int actual = calculator.add("2");
        assertEquals(expected, actual);
    }

    @Test
    void addOneTwoThreeFourFive() {

        int expected = 15;
        int actual = calculator.add("1,2,3,4,5");
        assertThat(actual).isEqualTo(expected);
    }

}