package DependencyInjection;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String s_Message) {
        System.out.println(String.format("EmailService::sendMessage() method with message is: %s", s_Message));
    }
}
