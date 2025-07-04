package org.example.Excercise_1_Setting_Up_JUnit;
import org.example.Exercise_1_Setting_Up_JUnit.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(5, 3);
        assertEquals(8, result);
    }
    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        int result = calc.add(10, -3);
        assertEquals(7, result);
    }

}

