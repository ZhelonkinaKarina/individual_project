package individual_project;

public class Main {
    public static void main(String[] args) {
  
    	Garden garden = new Garden();
    	Owner gardener = new Gardener("Даня", garden);
    	
        garden.printStatus();
    }
}