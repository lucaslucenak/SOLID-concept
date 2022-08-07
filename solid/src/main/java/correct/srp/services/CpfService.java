package correct.srp.services;

public class CpfService {

    public boolean isCpfValid(String cpf) {
        return cpf.length() == 11;
    }
}
