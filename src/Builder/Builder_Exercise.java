package Builder;

public class Builder_Exercise {
    public static void Exercise() {
        Builder builder_Item = new Builder();
        System.out.println(
                "\n" +
                "Design Pattern: Builder\n" +
                "========================================"
        );
        builder_Item.builder_House =
            new HouseBuilder()
                .build_Wall(true)
                .build_Roof(false)
                .build_Color("White")
                .build_Doors(8)
                .build_Pools(1)
                .build_Start();

        System.out.println(String.format("The house after builded is: \"%s\"", builder_Item.builder_House));
    }
}
