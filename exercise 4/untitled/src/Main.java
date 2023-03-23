
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        RectangleArea rectangle = new RectangleArea();
        rectangle.getData();
        rectangle.computeField();
        rectangle.fieldDisplay();
    }
}
class RectangleArea {
    private int length;
    private int width;
    private int area;

    public void getData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = input.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        width = input.nextInt();
        input.close();
    }

    public void computeField() {
        area = length * width;
    }

    public void fieldDisplay() {
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is " + area);
    }
}