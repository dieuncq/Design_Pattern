package Builder;

public class HouseBuilder implements IBuilder {
    private Boolean b_IsWall;
    private Boolean b_IsRoof = true;
    private Integer i_Doors;
    private Integer i_Pools;
    private String s_Color;

    @Override
    public IBuilder build_Wall(Boolean b_IsWall) {
        this.b_IsWall = b_IsWall;
        return this;
    }

    @Override
    public IBuilder build_Roof(Boolean b_IsRoof) {
        this.b_IsRoof = b_IsRoof;
        return this;
    }

    @Override
    public IBuilder build_Doors(Integer i_Doors) {
        this.i_Doors = i_Doors;
        return this;
    }

    @Override
    public IBuilder build_Pools(Integer i_Pools) {
        this.i_Pools = i_Pools;
        return this;
    }

    @Override
    public IBuilder build_Color(String s_Color) {
        this.s_Color = s_Color;
        return this;
    }

    @Override
    public House build_Start() {
        return new House(b_IsWall,b_IsRoof,i_Doors,i_Pools,s_Color);
    }
}
