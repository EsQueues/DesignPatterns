package Patterns.Structural.Adapter;


public class SystemMain {

    public static void main(String[] args) {
//        RelationalDb postgresDB= new PostgresDB();
//        dbTest(postgresDB);


        NoRelationDb mongoDB=new MongoDB();
        RelationalDb mongoAdapter=new RelatoinalDBToNonRelationDBADAPTER(mongoDB);

        dbTest(mongoAdapter);
    }
    static void dbTest(RelationalDb relationalDb){
        relationalDb.getDataFromTables();
        relationalDb.addDataToTable();
    }
}
