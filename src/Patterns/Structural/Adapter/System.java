package Patterns.Structural.Adapter;


public class System {

    public static void main(String[] args) {
        RelationalDb postgresDB= new PostgresDB();

        NoRelationDb mongoDB=new MongoDB();
        RelationalDb mongoAdapter=new RelatoinaldbToNonrelationdbADAPTER(mongoDB);

        dbTest(postgresDB);
        dbTest(mongoAdapter);
    }
    static void dbTest(RelationalDb relationalDb){
        relationalDb.getDataFromTables();
        relationalDb.addDataToTable();
    }
}
