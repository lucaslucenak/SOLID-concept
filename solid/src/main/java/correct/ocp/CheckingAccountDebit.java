package correct.ocp;

public class CheckingAccountDebit extends AccountDebit {
    @Override
    public String debit(Double value, String account) {
        return "Debit made in a checking account. Id: " + id;
    }
}
