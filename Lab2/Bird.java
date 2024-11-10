package Lab2;

public class Bird extends Animal {
    private String speciesName;
    private int numberOfLegs;
    private double wingspan;

    public Bird(double typicalSize, double typicalWeight, String diet, String speciesName, int numberOfLegs, double wingspan) {
        super(typicalSize, typicalWeight, diet);
        this.speciesName = speciesName;
        this.numberOfLegs = numberOfLegs;
        this.wingspan = wingspan;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public double getWingspan() {
        return wingspan;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bird Species: " + speciesName);
        System.out.println("Typical Size: " + getTypicalSize() + " meters");
        System.out.println("Typical Weight: " + getTypicalWeight() + " kg");
        System.out.println("Diet: " + getDiet());
        System.out.println("Number of Legs: " + numberOfLegs);
        System.out.println("Wingspan: " + wingspan + " meters");
    }
}
