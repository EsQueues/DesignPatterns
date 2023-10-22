package Patterns.Structural.Adapter;

public class PostgresDB implements RelationalDb{
    @Override
    public void connection() {
        System.out.println("Succesfully connected to database");
    }

    @Override
    public void getDataFromTables() {
        System.out.println("Getting tables from DB");
    }

    @Override
    public void addDataToTable() {
        System.out.println("Adding some data to table");
    }
}
