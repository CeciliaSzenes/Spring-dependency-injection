package taxpackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {
    public static void main(String[] args) {
        ApplicationContext myApplicationContext = new AnnotationConfigApplicationContext(Application.class);

        System.out.println(myApplicationContext.getBean(TaxCalculator.class).calculateTaxes(23000));

    }
}
