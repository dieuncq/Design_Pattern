package Factory;

public class Factory_Exercise {
    public static void Exercise() {
        Factory factory_Item = new Factory();
        System.out.println(
                "\nDesign Pattern: Factory\n" +
                "========================================"
        );
        Shape shape_FruitItem = factory_Item.shape_GetItem("Fruit"); shape_FruitItem.Printing();
        Shape shape_JournalItem = factory_Item.shape_GetItem("Journal"); shape_JournalItem.Printing();
        Shape shape_MedicineItem = factory_Item.shape_GetItem("Medicine"); shape_MedicineItem.Printing();
    }
}
