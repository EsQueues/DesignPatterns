package Patterns.Structural.Adapter;

public class RelatoinalDBToNonRelationDBADAPTER implements RelationalDb{
    NoRelationDb noRelationDb;
    public RelatoinalDBToNonRelationDBADAPTER(NoRelationDb noRelationDb){
        this.noRelationDb=noRelationDb;
    }


    @Override
    public void connection() {
        noRelationDb.connection();
    }

    @Override
    public void getDataFromTables() {
        noRelationDb.getDataFromJsonFile();
    }

    @Override
    public void addDataToTable() {
        noRelationDb.addDataToJsonFile();
    }
}
