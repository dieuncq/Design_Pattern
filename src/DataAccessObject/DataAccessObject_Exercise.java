package DataAccessObject;

public class DataAccessObject_Exercise {
    public static void Exercise() {
        DataAccessObject dao_Item = new DataAccessObject();
        System.out.println(
                "\n" +
                "Design Pattern: DAO\n" +
                "========================================"
        );

        dao_Item.dao_Implement.insert();
        dao_Item.dao_Implement.update();
        dao_Item.dao_Implement.delete();
        dao_Item.dao_Implement.select();
    }
}
