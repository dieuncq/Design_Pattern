package DependencyInjection;

public class DependencyInjection {
    MessageService ms_Email = new EmailService();
    MessageService ms_Sms = new SmsService();
}
