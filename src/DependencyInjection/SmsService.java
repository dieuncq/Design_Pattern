package DependencyInjection;

public class SmsService implements MessageService {
    @Override
    public void sendMessage(String s_Message) {
        System.out.println(String.format("SmsService::sendMessage() method with message is: %s", s_Message));
    }
}
