import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> employeeList = new ArrayList<>();

       
        try (BufferedReader br = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                employeeList.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }


        System.out.println("Size of the collection: " + employeeList.size());


        Collections.sort(employeeList, Collections.reverseOrder());


        System.out.println("Contents of the collection (sorted in descending order):");
        for (String employee : employeeList) {
            System.out.println(employee);
        }
    }
}
