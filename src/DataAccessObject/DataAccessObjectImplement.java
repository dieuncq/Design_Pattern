package DataAccessObject;

public class DataAccessObjectImplement implements IDataAccessObject {

    @Override
    public void insert() {
        System.out.println("DataAccessObjectImplement::insert() method");
    }

    @Override
    public void update() {
        System.out.println("DataAccessObjectImplement::update() method");
    }

    @Override
    public void delete() {
        System.out.println("DataAccessObjectImplement::delete() method");
    }

    @Override
    public void select() {
        System.out.println("DataAccessObjectImplement::select() method");
    }
}
