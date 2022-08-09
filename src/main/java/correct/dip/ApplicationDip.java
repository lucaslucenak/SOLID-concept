package correct.dip;

public class ApplicationDip {
    public static void main(String[] args) {
        CalculateTaxInterface calculateTax = new CalculateTaxPb();
        System.out.println(calculateTax.getCalculatedTax(100.0));
        //If I want to calculate tax based on PE state:
        calculateTax = new CalculateTaxPe();
        System.out.println(calculateTax.getCalculatedTax(100.0));
    }
}
