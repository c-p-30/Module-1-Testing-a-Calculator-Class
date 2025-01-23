import org.junit.Assert;
import org.junit.Test;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(1, 2));
        System.out.println(calc.sub(1, 2));
        System.out.println(calc.mul(1, 2));
        System.out.println(calc.div(1, 2));


        }

    @Test
    public void testAdd;{
        Assert.assertEquals(21, Calculator.add(7,14 ) ) ;
    }
}