import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter your height in meters: ");
            float heightAipov = input.nextFloat();

            System.out.print("Enter your weight in kilograms: ");
            float weightAipov = input.nextFloat();

            float bmi = weightAipov / ((heightAipov /100)* (heightAipov/100));


            String message;
            if (bmi < 16.00) {
                message = "Starvation";
            } else if (bmi < 16.99) {
                message = "Emaciation";
            } else if (bmi < 18.49) {
                message = "Underweight";
            } else if (bmi < 22.99) {
                message = "Normal, low range";
            } else if (bmi < 24.99) {
                message = "Normal, high range";
            } else if (bmi < 27.49) {
                message = "Overweight, low range";
            } else if (bmi < 29.99) {
                message = "Overweight, high range";
            } else if (bmi < 34.9) {
                message = "1st degree obesity";
            } else if (bmi < 39.9) {
                message = "2nd degree obesity";
            } else {
                message = "3rd degree obesity";
            }

            System.out.printf("Your BMI is %.2f\n", bmi);
            System.out.println("You are in the range of: " + message);        }
    }
