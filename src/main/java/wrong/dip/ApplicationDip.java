package wrong.dip;

public class ApplicationDip {
    public static void main(String[] args) {
        CalculateTax calculateTax = new CalculateTax();
        System.out.println(calculateTax.getCalculatedTax(100.0));
        //If I want to change de tax value, I'll need to go to CalculateTax class and do the alteration
    }
}
