package DependencyInjection;

public class UserController {
    private MessageService messageService;

    public UserController(MessageService messageService) {
        this.messageService = messageService;
    }

    void sendMessage() {
        String s_Message = "Dependency Injection with no arguments";
        messageService.sendMessage(String.format(s_Message));
    }

    void sendMessage(String s_Message) {
        messageService.sendMessage(String.format(s_Message));
    }
}
