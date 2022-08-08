package wrong.isp;

/**
 * Let's suppose that I need to send an email every time that I make a new client register
 */
public interface RegistrationInterface {

    public void saveOnDatabase();
    public void checkData();
    public void sendEmailToClient();
}
