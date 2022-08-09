package correct.dip;

public class CalculateTaxPb implements CalculateTaxInterface {

    @Override
    public Double getCalculatedTax(Double amount) {
        return amount * 0.15;
    }
}
