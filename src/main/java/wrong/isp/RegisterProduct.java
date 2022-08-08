package wrong.isp;

public class RegisterProduct implements RegistrationInterface{

    @Override
    public void saveOnDatabase() {
        // That one makes sense to exist here
    }

    @Override
    public void checkData() {
        // That one makes sense to exist here too
    }

    @Override
    public void sendEmailToClient() {
        // But that one doesn't make any sense to exists here, because we only need to send emails to clients, not products
    }
}
