import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> employees = new TreeSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                employees.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Size of collection: " + employees.size());

        System.out.println("Contents in alphabetical order:");
        for (String employee : employees) {
            System.out.println(employee);
        }
    }
}