import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> employeeSet = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                employeeSet.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        System.out.println("Size of the collection: " + employeeSet.size());
        System.out.println("Contents of the set:");
        for (String employee : employeeSet) {
            System.out.println(employee);
        }
        String employeeToCheck = "John Smith";
        System.out.println("\nChecking if '" + employeeToCheck + "' exists in the set...");
        if (employeeSet.contains(employeeToCheck)) {
            System.out.println("'" + employeeToCheck + "' exists in the set.");
        } else {
            System.out.println("'" + employeeToCheck + "' does not exist in the set.");
        }
    }
}
