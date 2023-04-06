import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        float firstNumberAipov = input.nextFloat();

        System.out.print("Enter the second number: ");
        float secondNumberAipov = input.nextFloat();


        float sum = firstNumberAipov + secondNumberAipov;
        float difference = firstNumberAipov - secondNumberAipov;
        float product = firstNumberAipov * secondNumberAipov;
        float quotient = firstNumberAipov / secondNumberAipov;


        System.out.printf("Sum: %.2f\n", sum);
        System.out.printf("Difference: %.2f\n", difference);
        System.out.printf("Product: %.2f\n", product);
        System.out.printf("Quotient: %.2f\n", quotient);
        }
    }
