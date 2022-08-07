package wrong.srp;

public class Client {
    private Long id;
    private String name;
    private String email;
    private String cpf;

    public Client(Long id, String name, String email, String cpf) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
    }

    public Client() {
    }

    // This method should be responsibility of other 2 specifics classes (ex. EmailService and CpfService)
    public boolean isValid() {
        return cpf.length() == 11 && email.contains("@");
    }
}
