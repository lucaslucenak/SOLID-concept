package wrong.ocp;

public class AccountDebit {

    public void debit(Double value, String account, AccountType accountType) {
        if (accountType == AccountType.CHECKING_ACCOUNT) {
            System.out.println("Debit made in a checking account");
        }
        if (accountType == AccountType.SAVING_ACCOUNT) {
            System.out.println("Debit made in a saving account");
        }
    }
}
