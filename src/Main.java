import DataAccessObject.DataAccessObject_Exercise;
import Singleton.*;
import Prototype.*;
import Factory.*;
import Builder.*;
import DependencyInjection.*;

public class Main {
    public static void main(String[] args) {
        new Singleton_Exercise().Exercise();
        new Prototype_Exercise().Exercise();
        new Factory_Exercise().Exercise();
        new Builder_Exercise().Exercise();
        new DependencyInjection_Exercise().Exercise();
        new DataAccessObject_Exercise().Exercise();
    }
}
