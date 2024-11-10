package Lab2;

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Bird(0.7, 6.0, "Predator", "Eagle", 2, 2.3);
        LandAnimal lion = new LandAnimal(1.2, 190.0, "Predator", "Lion", 4);
        Fish shark = new Fish(5.0, 1100.0, "Predator", "Great White Shark", 5);

        System.out.println("=== Animal Information ===");
        eagle.displayInfo();
        System.out.println();
        lion.displayInfo();
        System.out.println();
        shark.displayInfo();
    }
}

