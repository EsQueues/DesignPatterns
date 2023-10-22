package Patterns.Structural.Adapter;

public class MongoDB implements NoRelationDb{

    @Override
    public void connection() {
        System.out.println("Succesfully connected to database with dependency");
    }

    @Override
    public void getDataFromJsonFile() {
        System.out.println("Analyzing data from Json file...");
    }

    @Override
    public void addDataToJsonFile() {
        System.out.println("Adding data to Json file...");
    }
}
