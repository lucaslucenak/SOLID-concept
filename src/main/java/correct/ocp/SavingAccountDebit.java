package correct.ocp;

public class SavingAccountDebit extends AccountDebit {
    @Override
    public String debit(Double value, String account) {
        return "Debit made in a saving account. Id: " + id;
    }
}
