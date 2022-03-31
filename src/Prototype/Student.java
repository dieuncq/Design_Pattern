package Prototype;

public class Student implements Cloneable {
    public String s_Name;
    public String s_Class;
    public Integer i_Age;

    public Student(String s_Name, String s_Class, Integer i_Age) {
        this.s_Name = s_Name;
        this.s_Class = s_Class;
        this.i_Age = i_Age;
    }

    @Override
    protected Student clone() {
        try {
            return (Student) super.clone();
        }
        catch (CloneNotSupportedException exception_Error) {
            exception_Error.getStackTrace();
        }
        return null;
    }
}
