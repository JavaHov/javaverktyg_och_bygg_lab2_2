package stringcalculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
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

    @Test
    void testNewLineDelimiter() {

        int expected = 6;
        int actual = calculator.add("1,2\n3");
        assertThat(expected).isEqualTo(actual);

    }

    @Test
    void testDifferentDelimiters() {

        int expected = 6;
        int actual = calculator.add("//;\n1;2,3");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void moreTestWithDifferent() {

        int expected = 15;
        int actual = calculator.add("//_\n1,2_3:4_5");
        assertThat(expected).isEqualTo(actual);

    }

    @Test
    void testNegativeThrowsException() {

        assertThatThrownBy(()-> calculator.add("1,-4"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void testNotAddingOverThousand() {

        int expected = 7;
        int actual = calculator.add("1,2,1001,4");
        assertThat(actual).isEqualTo(expected);
    }

}