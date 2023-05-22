import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

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

        System.out.println("Contents using a standard loop:");
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }


        System.out.println("\nContents using the for-each loop:");
        for (String employee : employeeList) {
            System.out.println(employee);
        }


        System.out.println("\nContents using the Iterator interface:");
        Iterator<String> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}