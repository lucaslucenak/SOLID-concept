package correct.dip;

public class CalculateTaxPe implements CalculateTaxInterface {

    @Override
    public Double getCalculatedTax(Double amount) {
        return amount * 0.30;
    }
}
