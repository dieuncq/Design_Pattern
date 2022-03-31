package Builder;

public interface IBuilder {
    IBuilder build_Wall(Boolean b_IsWall);
    IBuilder build_Roof(Boolean b_IsRoof);
    IBuilder build_Doors(Integer i_Doors);
    IBuilder build_Pools(Integer i_Pools);
    IBuilder build_Color(String s_Color);
    House build_Start();
}
