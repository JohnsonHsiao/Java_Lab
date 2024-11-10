package Lab2;

public class Fish extends Animal {
    private String speciesName;
    private int numberOfFins;

    public Fish(double typicalSize, double typicalWeight, String diet, String speciesName, int numberOfFins) {
        super(typicalSize, typicalWeight, diet);
        this.speciesName = speciesName;
        this.numberOfFins = numberOfFins;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public int getNumberOfFins() {
        return numberOfFins;
    }

    @Override
    public void displayInfo() {
        System.out.println("Fish Species: " + speciesName);
        System.out.println("Typical Size: " + getTypicalSize() + " meters");
        System.out.println("Typical Weight: " + getTypicalWeight() + " kg");
        System.out.println("Diet: " + getDiet());
        System.out.println("Number of Fins: " + numberOfFins);
    }
}

