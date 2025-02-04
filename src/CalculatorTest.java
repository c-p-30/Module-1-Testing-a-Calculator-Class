import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(3, Calculator.add(1, 2));
        assertEquals(-1, Calculator.add(1,-2));
        assertEquals(0, Calculator.add(1,-1));
    }

    @org.junit.jupiter.api.Test
    void sub() {
        assertEquals(3, Calculator.sub(5, 2));
        assertEquals(3, Calculator.sub(1,-2));
        assertEquals(0, Calculator.sub(1,1));
    }

    @org.junit.jupiter.api.Test
    void mul() {
        assertEquals(2, Calculator.mul(1, 2));
        assertEquals(-2, Calculator.mul(1,-2));
        assertEquals(0, Calculator.mul(1,0));
    }

    @org.junit.jupiter.api.Test
    void div() {
        assertEquals(2.5, Calculator.div(5, 2));
        assertEquals(-0.5, Calculator.div(1,-2));

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Calculator.div(8,0);
        });

        assertEquals("Dividing by zero", exception.getMessage());
    }
}