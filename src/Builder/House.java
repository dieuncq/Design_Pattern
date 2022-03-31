package Builder;

public class House {
    private Boolean b_IsWall;
    private Boolean b_IsRoof = true;
    private Integer i_Doors;
    private Integer i_Pools;
    private String s_Color;

    public House(Boolean b_IsWall, Boolean b_IsRoof, Integer i_Doors, Integer i_Pools, String s_Color) {
        this.b_IsWall = b_IsWall;
        this.b_IsRoof = b_IsRoof;
        this.i_Doors = i_Doors;
        this.i_Pools = i_Pools;
        this.s_Color = s_Color;
    }

    @Override
    public String toString() {
        return
            "House { " +
            "b_IsWall=" + b_IsWall +
            ", b_IsRoof=" + b_IsRoof +
            ", i_Doors=" + i_Doors +
            ", i_Pools=" + i_Pools +
            ", s_Color='" + s_Color + '\'' +
            " }";
    }
}
