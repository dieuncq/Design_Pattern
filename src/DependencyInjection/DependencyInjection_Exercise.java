package DependencyInjection;

public class DependencyInjection_Exercise {
    public static void Exercise() {
        DependencyInjection dependencyInjection = new DependencyInjection();
        System.out.println(
                "\n" +
                "Design Pattern: Dependency Injection\n" +
                "========================================"
        );

        UserController uc_Email = new UserController(dependencyInjection.ms_Email);
        uc_Email.sendMessage("Dependency Injection");
        uc_Email.sendMessage();

        UserController uc_Sms = new UserController(dependencyInjection.ms_Sms);
        uc_Sms.sendMessage("Dependency Injection");
        uc_Sms.sendMessage();
    }
}
