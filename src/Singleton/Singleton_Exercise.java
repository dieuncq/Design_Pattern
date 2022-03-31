package Singleton;

public class Singleton_Exercise {
    public static void Exercise() {
        Singleton singleton_Item = new Singleton();
        System.out.println(
                "\n" +
                "Design Pattern: Singleton\n" +
                "========================================"
        );
        singleton_Item.printer_Item.Request_Print("Request printing to Printer by Singleton pattern");
    }
}
