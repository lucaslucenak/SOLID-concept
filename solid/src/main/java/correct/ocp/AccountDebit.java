package correct.ocp;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public abstract class AccountDebit {
    public UUID id;

    public abstract String debit(Double value, String account);
}
