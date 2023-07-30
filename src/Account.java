public abstract class Account {
    protected int id;
    protected String name;

    public void performOperation(DataSource _myData) {
        _myData.execute();
    }
}
