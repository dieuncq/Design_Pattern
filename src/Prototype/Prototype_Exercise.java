package Prototype;

public class Prototype_Exercise {
    public static void Exercise() {
        Prototype prototype_Item = new Prototype(); System.out.println("\nDesign Pattern: Prototype");
        prototype_Item.student_Information = new Student("Nguyen Van A", "14DN2", 18);
        System.out.println(
                "========================================\n" +
                "The student_Information before clone:\n" +
                "student_Information is:\n" +
                "Name: " + prototype_Item.student_Information.s_Name + "\n" +
                "Class: " + prototype_Item.student_Information.s_Class + "\n" +
                "Age: " + prototype_Item.student_Information.i_Age
        );

        prototype_Item.student_Information_Clone = prototype_Item.student_Information.clone();
        prototype_Item.student_Information.s_Name = "Le Thi B";
        prototype_Item.student_Information.s_Class = "15DN3";
        prototype_Item.student_Information.i_Age = 20;
        System.out.println(
                "\n" +
                "The student_Information after cloned:\n" +
                "student_Information is:\n" +
                "Name: " + prototype_Item.student_Information.s_Name + "\n" +
                "Class: " + prototype_Item.student_Information.s_Class + "\n" +
                "Age: " + prototype_Item.student_Information.i_Age
        );
        System.out.println(
                "\n" +
                "student_Information_Clone is:\n" +
                "Name: " + prototype_Item.student_Information_Clone.s_Name + "\n" +
                "Class: " + prototype_Item.student_Information_Clone.s_Class + "\n" +
                "Age: " + prototype_Item.student_Information_Clone.i_Age
        );
    }
}
