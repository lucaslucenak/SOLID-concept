package correct.srp;

import correct.srp.services.CpfService;
import correct.srp.services.EmailService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

    public boolean isValid() {
        EmailService emailService = new EmailService();
        CpfService cpfService = new CpfService();
        return emailService.isEmailValid(email) && cpfService.isCpfValid(cpf);
    }
}
