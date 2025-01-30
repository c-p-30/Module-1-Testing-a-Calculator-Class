import org.junit.Assert;
import org.junit.Test;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(Calculator.add(1, 2));
        System.out.println(Calculator.sub(1, 2));
        System.out.println(Calculator.mul(1, 2));
        System.out.println(Calculator.div(1, 2));

    }
}