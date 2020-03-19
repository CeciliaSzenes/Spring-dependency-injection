package taxpackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FrenchTaxCalculation implements TaxCalculation {
    public double calculateTaxes(double yearlyIncome) {
        return yearlyIncome*0.48;
    }
}
