import java.util.ArrayList;
import java.util.Arrays;

public class lab1 {
    public static void main(String[] args) {
        // Part 1 - Array
        int[] x = {3, 8, 7, 5, 9};
        int[] y = {4, 6, 2, 10, 1};
        int[] z = new int[5];
        
        // Find the maximum of respective elements in x and y
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }
        
        // Display the arrays
        System.out.println("Array x = " + Arrays.toString(x));
        System.out.println("Array y = " + Arrays.toString(y));
        System.out.println("Array z = x + y = " + Arrays.toString(z));
        
        // Part 2 - ArrayList
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Alice", "Brian", "Cindy", "David", "Ellen"));
        ArrayList<String> switchedNames = new ArrayList<>();
        
        // Switch first and last letters of each name
        for (String name : names) {
            if (name.length() > 1) {
                String newName = name.charAt(name.length() - 1) + name.substring(1, name.length() - 1) + name.charAt(0);
                switchedNames.add(newName.substring(0, 1).toUpperCase() + newName.substring(1).toLowerCase());
            } else {
                switchedNames.add(name); // Handle single-letter names if any
            }
        }
        
        // Display the names list
        System.out.println("Names = " + names.toString().replace("[", "{").replace("]", "}"));
        System.out.println("Names (switched) = " + switchedNames.toString().replace("[", "{").replace("]", "}"));
    }
}
