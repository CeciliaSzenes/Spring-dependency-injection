import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import taxpackage.AmericanTaxCalculation;
import taxpackage.TaxCalculator;

public class TaxCalculatorTest {
    @Test
    public void calculateTaxes(){
        //given
        TaxCalculator taxCalculator=new TaxCalculator(new AmericanTaxCalculation());
        //when
        double result=taxCalculator.calculateTaxes(1000);
        //then
        Assertions.assertEquals(1130, result);
    }
}
