
import java.util.Scanner;

interface Salary {
    double salaryToPay(double hours, double rate);

    default double salaryForOvertime(double hours, double rate) {
        double overtimeHours = hours - 40;
        if (overtimeHours <= 0) {
            return 0;
        }
        return overtimeHours * rate * 1.5;
    }

    static boolean shouldReceiveBonus(int yearsOfExperience) {
        return yearsOfExperience >= 5;
    }
}

class Person {
    protected String surname;
    protected String firstName;
    protected String street;
    protected String zipCode;
    protected String city;

    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter surname: ");
        surname = scanner.nextLine();
        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter street: ");
        street = scanner.nextLine();
        System.out.print("Enter zip code: ");
        zipCode = scanner.nextLine();
        System.out.print("Enter city: ");
        city = scanner.nextLine();
    }

    public void print() {
        System.out.println("Name: " + firstName + " " + surname);
        System.out.println("Address: " + street + ", " + zipCode + " " + city);
    }
}

class Staff extends Person implements Salary {
    private String education;
    private String position;

    public void initialize1() {
        super.initialize();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter education: ");
        education = scanner.nextLine();
        System.out.print("Enter position: ");
        position = scanner.nextLine();
    }

    public void print1() {
        super.print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
    public void ratehours() {

    }

    @Override
    public double salaryToPay(double hours, double rate) {

        double regularPay = hours * rate;
        return regularPay + salaryForOvertime(hours, rate);
    }
}

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.initialize1();
        staff.print1();



        double hours = 50;
        double rate = 10;
        double salary = staff.salaryToPay(hours, rate);
        System.out.println("Salary: " + salary);

        int yearsOfExperience = 6;
        boolean shouldReceiveBonus = Salary.shouldReceiveBonus(yearsOfExperience);
        System.out.println("Should receive bonus? " + shouldReceiveBonus);
    }
}
