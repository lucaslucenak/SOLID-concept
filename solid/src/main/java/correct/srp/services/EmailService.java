package correct.srp.services;

public class EmailService {

    public boolean isEmailValid(String email) {
        return email.contains("@");
    }
}
