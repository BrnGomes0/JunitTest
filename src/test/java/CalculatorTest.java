import org.example.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test // Annotation Test Automatized
    public void deveriaSomarDoisNumerosPositivos(){
        Calculator calculator = new Calculator();
        int soma = calculator.plus(2, 3);
    }


}