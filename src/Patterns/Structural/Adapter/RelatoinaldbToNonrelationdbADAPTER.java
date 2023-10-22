package Patterns.Structural.Adapter;

public class RelatoinaldbToNonrelationdbADAPTER implements RelationalDb{
    NoRelationDb noRelationDb;
    public RelatoinaldbToNonrelationdbADAPTER(NoRelationDb noRelationDb){
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
