import DataAccessObject.*;
import Singleton.*;
import Prototype.*;
import Factory.*;
import Builder.*;
import DependencyInjection.*;

public class Main {
    public static void main(String[] args) {
        Singleton_Exercise.Exercise();
        Prototype_Exercise.Exercise();
        Factory_Exercise.Exercise();
        Builder_Exercise.Exercise();
        DependencyInjection_Exercise.Exercise();
        DataAccessObject_Exercise.Exercise();
    }
}
