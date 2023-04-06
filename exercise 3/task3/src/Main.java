import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = input.nextDouble();

        if (a == 0) {
            System.out.println("a must not be zero");
            return;
        }

        System.out.print("Enter coefficient b: ");
        double b = input.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = input.nextDouble();

        double delta = b * b - 4 * a * c;


        double x1, x2;
        switch (numberOfRoots(delta)) {
            case 0:
                System.out.println("The equation has no real roots");
                break;
            case 1:
                x1 = -b / (2 * a);
                System.out.printf("The equation has one root: x1 = %.2f\n", x1);
                break;
            case 2:
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("The equation has two roots: x1 = %.2f, x2 = %.2f\n", x1, x2);
                break;
        }
    }


    private static int numberOfRoots(double delta) {
        if (delta > 0) {
            return 2;
        } else if (delta == 0) {
            return 1;
        } else {
            return 0;
        }

        }
    }
