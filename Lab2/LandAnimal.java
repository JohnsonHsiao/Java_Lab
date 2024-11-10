package Lab2;

public class LandAnimal extends Animal {
    private String speciesName;
    private int numberOfLegs;

    public LandAnimal(double typicalSize, double typicalWeight, String diet, String speciesName, int numberOfLegs) {
        super(typicalSize, typicalWeight, diet);
        this.speciesName = speciesName;
        this.numberOfLegs = numberOfLegs;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public void displayInfo() {
        System.out.println("Land Animal Species: " + speciesName);
        System.out.println("Typical Size: " + getTypicalSize() + " meters");
        System.out.println("Typical Weight: " + getTypicalWeight() + " kg");
        System.out.println("Diet: " + getDiet());
        System.out.println("Number of Legs: " + numberOfLegs);
    }
}
