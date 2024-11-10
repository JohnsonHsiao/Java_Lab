package Lab2;

public abstract class Animal {
    private double typicalSize;
    private double typicalWeight;
    private String diet; // "Predator" or "Vegetarian"

    public Animal(double typicalSize, double typicalWeight, String diet) {
        this.typicalSize = typicalSize;
        this.typicalWeight = typicalWeight;
        this.diet = diet;
    }

    public double getTypicalSize() {
        return typicalSize;
    }

    public double getTypicalWeight() {
        return typicalWeight;
    }

    public String getDiet() {
        return diet;
    }

    // Abstract method for displaying specific information about the animal
    public abstract void displayInfo();
}



