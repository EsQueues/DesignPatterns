package Patterns.Structural.Adapter;

public interface RelationalDb {
    public void connection();
    public void getDataFromTables();
    public void addDataToTable();
}
