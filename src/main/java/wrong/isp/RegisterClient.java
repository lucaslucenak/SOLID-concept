package wrong.isp;

public class RegisterClient implements RegistrationInterface {

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
        // And that one too, because we need to send an e-mail to the client
    }
}
