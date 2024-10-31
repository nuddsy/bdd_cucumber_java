import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractionUnitTests {
//    @Test
//    public void subtract_operator_results_in_addition(){
//        int a = 2;
//        int b = 1;
//        Number expected = 3.0;
//        Calculator calc = new Calculator();
//        calc.push(a);
//        calc.push(b);
//        calc.push("-");
//        Number actualAnswer = calc.value();
//        assertEquals(expected, actualAnswer);
//    }

    @Test
    public void subtract_operator_results_in_subtraction(){
        int a = 2;
        int b = 1;
        Number expected = -1.0;
        Calculator calc = new Calculator();
        calc.push(a);
        calc.push(b);
        calc.push("-");
        Number actualAnswer = calc.value();
        assertEquals(expected, actualAnswer);
    }

    @Test
    public void subtract_int_2_and_int_1_returns_neg1(){
        int a = 2;
        int b = 1;
        Number expected = -1.0;
        Calculator calc = new Calculator();
        calc.push(a);
        calc.push(b);
        calc.push("-");
        Number actualAnswer = calc.value();
        assertEquals(expected, actualAnswer);
    }

    @Test
    public void subtract_int_2_and_int_3_returns_neg1(){
        int a = 2;
        int b = 3;
        Number expected = -1.0;
        Calculator calc = new Calculator();
        calc.push(a);
        calc.push(b);
        calc.push("+");
        Number actualAnswer = calc.value();
        assertEquals(expected, actualAnswer);
    }
}
