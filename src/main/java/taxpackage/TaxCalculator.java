package taxpackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaxCalculator {

    public TaxCalculation taxCalculation;
    @Autowired
    public TaxCalculator(TaxCalculation taxCalculation){
        this.taxCalculation=taxCalculation;

    }
    public double calculateTaxes(double yearlyIncome){
        return taxCalculation.calculateTaxes(yearlyIncome);
    }
}
