import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionUnitTests {
    @Test
    public void add_int_1_and_int_2_returns_3(){
        int a = 1;
        int b = 2;
        Number expected = 3.0;
        Calculator calc = new Calculator();
        calc.push(a);
        calc.push(b);
        calc.push("+");
        Number actualAnswer = calc.value();
        assertEquals(expected, actualAnswer);
    }

    @Test
    public void add_int_2_and_int_2_returns_4(){
        int a = 2;
        int b = 2;
        Number expected = 4.0;
        Calculator calc = new Calculator();
        calc.push(a);
        calc.push(b);
        calc.push("+");
        Number actualAnswer = calc.value();
        assertEquals(expected, actualAnswer);
    }
    @Test
    public void add_operator_results_in_addition(){
        int a = 2;
        int b = 4;
        Number expected = 6.0;
        Calculator calc = new Calculator();
        calc.push(a);
        calc.push(b);
        calc.push("+");
        Number actualAnswer = calc.value();
        assertEquals(expected, actualAnswer);
    }
    @Test
    public void unknown_operator_results_in_addition(){
        int a = 2;
        int b = 4;
        Number expected = 6.0;
        Calculator calc = new Calculator();
        calc.push(a);
        calc.push(b);
        calc.push("?");
        Number actualAnswer = calc.value();
        assertEquals(expected, actualAnswer);
    }
}
