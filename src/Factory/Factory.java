package Factory;

public class Factory {
    public Shape shape_GetItem(String s_Type) {
        if (s_Type == null) {
            return null;
        }

        if (s_Type.equalsIgnoreCase("Fruit")) {
            return new Fruit();
        }
        else if (s_Type.equalsIgnoreCase("Journal")) {
            return new Journal();
        }
        else if (s_Type.equalsIgnoreCase("Medicine")) {
            return new Medicine();
        }
        else {
            return null;
        }
    }
}
