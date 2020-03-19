package taxpackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@Primary
public class BelgianTaxCalculation implements TaxCalculation {
    @Bean
    public double calculateTaxes(double yearlyIncome) {
        return yearlyIncome*0.45;
    }
}
