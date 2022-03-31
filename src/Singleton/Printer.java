package Singleton;

public class Printer {
    private static Printer printer_Instance;

    private Printer() {
    }

    public static Printer printer_GetInstance() {
        if (printer_Instance == null) {
            printer_Instance = new Printer();
        }
        return printer_Instance;
    }

    public void Request_Print(String s_Message) {
        System.out.println(String.format("This is inside Printer::Request_Print() method with message is: \"%s\"", s_Message));
    }
}
